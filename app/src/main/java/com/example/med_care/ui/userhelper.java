package com.example.med_care.ui;

public class userhelper {
    String name,username,email,phone,password;
    public userhelper(String username, String userid, String usermail, String userpass, String usermob) {
        this.name=username;
        this.username=userid;
        this.email=usermail;
        this.password=userpass;
        this.phone=usermob;
       // this.gender=

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   /* public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }*/
}
