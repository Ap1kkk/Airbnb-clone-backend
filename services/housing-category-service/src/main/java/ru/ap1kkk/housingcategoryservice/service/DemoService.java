package ru.ap1kkk.housingcategoryservice.service;

import io.micrometer.observation.annotation.Observed;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Egor Bokov
 */
@Slf4j
@Service
public class DemoService {

    @Observed(name = "category.demo",
            contextualName = "getting-category-demo",
            lowCardinalityKeyValues = {"userType", "userType2"})
    @SneakyThrows
    public String demo(boolean flag) {
        log.info("Getting category demo");

        if (flag)
            throw new Exception("some_message");
        Thread.sleep(new Random().nextLong(200L));
        return "Hello World";
    }
}
