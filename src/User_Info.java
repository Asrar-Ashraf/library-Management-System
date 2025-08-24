class User_Info {
    private String fullName;
    private  String email;
    private  String phone_no;
    private  String gender;
    private  String address;
    User_Info(){};

    public User_Info(String fullName, String email, String phone_no, String gender, String address) {
        this.fullName = fullName;
        this.email = email;
        this.phone_no = phone_no;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
                "fullName='" + fullName + '\'' +
                        ", email='" + email + '\'' +
                        ", phone_no=" + phone_no +
                        ", gender='" + gender + '\'' +
                        ", address='" + address + '\''
                ;
    }
}
