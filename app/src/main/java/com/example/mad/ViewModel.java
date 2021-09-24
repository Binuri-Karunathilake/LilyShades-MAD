package com.example.mad;

public class ViewModel {
    String fName,sName,addLine1,addLine2,region,city,mobile;

    public ViewModel() {
    }

    public ViewModel(String fName, String sName, String addLine1, String addLine2, String region, String city, String mobile) {
        this.fName = fName;
        this.sName = sName;
        this.addLine1 = addLine1;
        this.addLine2 = addLine2;
        this.region = region;
        this.city = city;
        this.mobile = mobile;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getAddLine1() {
        return addLine1;
    }

    public void setAddLine1(String addLine1) {
        this.addLine1 = addLine1;
    }

    public String getAddLine2() {
        return addLine2;
    }

    public void setAddLine2(String addLine2) {
        this.addLine2 = addLine2;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
