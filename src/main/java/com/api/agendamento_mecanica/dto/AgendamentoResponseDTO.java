package com.api.agendamento_mecanica.dto;

import com.api.agendamento_mecanica.model.SituacaoAgendamento;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;
import java.time.LocalTime;

public record AgendamentoResponseDTO(

         String nomePessoa,
         String placaVeiculo,
         String veiculo,
         LocalDate dataEntrada,
         LocalTime horaEntrada,
         SituacaoAgendamento situacao,
         Boolean statusRegistro
) {}
