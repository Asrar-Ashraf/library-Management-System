class Borrow_model {
    private String name;
    private  String book_name;
    private  String phone_no;
    private  String address;
    private  String  issue_Data;
    private  String Duration;
    private String return_data;

    public Borrow_model() {
    }

    public Borrow_model(String name, String book_name, String phone_no, String address, String issue_Data, String duration, String return_data) {
        this.name = name;
        this.book_name = book_name;
        this.phone_no = phone_no;
        this.address = address;
        this.issue_Data = issue_Data;
        Duration = duration;
        this.return_data = return_data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIssue_Data() {
        return issue_Data;
    }

    public void setIssue_Data(String issue_Data) {
        this.issue_Data = issue_Data;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getReturn_data() {
        return return_data;
    }

    public void setReturn_data(String return_data) {
        this.return_data = return_data;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", book_name='" + book_name + '\'' +
                        ", phone_no='" + phone_no + '\'' +
                        ", address='" + address + '\'' +
                        ", issue_Data='" + issue_Data + '\'' +
                        ", Duration='" + Duration + '\'' +
                        ", return_data='" + return_data + '\'';

    }
}
