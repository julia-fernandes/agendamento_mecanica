package com.api.mecanica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //html no java

public class MecanicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MecanicaApplication.class, args);
	}

    @GetMapping("/hello")
        public String hello (@RequestParam(value = "name", defaultValue ="world")
        String name){
            return String.format("Hello %s!", name);
    }

    @GetMapping("/reforco")
    public String reforco (@RequestParam(value = "name", defaultValue ="Reforço da prova SaEP")
                         String name){
        return String.format(name);
    }
}
