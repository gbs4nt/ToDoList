package com.example.ToDoList.controller;


import com.example.ToDoList.service.TarefaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tarefas")
@AllArgsConstructor
public class TarefaController {

    private final TarefaService service;



}
