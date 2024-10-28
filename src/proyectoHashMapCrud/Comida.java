package proyectoHashMapCrud;

public class Comida {
	private String nombre; //Este sera la llava de mi HasMap -- debe ser un valor unico
	private String sabor;
	private float precio;
	public Comida() {
	}
	public Comida(String nombre, String sabor, float precio) {
		this.nombre = nombre;
		this.sabor = sabor;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Comida [nombre=" + nombre + ", sabor=" + sabor + ", precio=" + precio + "]\n";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
}
