package pl.edu.visula.springframework.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    //@RestController
    public class hellocontroller {

        @GetMapping( "/")
        public String hello() {
            return "Hello Vistula, in my first Spring controller.";
        }

        @GetMapping("/greeting")
        public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
            model.addAttribute("name", name);
            return "greeting";
        }
    }

