package JPADataAccess;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class BuddyInfoController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/buddyinfo")
    public String buddyinfoForm(@RequestParam(value = "name", defaultValue = "Jim") String name,
                              @RequestParam(value = "number", defaultValue = "613-XXX-XXXX") String number, Model model) {
        model.addAttribute("buddyinfo", new BuddyInfo(name, number, counter.incrementAndGet()));
        return "buddyinfo";
    }

    @PostMapping("/buddyinfo")
    public String buddyinfoSubmit(@ModelAttribute BuddyInfo buddy, Model model) {
        model.addAttribute("buddyinfo", buddy);
        return "buddyinfo";
    }

}
