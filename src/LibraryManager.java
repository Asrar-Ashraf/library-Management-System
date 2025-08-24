import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryManager {
    int count = 0;
    private String author;
    private double price;
    book_library bl = new book_library(); // create book
    List<Book> booklist = bl.BookList();  // take predefined list store
    List<String> temp = new ArrayList<>(); // for find function purpose store find data
    List<Borrow_model> borrowUser = new ArrayList<>(); // store data of borrow people
    List<User_Info> userInfo = new ArrayList<>();
    // method of find book from book library in return type boolean
    public boolean findbook(String title){
        temp.clear();
        count=0;
        boolean isCheck = false;
        for (int i = 0; i <booklist.size(); i++) {
            String storeTitle = booklist.get(i).getTitle();
            if (booklist.get(i).getTitle().equalsIgnoreCase(title)){
                author = booklist.get(i).getAuthor();
                price = booklist.get(i).getPrice();
                temp.add(storeTitle + " , " + author + " , " + price);
                isCheck = true;
            }
        }
        return isCheck;
    }
    //end and next function is start
    // method of find book from book library....
    public void findBook(String title){
        temp.clear();
        count=0;
        boolean isCheck = true;
        for (int i = 0; i <booklist.size(); i++) {
            String storeTitle = booklist.get(i).getTitle();
            if (booklist.get(i).getTitle().equalsIgnoreCase(title)){
                author = booklist.get(i).getAuthor();
                price = booklist.get(i).getPrice();
                temp.add(storeTitle + " , " + author + " , " + price);
                isCheck = false;
            }
        }
        if (isCheck){
            System.out.println("com.bookmanagement.model.service.util.Book is Not Available..");
        }else {
            System.out.println("Find com.bookmanagement.model.service.util.Book.....");
        }

        for (var display: temp){
            count++;
            System.out.println(count + ": " + display);
        }

    }
    // end function
    // Add data of book in list
    //  ("God Emperor of Dune", "Frank Herbert", 1981, 14.99, "Sci-Fi", "978-0-441-17273-3")
    void  addNewBook(String title,String Author_Name, int Year ,double Price , String Category , String ISBN){
        Book  temp = new Book(title,Author_Name,Year,Price,Category,ISBN);
        bl.BookList().add(temp);
    }

    // end function
    //---
    // start next(Third) method of Remove book from List
    boolean removeBookData(String title){
        boolean ischeck = false;
        Iterator<Book> iterable = booklist.iterator();
        while (iterable.hasNext()){
            if (iterable.next().getTitle().equalsIgnoreCase(title)){
                ischeck = true;
                iterable.remove();
            }
        }
        return ischeck;
    }
    //end function

    //start next function Of Update com.bookmanagement.model.service.util.Book data

    void update_book_data(String oldTitle,String newTitle,String Author_Name, int Year ,int Price , String Category , String ISBN){
        boolean isCheck = true;
        for (int i = 0; i < booklist.size(); i++) {
            if (booklist.get(i).getTitle().equalsIgnoreCase(oldTitle)){
                Book book = new Book(newTitle,Author_Name,Year,Price,Category,ISBN);
                booklist.set(i,book);
                isCheck = false;
            }
        }
        if (isCheck){
            System.out.println("com.bookmanagement.model.service.util.Book not available in library so not data update...");
        } else {
            System.out.println("your are record update successfully");
        }
    }
    // end update function....
    // start next function full list ...
    void displayFullRecord(){
        int count = 0;
        for(var display: booklist){
            count++;
            System.out.println(count + ":  " + display);
        }
    }
    // end full list function ........
    //  next Step to manage the User Data,
    // store user data
    void storeUserInfo(String name , String email , String address , String phone_no , String gender){
        if (email.endsWith("@gmail.com") && (phone_no.length() == 11) && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))){
            User_Info userInfo1 = new User_Info();
            userInfo1.setFullName(name);
            userInfo1.setEmail(email);
            userInfo1.setAddress(address);
            userInfo1.setPhone_no(phone_no);
            userInfo1.setGender(gender);
            userInfo.add(userInfo1);
            System.out.println("successfully add user data");

        }else {
            System.out.println("Invalid input data");
        }
    }
    // end store user data function..
    // start update user data
    void updateUserData(String old_name,String name , String email , String address , String phone_no , String gender){
        boolean isCheck=true;
        if (email.endsWith("@gmail.com") && (phone_no.length() == 11) && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))){
            for (int i = 0; i <userInfo.size(); i++) {
                String check_name = userInfo.get(i).getFullName();
                if (check_name.equalsIgnoreCase(old_name)){
                    userInfo.get(i).setFullName(name);
                    userInfo.get(i).setEmail(email);
                    userInfo.get(i).setAddress(address);
                    userInfo.get(i).setPhone_no(phone_no);
                    userInfo.get(i).setGender(gender);
                    isCheck=false;
                }
            }
            if (isCheck){
                System.out.println("Not Match Name in list");
            }else {
                System.out.println("successfully update record");
            }
        }else {
            System.out.println("Invalid input data");
        }
    }
    //end update user data function.
    // Remove user Entry form list
    void removeUserEntry(String Name){
        boolean isCheck= true;
        Iterator<User_Info> iterator = userInfo.iterator();
        while (iterator.hasNext()){
            String name = iterator.next().getFullName();
            if (name.equalsIgnoreCase(Name)){
                iterator.remove();
                isCheck=false;
            }
        }
        if (isCheck){
            System.out.println("Invalid find Entry");
        }else {
            System.out.println("Successfully Remove entry");
        }
    }
    // end Remove Entry function
    // start show list of user
    List<User_Info> displayUserData(){
        return  userInfo;
    }
    // end display User Data function....
    //Next step Borrow and return system...
    // Member ko book issue karna
    void  borrow_Book(String user_name, String book_name , String phone_no, String address, String issue_data, String return_data){
        if (findbook(book_name)){
            if (phone_no.length() == 11){
                Borrow_model bm = new Borrow_model();
                bm.setName(user_name);
                bm.setBook_name(book_name);
                bm.setPhone_no(phone_no);
                bm.setAddress(address);
                bm.setIssue_Data(issue_data);
                bm.setReturn_data(return_data);
                borrowUser.add(bm);
                System.out.println("successfully...");
            } else {
                System.out.println("invalid Phone Number");
            }
        } else {
            System.out.println("invalid book in library");
        }
    }
    // end borrow book function.....
