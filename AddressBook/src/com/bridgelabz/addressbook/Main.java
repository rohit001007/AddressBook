package com.bridgelabz.addressbook;

import java.util.Scanner;

public class Main {

    public void options() {

        System.out.println("\n ***** ADDRESS BOOK *****");
        System.out.println("\n1 : Create New Address Book");
        System.out.println("2 : Open Address Book");
        System.out.println("3 : Save Address Book");
        System.out.println("4 : SaveAs New Address Book");
        System.out.println("5 : Exit ");
        System.out.println("\n Enter Your Choice : ");
    }

    public static void write(String filePath) {

    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Main mn=new Main();
        AddressBookManager addBookManager=new AddressBookManager();
        AddressBook ab = new AddressBook();

        for(int i=1;i>0;i++) {

            mn.options();
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    addBookManager.newAddressBook();
                    mn.options();
                    break;

                case 2:
                    System.out.println("\n1 : Display");
                    System.out.println("2 : AddPerson");
                    System.out.println("3 : DeletePerson");
                    System.out.println("4 : Search Person");
                    System.out.println("5 : Exit");
                    System.out.println("\n Enter Your Choice : ");

                    int choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            addBookManager.openAddressBook();
                            break;

                        case 3:
                            String searchWord2;

                            System.out.println("\n Please Enter Mobile Number For Delete Person's Details : ");
                            searchWord2 = scanner.next();
                            ab.deletePerson(searchWord2);
                            break;

                        case 4:
                            String searchWord;
                            System.out.println("\n Please Enter Mobile Number For Searching Person's Details : ");
                            searchWord = scanner.next();
                            ab.searchPerson(searchWord);
                            break;

                        case 5:
                            break;
                    }
                    break;

                case 3:
                    addBookManager.saveAddressBook();
                    break;

                case 4:
                    addBookManager.saveAsAddressBook();
                    break;

                case 5:
                    break;

            }//switch
        }//for
    }//main()
}//mainclass