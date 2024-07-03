package com.helloWorld.helloWorld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		
		return "Hello World!!";
	}
	
	@GetMapping("/bsm")
	public List<String> BsmList(){
		return Arrays.asList(
				
				"Responsabilidade Pessoal",
                "Mentalidade de Crescimento",
                "Orientação ao Futuro",
                "Persistência",
                "Comunicação",
                "Trabalho em Equipe",
                "Orientação ao Detalhe",
                "Proatividade"
				
				);
	}
	
	@GetMapping("/objetivos")
    public List<String> getObjetivosList() {
        return Arrays.asList(
        		
                "Estudar Spring Boot",
                "Desenvolver projetos práticos",
                "Revisar conceitos de Java",
                "Participar das sessões de mentoria"
        );
    }
	
}
