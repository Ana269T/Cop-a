package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Persona;
import com.example.demo.repository.IPersonaRepository;

@Controller
@RequestMapping("/persona")

public class PersonaController {
	
	@Autowired
	private IPersonaRepository personaRepositor;
	
	@GetMapping("/registro")
	private String formularioRegistro (Persona persona) {
		return"formulario";
	}
	//
	
	@PostMapping("/registro")
	private String registroPersona (Persona persona) {
		System.out.print("inicio registro");
		personaRepositor.save(persona);//llama la intefas del repositorio y guardando la persona
		
		
		return"formulario";
	}
	

}
