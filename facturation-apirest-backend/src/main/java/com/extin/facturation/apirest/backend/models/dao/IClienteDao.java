package com.extin.facturation.apirest.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.extin.facturation.apirest.backend.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
