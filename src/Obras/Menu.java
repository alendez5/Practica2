package Obras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {


	  public void añadirObra() {
		 
		 int id;
	     int piezas;
		 String nombre;
		 String autor;
		 String tipo;
		 String descripcion;
		 String tecnica = null;
		 String material = null;
		 double precio;
		 double altura;
		 double peso;
		 boolean esPictorica = false;
		 boolean esEscultura = false;
			
		 ObraPictorica obraP = null;
		 ObraEscultura obraE = null;
		
		 Scanner entrada = new Scanner(System.in);
		 
			try {
				System.out.println("Introduce el id :");
				id = entrada.nextInt();
				entrada.nextLine();

				if (ObraDeArtes.buscarId(id))
					throw new IllegalArgumentException("Error: El id" + id + " ya existe");

				System.out.println("Introduce el nombre :");
				nombre = entrada.nextLine();

				System.out.println("Introduce el autor :");
				autor = entrada.nextLine();

				System.out.println("Introduce el tipo :");
				tipo = entrada.nextLine().trim();

				if (!tipo.equalsIgnoreCase("escultura") && !tipo.equalsIgnoreCase("pictorica"))
					throw new IllegalArgumentException("tipo incorrecto, debe ser escultura o pictorica");

				if (tipo.equalsIgnoreCase("Pictorica")) {
					System.out.println("Introduce la tecnica :");
					tecnica = entrada.nextLine().trim();
					esPictorica = true;
				} else if (tipo.equalsIgnoreCase("Escultura")) {
					System.out.println("Introduce el material :");
					material = entrada.nextLine().trim();
					esEscultura = true;
				}

				System.out.println("Introduce el precio : ");
				precio = entrada.nextDouble();

				System.out.println("Introduce la altura :");
				altura = entrada.nextDouble();

				System.out.println("Introduce el peso: ");
				peso = entrada.nextDouble();

				System.out.println("Introduce el numero de piezas: ");
				piezas = entrada.nextInt();
				entrada.nextLine();

				System.out.println("Introduce una descripción: ");
				descripcion = entrada.nextLine();

				if (esPictorica) {

					obraP = new ObraPictorica(id, nombre, autor, tipo, precio, altura, peso, piezas, descripcion,
							tecnica);
					ObraDeArtes.añadirObra(obraP);

				} else if (esEscultura) {

					obraE = new ObraEscultura(id, nombre, autor, tipo, precio, altura, peso, piezas, descripcion,
							material);
					ObraDeArtes.añadirObra(obraE);

				}
			} 
			catch (InputMismatchException ex) {
				throw new InputMismatchException("Tipo incompatible");
			}
		 
		 
	 }
	   
	  
	 public void mostrarObras() {
		 
		 ObraDeArtes[] array =  ObraDeArtes.getArray();
		 

		 for (int i = 0; i < array.length-1;i++) {
			System.out.println(array[i].toString());
		 }
		 
	 }
	 
	 public void modificarObra() {
		
		 
		 ObraDeArtes obra = obtenerObra();
		 
		 if(obra == null)
			 System.out.println("No existe una obra con esos datos");
		 else {
			 
			 System.out.println("Obra encontrada!");
			 System.out.println();
			 
			try {
				obra.modificarDatos();
			} 
			catch (IllegalArgumentException ex) {
				throw new IllegalArgumentException(ex.getMessage());
			}
			catch (InputMismatchException ex) {
				throw new InputMismatchException(ex.getMessage());
			}
			
				
		 }
	 }
	 
	 public void visualizarObra() {
		 
		 ObraDeArtes obra = obtenerObra();
		 
		 if(obra == null)
			 System.out.println("No existe una obra con esos datos");
		 else {
			 
			 System.out.println("Obra encontrada!");
			 System.out.println();
			 System.out.println(obra);
			
		 }

	 }
	 
	 public void obtenerPrecio() {
		 
		 ObraDeArtes obra = obtenerObra();
		 
		 if(obra == null)
			 System.out.println("No existe una obra con esos datos");
		 else {
			 
			 System.out.println("Obra encontrada!");
			 System.out.println();
			 System.out.println("Precio final de venta(€): "+obra.obtenerPrecioFinal());
			
		 }
		 
		 
		 
	 }
	 
	 public void imprimirEtiqueta() {
		 
         ObraDeArtes obra = obtenerObra();
		 
		 if(obra == null)
			 System.out.println("No existe una obra con esos datos");
		 else {
			 
			 System.out.println("Obra encontrada!");
			 System.out.println();
			 
			 System.out.println(obra.getNombre());
			 System.out.println(obra.getAutor());
			 System.out.println(obra.getDescripcion());
			
		 }
		 
		 
	 }
	 
	 private ObraDeArtes obtenerObra() {
		 
		 Scanner entrada = new Scanner(System.in);
		 ObraDeArtes[] array = ObraDeArtes.getArray();
		 ObraDeArtes obra = null;
		 int id;

		 System.out.println("Introduce el id de la obra: ");
		 id = entrada.nextInt();
		 

		 for (int i = 0; i < ObraDeArtes.getArray().length-1;i++) {
			if(array[i].getId() == id) {
				obra = array[i];
			}
		 }
	
		 
		 return obra;
	 }
	
	
}
