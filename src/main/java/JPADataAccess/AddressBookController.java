package JPADataAccess;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller()
public class AddressBookController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/addressbook") //@RequestParam(value = "name", defaultValue = "MyAddressBook") String name
    public String addressbookForm(@RequestParam(value = "name", defaultValue = "MyAddressBook") String name, Model model) {
        model.addAttribute("addressbook", new AddressBook(name, counter.incrementAndGet()));
        return "addressbook";
    }

    @PostMapping("/addressbook") //@RequestParam(value = "name", defaultValue = "MyAddressBook") String name
    public String addressbookSubmit(@ModelAttribute AddressBook addressbook, Model model) {
        model.addAttribute("addressbook", addressbook);
        return "addressbook";
    }

}
