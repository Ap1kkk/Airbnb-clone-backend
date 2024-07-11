package ru.sitenn.housingcategoryservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Egor Bokov
 */
@RestController
@RequestMapping("/public/")
public class DemoController {

    @GetMapping("/get")
    public String getCategory() {
        return "Category service alive!";
    }
}
