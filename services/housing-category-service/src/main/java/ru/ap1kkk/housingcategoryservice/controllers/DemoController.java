package ru.ap1kkk.housingcategoryservice.controllers;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ap1kkk.housingcategoryservice.service.DemoService;

/**
 * @author Egor Bokov
 */
@Slf4j
@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class DemoController {
    private final DemoService demoService;


    @GetMapping("/get")
    public String getCategory() {
        log.info("Got a category request");
        return demoService.demo(false);
    }
}
