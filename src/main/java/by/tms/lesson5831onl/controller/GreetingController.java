package by.tms.lesson5831onl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author simonpirko
 * @version 1.0
 * @since 03.04.2025
 */

@Controller
@RequestMapping("/greeting") // http://localhost:8080/greeting
public class GreetingController {

    @GetMapping // GET http://localhost:8080/greeting
    public String greeting() {
        return "greeting";
    }
}
