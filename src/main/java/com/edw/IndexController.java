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
        return new HashMap<>(){{
            put("Message", "Hello Spring Boot. Ini setelah commit");
        }};
    }

    public void bad() {
        for (int i=0; i<10; i++) {
            for (int j=0; i<10; j++) {
                // potentially infinite loop due to test on wrong variable
                if (shouldBreak()) break;
            }
        }
    }
    
    private boolean shouldBreak() {
        return Math.random() < 0.5;
    }
}
