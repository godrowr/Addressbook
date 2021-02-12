package JPADataAccess;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuddyInfoController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/buddy_info_test")
    public BuddyInfo populate(@RequestParam(value = "name", defaultValue = "Jim") String name,
                              @RequestParam(value = "number", defaultValue = "613-XXX-XXXX") String number) {
        return new BuddyInfo(name, number, counter.incrementAndGet());
    }

}
