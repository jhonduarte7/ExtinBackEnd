package com.extin.facturation.apirest.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.extin.facturation.apirest.backend.models.entity.Cliente;
import com.extin.facturation.apirest.backend.models.service.IClienteService;


//@CrossOrigin(origins = {"http://localhost:4200"})//Aqui se condfigura el dominio http para que se pueda conectar a otra plataforma
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index() {
		
		return clienteService.findAll();
		
		
	}
	
	//public Cliente findById(Long id);
	@GetMapping("/clientes/{id}")
	public Cliente show(@PathVariable Long id) {
		return clienteService.findById(id);
		
	}
	
	//public Cliente save (Cliente cliente);
	@PostMapping("/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente Guardar(@RequestBody Cliente cliente) {
		
		return clienteService.save(cliente);
	}
	
	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente actualizar(@RequestBody Cliente cliente, @PathVariable Long id) {
		
		Cliente clienteActual = clienteService.findById(id);//Me trae de la nase de datos el cliente actual
		
		clienteActual.setNombre(cliente.getNombre());
		clienteActual.setApellido(cliente.getApellido());
		clienteActual.setEmail(cliente.getEmail());
		
		
		return clienteService.save(clienteActual);
		
	}
	
	//public void delete(Long id);
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		
		clienteService.delete(id);
	}
	
	
	

}
