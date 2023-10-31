package com.crud.spring.modelo.service;

import java.util.List;

import com.crud.spring.modelo.entidad.Cliente;

public interface IClientesService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);
	
	public void delete(Long id);

}
