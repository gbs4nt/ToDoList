package com.example.ToDoList.dto;

import com.example.ToDoList.enums.StatusTarefa;

public record TarefaResponseDTO(
        Long id,
        String titulo,
        String descricao,
        StatusTarefa status
) {
}
