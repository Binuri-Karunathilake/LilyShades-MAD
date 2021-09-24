package com.example.mad;

public class Delivery {
    private String fName;
    private String sName;
    private String addLine1;
    private String addLine2;
    private String region;
    private String city;
    private int mobile;

    //constructor
    public Delivery() {
    }

    public Delivery(String fName, String sName, String addLine1, String addLine2, String region, String city, int mobile) {
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

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}
