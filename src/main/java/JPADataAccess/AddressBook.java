package JPADataAccess;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *  This class creates an AddressBook to store buddy info objects.
 */
@Entity
public class AddressBook implements Serializable {


    private static List<BuddyInfo> list = new ArrayList<BuddyInfo>();
    private String name;

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long aid;

    /**
     * Creates a new addressbook.
     * @param name Name of the addressbook
     */
    public AddressBook(String name, Long aid) {
        this.aid = aid;
        this.name = name;
    }

    public AddressBook() {
        this.aid = null;
        name = "";
    }

    /**
     * Gets the id of this AddressBook.
     * @return the id
     */
    public Long getAid() {
        return this.aid;
    }

    /**
     * Sets the id of this AddressBook to the specified value.
     * @param id the new id
     */
    public void setAid(Long id) {
        this.aid = id;
    }

    /**
     * Adds a buddyInfo object to the Addressbook list.
     * @param buddy BuddyInfo object to be added to the list
     */
    public void addBuddy(BuddyInfo buddy) {
        this.list.add(buddy);
    }

    /**
     * Removes a buddyInfo object from the Addressbook list.
     * @param buddy BuddyInfo object to be removed from the list
     */
    public void removeBuddy(BuddyInfo buddy) {
        this.list.remove(buddy);
    }

    /**
     * @return ArrayList of all buddyinfo objects
     */
    @OneToMany(mappedBy="UUID")
    public List<BuddyInfo> getList(){ return this.list; }

    /**
     * @param lst New list ob buddyinfo objects to replace the ArrayList in Addressbook.
     */
    public void setList(List<BuddyInfo> lst){ this.list = lst;}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
