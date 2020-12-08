package com.bridgelabz.addressbook;

public class Person extends Address {

    private String firstName;
    private String lastName;
    private long mobileNumber;
    Address address=new Address();

    public void setFristName(String firstName) {
        this.firstName = firstName;
    }//setFristName()

    public String getFristName() {
        return firstName;
    }//getFristNamev()

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//setLastName()

    public String getLastName() {
        return lastName;
    }//getLastName()

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }//setMobileNumber()

    public long getMobileNumber() {
        return mobileNumber;
    }//getMobileNumber()

    public void setAddress(Address address) {
        this.address = address;
    }//setAddress

    public Address getAddress(Address address) {
        return address;
    }//getAddress

    @Override
    public String toString() {
        return " Person [First Name : " + firstName + ", Last Name : " + lastName + ", Mobile Number : " + mobileNumber
                + ", Address : " + address + "]";
    }
}//class