// next function return borrow book in library
    void returnBorrowBook(String bookName, String issueData){
        if (!borrowUser.isEmpty()) {
            boolean isCheck = true;
            Iterator<Borrow_model> iterator = borrowUser.iterator();
            while (iterator.hasNext()) {
                Borrow_model bl = iterator.next();
                String bname = bl.getBook_name();
                String idata = bl.getIssue_Data();
                if (bname.equalsIgnoreCase(bookName) && idata.equalsIgnoreCase(issueData)) {
                    isCheck = false;
                    iterator.remove();
                    break;
                }
            }
            if (isCheck) {
                System.out.println("not book borrow on this data(" + issueData + ")");
            } else {
                System.out.println("return book is successfully..");
            }
        }else {
            System.out.println("list is empty");
        }
    };

    // end return borrow book function and next start....
    // next function is get borrow book it mean count the strength of borrow book
    void  getBorrowBook(){
        int count = 0;
        for (int i = 0; i <borrowUser.size(); i++) {
            String name = borrowUser.get(i).getName();
            String book_name = borrowUser.get(i).getBook_name();
            String issueData = borrowUser.get(i).getIssue_Data();
            count++;
            System.out.println(count + ": Name: " + name  + ", com.bookmanagement.model.service.util.Book Name ; " + book_name + ", Issue Data : " + issueData);
        }
    }
}
