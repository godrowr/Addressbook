package JPADataAccess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class);
    }

    @Bean
    public CommandLineRunner runner(BuddyInfoRepository buddyInfoRepository, AddressBookRepository addressBookRepository) {
        return (args) -> {
            // save a few customers
            buddyInfoRepository.save(new BuddyInfo("Jack Bauer", "613-452-XXXX", 1L));
            buddyInfoRepository.save(new BuddyInfo("Chloe O'Brian", "613-575-XXXX", 2L));
            buddyInfoRepository.save(new BuddyInfo("Kim Bauer", "613-997-XXXX", 3L));
            buddyInfoRepository.save(new BuddyInfo("David Palmer", "1-800-201-XXXX", 4L));
            buddyInfoRepository.save(new BuddyInfo("Michelle Dessler", "613-424-XXXX", 5L));

        };
    }

}
