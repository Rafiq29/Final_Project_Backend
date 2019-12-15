package app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/*
This is test controller for Home Page
 */

@Controller
public class MainPageController {
    @GetMapping
    public String home () {
        return "home";
    }
}
