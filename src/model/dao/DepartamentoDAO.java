package model.dao;

import java.util.List;

import model.entities.Departamento;

public interface DepartamentoDAO {
	
	void inserir(Departamento obj);
	void atualizar(Departamento obj);
	void deletarPorId(Integer id);
	Departamento procurarPorId (Integer id);
	List<Departamento> procurarTodos();
}
