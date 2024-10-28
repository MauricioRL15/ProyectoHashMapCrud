package proyectoHashMapCrud;

import java.util.Scanner;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner lectura = null;
		
		String nombre;
		String sabor;
		float precio;
		
		Comida comida = null;
		
		int mainMenu, subMenu;
		
		Implementacion imp = new Implementacion();
		
		do {
			System.out.println("== MENÚ PRINCIPAL ==");
			System.out.println("1 -- ALTA");
			System.out.println("2 -- MOSTRAR");
			System.out.println("3 -- BUSCAR");
			System.out.println("4 -- EDITAR");
			System.out.println("5 -- ELIMINAR");
			System.out.println("6 -- SALIR");
			
			lectura = new Scanner(System.in);
			mainMenu = lectura.nextInt();
			
			switch (mainMenu) {
			case 1:
				System.out.println("== INGRESA LOS DATOS DE LA COMIDA ==");
				
				System.out.println("Ingrese el nombre: ");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				System.out.println("Ingrese el Sabor: ");
				lectura = new Scanner(System.in);
				sabor = lectura.nextLine();
				
				System.out.println("Ingrese el Precio: ");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();
				
				//objeto
				comida = new Comida(nombre, sabor, precio);
				
				//Guardar
				imp.guardar(comida);
				System.out.println("== PLATILLO GUARDADO CON ÉXITO ==");
				
				break;
				
			case 2:
				
				imp.mostrar();
				
				break;
			
			case 3:
				
				System.out.println("Ingresa nombre a buscar");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				//Buscar
				comida = imp.buscar(nombre);
				System.out.println(comida);
				
				break;
			
			case 4:
				
				System.out.println("Ingresa el nombre a editar");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				//Buscar
				comida = imp.buscar(nombre);
				System.out.println(comida);
				
				//SUBMENU -- sabor y precio
				
				do {
					System.out.println("== SUBMENU PARA EDITAR ==");
					System.out.println("1 -- SABOR");
					System.out.println("2 -- PRECIO");
					System.out.println("3 -- REGRESAR");
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();
					
					switch (subMenu) {
					case 1:
						
						System.out.println("Ingresa el nuevo sabor");
						lectura = new Scanner(System.in);
						sabor = lectura.nextLine();
						
						//Actualizacion
						comida.setSabor(sabor);
						imp.editar(comida);
						System.out.println("== SE EDITO CORRECTAMENTE EL SABOR ==");
						
						break;
						
					case 2:
						
						System.out.println("Ingresa el nuevo Precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextFloat();
						
						//Actualizacion
						comida.setPrecio(precio);
						imp.editar(comida);
						System.out.println("== SE EDITO CORRECTAMENTE EL PRECIO ==");
						
						break;


					}
					
				} while (subMenu<3);
				
				
				break;
				
			case 5:
				System.out.println("Ingresa el nombre a Eliminar");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				//Eliminar objeto con el nombre
				comida = imp.buscar(nombre);
				imp.eliminar(comida);
				System.out.println("Se elimino correctamente");
				
				break;
			
				
			}
			
		} while (mainMenu < 6);

	}

}
