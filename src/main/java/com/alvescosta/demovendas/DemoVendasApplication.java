package com.alvescosta.demovendas;

import com.alvescosta.demovendas.model.entity.Cliente;
import com.alvescosta.demovendas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class DemoVendasApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoVendasApplication.class, args);
    }

}
