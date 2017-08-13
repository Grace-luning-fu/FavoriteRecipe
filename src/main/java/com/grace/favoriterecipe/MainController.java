package com.grace.favoriterecipe;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String showThreeRecipe() {
        return "welcome";
    }

    @GetMapping("/crabcake")
    public String showCcrecipe() {
        return "crabcake";
    }


    @GetMapping("/gingerale")
    public String showGingerale() {
        return "gingerale";
    }


    @GetMapping("/cornbread")
    public String showCornbread() {
        return "cornbread";
    }

}
