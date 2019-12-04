package com.extin.facturation.apirest.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.extin.facturation.apirest.backend.models.entity.Cliente;
import com.extin.facturation.apirest.backend.models.service.IClienteService;


@CrossOrigin(origins = {"http://localhost:4200"})//Aqui se condfigura el dominio http para que se pueda conectar a otra plataforma
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index() {
		
		return clienteService.findAll();
		
		
	}

}
