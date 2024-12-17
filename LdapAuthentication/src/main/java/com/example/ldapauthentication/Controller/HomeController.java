package com.example.ldapauthentication.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
//public class HomeController {
//
//    @GetMapping("/")
//    public String index(Authentication authentication) {
//        // Get the username of the currently logged-in user
//        String username = authentication.getName();
//
//        // Get the roles of the user
//        String roles = authentication.getAuthorities().toString();
//
//        return "Welcome " + username + "! Your roles are: " + roles;
//    }
//}

@Controller
public class HomeController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Refers to login.html in templates
    }

    @GetMapping("/")
    public String index(Authentication authentication, Model model) {
        // Get the username of the currently logged-in user
        String username = authentication.getName();

        // Get the roles of the user
        String roles = authentication.getAuthorities().toString();

        // Add data to the model to be accessible in the Thymeleaf template
        model.addAttribute("username", username);
        model.addAttribute("roles", roles);

        return "index"; // This corresponds to index.html in the templates folder
    }
}