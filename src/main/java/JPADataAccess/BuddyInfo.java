package JPADataAccess;

import javax.persistence.*;
import java.io.Serializable;

/*
 * This class creates a BuddyInfo object to store the name and phone number of a buddy.
 */
@Entity
public class BuddyInfo implements Serializable {
    // The name of the buddy
    private String name;
    //The phone number of the buddy
    private String phonenumber;
    //Id of buddyInfo
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

//    private AddressBook addressbook;


    /**
     * This constructor method creates a BuddyInfo object and assigns a name, address and phonenumber.
     * @param name
     * @param phonenumber
     */
    public BuddyInfo(String name, String phonenumber, long id) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.id = id;
    }


    /**
     * This constructor method creates a BuddyInfo object with no name and no phonenumber.
     */
    public BuddyInfo(){
        this.name = "";
        this.phonenumber = "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String number) {
        this.phonenumber = number;
    }

//    @ManyToOne
//    public AddressBook getAddressbook() {
//        return addressbook;
//    }
//
//    public void setAddressbook(AddressBook addressbook) {
//        this.addressbook = addressbook;
//    }

    public String toString(){
        return getName() + ": " + getPhonenumber();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}