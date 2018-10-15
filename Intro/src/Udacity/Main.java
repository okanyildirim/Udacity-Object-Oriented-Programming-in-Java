package Udacity;

public class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager= new ContactsManager();

        Contact contact1 = new Contact();
        Contact contact2 = new Contact();
        Contact contact3 = new Contact();
        Contact contact4 = new Contact();
        contact1.name="Fatih";
        contact1.phoneNumber="05455555555";
        contact2.name="Hasan";
        contact2.phoneNumber="05444444444";
        contact3.name="Abdullah";
        contact3.phoneNumber="05333333333";
        contact4.name="Ahmet";
        contact4.phoneNumber="05322222222";

        myContactsManager.addContact(contact1);
        myContactsManager.addContact(contact2);
        myContactsManager.addContact(contact3);
        myContactsManager.addContact(contact4);

        System.out.println(myContactsManager.searchContact("Abdullah").phoneNumber);
    }
}