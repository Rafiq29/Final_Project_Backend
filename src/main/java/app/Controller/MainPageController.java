package app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/*
This is test controller for Home Page
 */

@Controller
public class MainPageController {
    @Autowired
    public MainPageController() {
    }

    @GetMapping
    public String home() {
        return "home";
    }
}
