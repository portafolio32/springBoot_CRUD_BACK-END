package com.crud.spring.modelo.DAO;
import org.springframework.data.repository.CrudRepository;

import com.crud.spring.modelo.entidad.Cliente;

public interface IClientesDAO extends CrudRepository<Cliente,Long> {
	

}
