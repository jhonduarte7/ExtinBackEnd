package com.extin.facturation.apirest.backend.models.service;

import java.util.List;
import java.util.Optional;

import com.extin.facturation.apirest.backend.models.entity.Cliente;

public interface IClienteService {
	
	//Iterable<T> findAll();Del crud repository
	public List<Cliente> findAll();//Esto me lista todos los datos mapeados de la base de datos
	
	
	//Optional<T> findById(ID id);
	public Cliente findById(Long id);
	
	//<S extends T> S save(S entity);
	public Cliente save (Cliente cliente);
	
	//void deleteById(ID id);
	public void delete(Long id);
	
	

}
