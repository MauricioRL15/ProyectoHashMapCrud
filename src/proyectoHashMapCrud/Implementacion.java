package proyectoHashMapCrud;

import java.util.HashMap;

public class Implementacion implements Metodos{
	
	//Declarar HasMap
	HashMap<String, Comida> registros = new HashMap<String, Comida>();

	@Override
	public void guardar(Comida comida) {
		registros.put(comida.getNombre(), comida);
		
	}

	@Override
	public void mostrar() {
		System.out.println(registros);
		
	}

	@Override
	public Comida buscar(String nombre) {
		return registros.get(nombre);
	}

	@Override
	public void editar(Comida comida) {
		registros.put(comida.getNombre(), comida);
		
	}

	@Override
	public void eliminar(Comida comida) {
		registros.remove(comida.getNombre());
		
	}

}
