package com.example.med_care;

public class hospitalhelper {
   String address,ambulance,beds,bloodbank,hosid,name,password,phone,pluscode,reg_no;

    public hospitalhelper(String address, String ambulance, String beds, String bloodbank, String hosid, String name, String password, String phone, String pluscode, String reg_no) {
        this.address = address;
        this.ambulance = ambulance;
        this.beds = beds;
        this.bloodbank = bloodbank;
        this.hosid=hosid;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.pluscode = pluscode;
        this.reg_no = reg_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(String ambulance) {
        this.ambulance = ambulance;
    }

    public String getBeds() {
        return beds;
    }

    public void setBeds(String beds) {
        this.beds = beds;
    }

    public String getBloodbank() {
        return bloodbank;
    }

    public void setBloodbank(String bloodbank) {
        this.bloodbank = bloodbank;
    }

    public String getHosid() {
        return hosid;
    }

    public void setHosid(String hosid) {
        this.hosid = bloodbank;
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

    public String getPluscode() {
        return pluscode;
    }

    public void setPluscode(String pluscode) {
        this.pluscode = pluscode;
    }

    public String getreg_no() {
        return reg_no;
    }

    public void setUsername(String username) {
        this.reg_no = reg_no;
    }
}
