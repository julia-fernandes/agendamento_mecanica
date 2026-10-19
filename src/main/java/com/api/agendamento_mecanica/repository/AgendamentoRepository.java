package com.api.agendamento_mecanica.repository;

import com.api.agendamento_mecanica.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
