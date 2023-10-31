package com.crud.spring.modelo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.spring.modelo.DAO.IClientesDAO;
import com.crud.spring.modelo.entidad.Cliente;

@Service
public class clienteServiceImp implements IClientesService{
@Autowired
private IClientesDAO clienteDAO;
	@Transactional
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDAO.findAll();
		
	}
	@Override
	@Transactional
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return clienteDAO.findById(id).orElseGet(null);
	}
	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDAO.save(cliente);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		 clienteDAO.deleteById(id);
	} 
	


}
