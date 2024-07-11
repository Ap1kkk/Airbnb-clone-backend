package ru.sitenn.housingcategoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HousingCategoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HousingCategoryServiceApplication.class, args);
    }

}
