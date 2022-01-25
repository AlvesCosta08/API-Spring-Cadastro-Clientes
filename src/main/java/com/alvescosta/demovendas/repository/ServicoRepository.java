package com.alvescosta.demovendas.repository;

import com.alvescosta.demovendas.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico , Integer> {
}
