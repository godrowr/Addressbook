import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests BuddyInfo methods.
 */
class BuddyInfoTest {
//    BuddyInfo buddy;
//    AddressBook addressbook;
//
//    @BeforeEach
//    void setUp() {
//        buddy = new BuddyInfo("Test","0000");
//    }
//
//    @Test
//    void BuddyInfo() {
//        buddy = new BuddyInfo("Tim","123-4567");
//        assertEquals(buddy.getName(),"Tim");
//        assertEquals(buddy.getPhonenumber(),"123-4567");
//    }
//
//    @Test
//    void getName() {
//        assertEquals(buddy.getName(),"Test");
//    }
//
//    @Test
//    void setName() {
//        buddy.setName("Tim");
//        assertEquals(buddy.getName(),"Tim");
//    }
//
//    @Test
//    void getPhonenumber() {
//        assertEquals(buddy.getPhonenumber(),"0000");
//    }
//
//    @Test
//    void setPhonenumber() {
//        buddy.setPhonenumber("123-4567");
//        assertEquals(buddy.getPhonenumber(),"123-4567");
//    }
//
//    @Test
//    void persistBuddy() {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-test");
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//
//        em.persist(buddy);
//
//        em.getTransaction().commit();
//        em.close();
//        factory.close();
//    }


}