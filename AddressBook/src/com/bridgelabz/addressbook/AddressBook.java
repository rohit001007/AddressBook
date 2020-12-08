package com.bridgelabz.addressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class AddressBook extends Person implements AddressBookInterface {

    private static final String CSV_HEADER = "FristName,LastName,MobileNo,State,City,Zip";
    Person pr = new Person();
    private static String filePath = "abc.csv";
    FileWriter fileWriter = null;
    private static Formatter x;
    private static Scanner y;
    private static String choice, name;

    public void addPerson() {

        String addbook;
        FileWriter fileWriter = null;
        Scanner scanner = new Scanner(System.in);
        AddressBookManager addBookManager = new AddressBookManager();
        List<Person> user = new ArrayList<>();

        System.out.println("\n Enter First Name : ");
        String firstName=scanner.next();
        pr.setFristName(firstName);

        System.out.println("\n Enter Last Name : ");
        String lastName=scanner.next();
        pr.setLastName(lastName);

        System.out.println("\n Enter Mobile Number");
        long mobileNumber=scanner.nextLong();
        pr.setMobileNumber(mobileNumber);

        System.out.println("\n Enter State : ");
        String state=scanner.next();
        Address address=new Address();
        address.setState(state);

        System.out.println("\n Enter City Name : ");
        String city=scanner.next();
        address.setCity(city);

        System.out.println("\n Enter Zip Code : ");
        int zip=scanner.nextInt();
        address.setZip(zip);

        System.out.println("\n1: For Save Data In File ");
        System.out.println("2: For Skip Data In File ");
        System.out.println("\n Enter Your Choice : ");

        int i=scanner.nextInt();
        if (i==1) {

            try {
                fileWriter = new FileWriter(filePath,true);

                BufferedWriter bw = new BufferedWriter(fileWriter);
                PrintWriter pw= new PrintWriter(bw);

                fileWriter.append("");
                pw.println(pr.getFristName()+","+pr.getLastName()+","+pr.getMobileNumber()+","+address.getState()+","+address.getCity()+","+address.getZip());

                pw.flush();
                pw.close();

                System.out.println("\n Done..!");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("\n Error Found....!!! ");
            }
            System.out.println("\n * Data Has Been Saved *");
        }
        else {
            System.out.println("\n Data Not Saved..!");
        }
    }//addPerson()

    public void display() {
        String fileName="C:\\Users\\Radhe\\IdeaProjects\\AddressBook\\abc.csv";
        File file=new File(fileName);

        try {
            Scanner inputStream = new Scanner(new File(fileName));
            while(inputStream.hasNext()) {
                String data=(inputStream.next());
                System.out.println(data);
            }
            System.out.println("\n =============================\n");
            inputStream.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }//display()

    public void searchPerson(String searchWord) {

        boolean found =false;

        String firstName=""; String lastName=""; String mobNo=""; String city=""; String state=""; String zip="";

        try
        {
            y=new Scanner(new File("abc.csv"));
            y.useDelimiter("[,\n]");
            while(y.hasNext() && found==false)
            {
                firstName=y.next();
                lastName=y.next();
                mobNo=y.next();
                city=y.next();
                state=y.next();
                zip=y.next();
                if(mobNo.equals(searchWord))
                {
                    found=true;
                    System.out.println(firstName+","+lastName+","+mobNo+","+city+","+state+","+zip);
                }
                else
                {
                    System.out.println(" ");
                }
            }
        }
        catch(Exception E)
        {
            System.out.println("\n Error Found....!!");
        }
    }
    public void editPerson() {

    }//editPerson()

    public void deletePerson(String searchWord) {

        String tempFile="tempFile.csv";
        File oldFile=new File(filePath);
        File newFile=new File(tempFile);
        String firstName=""; String lastName=""; String mobNo=""; String city=""; String state=""; String zip="";

        try {
            FileWriter fw=new FileWriter(tempFile,true);
            BufferedWriter bw =new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            y=new Scanner(new File(filePath));
            y.useDelimiter("[,\n]");

            while (y.hasNext()) {
                firstName=y.next();
                lastName=y.next();
                mobNo=y.next();
                city=y.next();
                state=y.next();
                zip=y.next();

                if(!mobNo.equals(searchWord)) {
                    pw.println(firstName+","+lastName+","+mobNo+","+city+","+state+","+zip);
                }
            }
            y.close();
            pw.flush();
            pw.close();

            oldFile.delete();
            File dump=new File(filePath);
            newFile.renameTo(dump);

            System.out.println("\n Done...!!");
        } catch (Exception e) {
            System.out.println("\n Error Found...!!");
        }
    }//deletePerson()

    public void sortByName() {

    }//sortByName()

    public void sortByZip() {

    }//sortByZip()

}//AddressBook class
