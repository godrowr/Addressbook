package JPADataAccess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class TestWebApplication {

    private static final Logger log = LoggerFactory.getLogger(TestWebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TestWebApplication.class);
    }

    @Bean
    public CommandLineRunner runner(ApplicationContext ctx, BuddyInfoRepository buddyInfoRepository, AddressBookRepository addressBookRepository) {
        return (args) -> {
            // save a few customers
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

            System.out.println("Contains HC"+ctx.containsBeanDefinition("HomeController"));
            System.out.println("Contains HC"+ctx.containsBeanDefinition("AddressBookController"));
            AddressBook addressbook = new AddressBook("MyAddressBook", 1l);
            BuddyInfo bud1 = new BuddyInfo("Jack Bauer", "613-452-XXXX", 1L);
            BuddyInfo bud2 = new BuddyInfo("Chloe O'Brian", "613-575-XXXX", 2L);
            addressbook.addBuddy(bud1);
            addressbook.addBuddy(bud2);

            buddyInfoRepository.save(bud1);
            buddyInfoRepository.save(bud2);
            addressBookRepository.save(addressbook);

//            buddyInfoRepository.save(new BuddyInfo("Chloe O'Brian", "613-575-XXXX", 2L));
//            buddyInfoRepository.save(new BuddyInfo("Kim Bauer", "613-997-XXXX", 3L));
//            buddyInfoRepository.save(new BuddyInfo("David Palmer", "1-800-201-XXXX", 4L));
//            buddyInfoRepository.save(new BuddyInfo("Michelle Dessler", "613-424-XXXX", 5L));

        };
    }

}
