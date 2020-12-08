package com.bridgelabz.addressbook;

public class Address {

    private String city;
    private String state;
    private int zip;

    public void setCity(String city) {
        this.city=city;
    }//setCity()

    public String getCity() {
        return city;
    }//getCity()

    public void setState(String state) {
        this.state=state;
    }//setState()

    public String getState() {
        return state;
    }//getState()

    public void setZip(int zip) {
        this.zip=zip;
    }//setZip()

    public int getZip() {
        return zip;
    }//getZip()

    @Override
    public String toString() {
        return " Address [City : " + city + ", State : " + state + ", Zip Code : " + zip + "]";
    }
}//Address class