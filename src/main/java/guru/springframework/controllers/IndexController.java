package guru.springframework.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
@RequestMapping({"/", "/index", "/index.html"})
    public String indexHome() {

    return "index";
    }
}
