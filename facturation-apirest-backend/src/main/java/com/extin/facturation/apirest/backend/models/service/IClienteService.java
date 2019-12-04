package com.extin.facturation.apirest.backend.models.service;

import java.util.List;

import com.extin.facturation.apirest.backend.models.entity.Cliente;

public interface IClienteService {
	
	//Iterable<T> findAll();Del crud repository
	public List<Cliente> findAll();//Esto me lista todos los datos mapeados de la base de datos

}
