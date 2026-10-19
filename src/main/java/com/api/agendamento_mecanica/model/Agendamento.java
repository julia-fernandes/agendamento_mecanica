package com.api.agendamento_mecanica.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "TB_AGENDAMENTO")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePessoa;

    private String placaVeiculo;

    private String veiculo;

    private LocalDate dataEntrada;

    private LocalTime horaEntrada;

    @Enumerated(EnumType.STRING)
    private SituacaoAgendamento situacao;

    private Boolean statusRegistro;
}
