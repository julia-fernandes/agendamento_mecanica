package com.api.agendamento_mecanica.service;


import com.api.agendamento_mecanica.dto.AgendamentoResponseDTO;
import com.api.agendamento_mecanica.model.Agendamento;
import com.api.agendamento_mecanica.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository){
        this.repository = repository;
    }

    private AgendamentoResponseDTO toResponseDTO(Agendamento agendamento){

        return new AgendamentoResponseDTO(

                agendamento.getNomePessoa(),
                agendamento.getPlacaVeiculo(),
                agendamento.getVeiculo(),
                agendamento.getDataEntrada(),
                agendamento.getHoraEntrada(),
                agendamento.getSituacao(),
                agendamento.getStatusRegistro()
        );
    }

    private Agendamento buscarEntidade(Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Agendamento não encontrado!"));
    }

    public List<AgendamentoResponseDTO> listarAgendamentos(){

        return repository.findAll()
                .stream()
                .map(this::toResponseDTO)
                .toList();
    }

    public AgendamentoResponseDTO buscarPorId(Long id){

        Agendamento agendamento = buscarEntidade(id);

        return toResponseDTO(agendamento);
    }

}
