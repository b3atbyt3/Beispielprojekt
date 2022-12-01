package com.example.Beispielprojekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.Beispielprojekt")
//@EnableJpaRepositories("com.example.Beispielprojekt")
//@EntityScan(basePackages="com.example.Beispielprojekt")
public class BeispielprojektApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(BeispielprojektApplication.class, args);

        City berlin = new City();
        berlin.setName("Berlin");
        berlin.setCapital(true);

        City duesseldorf = new City();
        duesseldorf.setName("Düsseldorf");
        duesseldorf.setCapital(false);

        CityRepository cityRepository = applicationContext.getBean(CityRepository.class);
        cityRepository.save(berlin);
        cityRepository.save(duesseldorf);
    }

}
