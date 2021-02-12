import static org.assertj.core.api.Assertions.assertThat;

import JPADataAccess.AddressBookController;
import JPADataAccess.HomeController;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = AddressBookController.class)
@RunWith(SpringRunner.class)
public class SmokeTest {

    @Autowired
    private AddressBookController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}