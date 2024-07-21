package ru.ap1kkk.housingcategoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class HousingCategoryServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(HousingCategoryServiceApplication.class, args);
    }

}
