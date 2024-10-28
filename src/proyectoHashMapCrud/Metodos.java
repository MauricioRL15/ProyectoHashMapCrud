package proyectoHashMapCrud;

public interface Metodos {

	public void guardar(Comida comida);

	public void mostrar();

	public Comida buscar(String nombre);

	public void editar(Comida comida);

	public void eliminar(Comida comida);

}
