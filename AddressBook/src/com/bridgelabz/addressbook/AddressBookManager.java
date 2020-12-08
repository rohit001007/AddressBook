package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookManager implements AddressBookManagerInterface {

    public void newAddressBook() {
        AddressBook ab=new AddressBook();
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter Book Name : ");
        String name =sc.next();


        System.out.println("\n---------------------");
        System.out.println(" 1: For Add Person ");
        System.out.println("\n Enter Your Choice : ");
        System.out.println("---------------------");

        int choice =sc.nextInt();
        switch (choice) {
            case 1:
                ab.addPerson();
        }
    }//newAddressBook()

    public void openAddressBook() {

        AddressBook ab=new AddressBook();
        ab.display();
    }//openAddressBook()

    public void saveAddressBook() {

        AddressBook ab=new AddressBook();
    }//saveAddressBook()

    public void saveAsAddressBook() {

    }//SaveAsAddressBook()

    public void quit() {

    }//quit()
}//AddressBookMng class