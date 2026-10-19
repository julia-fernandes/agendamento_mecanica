package com.api.agendamento_mecanica.dto;

import com.api.agendamento_mecanica.model.SituacaoAgendamento;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

public record AgendamentoRequestDTO(

        @NotBlank(message = "Campo obrigatório")
        String nomePessoa,

        @NotBlank(message = "Campo obrigatório")
        String placaVeiculo,

        @NotBlank(message = "Campo obrigatório")
        String veiculo,

        @NotNull(message = "Campo obrigatório")
        LocalDate dataEntrada,

        @NotNull(message = "Campo obrigatório")
        LocalTime horaEntrada,

        @NotBlank(message = "Campo obrigatório")
        SituacaoAgendamento situacao,

        @NotNull(message = "Campo obrigatório")
        Boolean statusRegistro
) {}
