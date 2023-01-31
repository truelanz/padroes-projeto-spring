package one.dio.gof.service;

import one.dio.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 */
public interface ClienteService {

	Iterable<one.dio.gof.model.Cliente> buscarTodos();

	one.dio.gof.model.Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}