package com.edw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * <pre>
 *     com.edw.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 23 Apr 2020 14:00
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public HashMap helloWorld() {

        int day = 1;
        switch (day) {
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wednesday");
          break;
        case 4:
          System.out.println("Thursday");
          break;
        case 5:
          System.out.println("Friday");
          break;
        case 6:
          System.out.println("Saturday");
          break;
        case 7:
          System.out.println("Sunday");
          break;
        }

        return new HashMap<>(){{
            put("Message", "Hello Spring Boot. Ini setelah commit");
        }};
    }
}
