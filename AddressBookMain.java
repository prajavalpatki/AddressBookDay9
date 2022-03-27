package com.Bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        Contacts contact = new Contacts("Prajwal", "Patki ", "Katraj ", "Pune ",
                "MH", 411046l, 9767044762l, "prajavalpatki@gmail.com ");
        System.out.println("Name : " +contact.getFirstName()+ " " +contact.getLastName());
        System.out.println("Address : " +contact.getAddress());
        System.out.println("City : " +contact.getCity());
        System.out.println("State : " +contact.getState());
        System.out.println("Zip Code : " +contact.getZip());
        System.out.println("Phone Number : " +contact.getPhoneNumber());
        System.out.println("E-Mail Id : " +contact.getEmail());
    }

}
