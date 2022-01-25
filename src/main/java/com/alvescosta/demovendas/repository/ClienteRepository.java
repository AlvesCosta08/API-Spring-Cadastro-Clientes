package com.alvescosta.demovendas.repository;

import com.alvescosta.demovendas.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente , Integer> {
}
