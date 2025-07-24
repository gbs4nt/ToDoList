package com.example.ToDoList.service;

import com.example.ToDoList.model.Tarefa;
import com.example.ToDoList.repository.TarefaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class TarefaService {

    private final TarefaRepository repository;

    public List<Tarefa> listarTarefas(){
        return repository.findAll();
    }

    public Tarefa buscarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Achei nao man"));
    }
    public void deletarPorId(Long id){

        if(!repository.existsById(id)) {
            throw new EntityNotFoundException("Achei nao man");
        }

         repository.deleteById(id);
    }

    public Tarefa concluirTarefa(Long id){
        if(!repository.existsById(id)){
            throw new EntityNotFoundException("Nada dele");
        }
        
    }

}
