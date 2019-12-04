package com.extin.facturation.apirest.backend.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.extin.facturation.apirest.backend.models.dao.IClienteDao;
import com.extin.facturation.apirest.backend.models.entity.Cliente;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;//Aqui inyecto la variable que se trae el crud repository del spring 
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		
		return clienteDao.findById(id).orElse(null);
	}


	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		
		return clienteDao.save(cliente);
	}


	@Override
	@Transactional
	public void delete(Long id) {
		
		clienteDao.deleteById(id);
		
	}

}
