package JPADataAccess;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AddressBookController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/addressbook_test")
    public AddressBook populate(@RequestParam(value = "name", defaultValue = "MyAddressBook") String name) {
        return new AddressBook(name, 1l);
    }

}
