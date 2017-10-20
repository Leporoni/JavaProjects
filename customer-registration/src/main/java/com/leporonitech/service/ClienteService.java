package com.leporonitech.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leporonitech.model.Cliente;
import com.leporonitech.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;

	// Negocios
	public Cliente cadastrar(Cliente cliente) {

		return clienteRepository.save(cliente);

	}

	public Collection<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	public void excluir(Cliente cliente) {
		clienteRepository.delete(cliente);
	}

	public Cliente burcarPorId(Integer id) {
		return clienteRepository.findOne(id);
	}

	public Cliente alterar(Cliente cliente) {

		return clienteRepository.save(cliente);
	}
}
