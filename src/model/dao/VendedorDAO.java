package model.dao;

import java.util.List;

import model.entities.Vendedor;

public interface VendedorDAO {
	
	void inserir(Vendedor obj);
	void atualizar(Vendedor obj);
	void deletarPorId(Integer id);
	Vendedor procurarPorId (Integer id);
	List<Vendedor> procurarTodos();
}
