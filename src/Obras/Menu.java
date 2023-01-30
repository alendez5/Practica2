package Obras;

import java.util.Scanner;

public class Menu {

	
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
	 Scanner entrada = new Scanner(System.in);
	 ObraDeArtes array[] = new ObraDeArtes[10];
	 ObraPictorica obraP = null;
	 ObraEscultura obraE = null;
	 
	 
	 public Menu() {
		 
		 ObraDeArtes.crearColeccionObras();
		 
		 
	 }
	 
	  public void añadirObra() {
		 
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Introduce el id :");
		 id = entrada.nextInt();
		 entrada.nextLine();
		 System.out.println("Introduce el nombre :");
		 nombre = entrada.nextLine();
		 
		 System.out.println("Introduce el autor :");
		 autor = entrada.nextLine();
		 
		 System.out.println("Introduce el tipo :");
		 tipo = entrada.nextLine().trim();
		 
		 	if(tipo.equalsIgnoreCase("Pictorica")) {
		 		System.out.println("Introduce la tecnica :");
				tecnica = entrada.nextLine().trim();
				esPictorica = true;
		 	}
		 	else if(tipo.equalsIgnoreCase("Escultura")) {
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
		 
		if(esPictorica) {
			obraP = new ObraPictorica(id, nombre, autor, tipo, precio, altura, peso, piezas, descripcion, tecnica);
			ObraDeArtes.añadirObra(obraP);
		}	
		else if(esEscultura) {
			obraE = new ObraEscultura(id, nombre, autor, tipo, precio, altura, peso, piezas, descripcion, material); 
			ObraDeArtes.añadirObra(obraE);
		}
		
		 
		 
	 }
	  
	 public void mostrarObras() {
		 
		 ObraDeArtes[] array =  ObraDeArtes.getArray();
		 

		 for(int i = 0; i < ObraDeArtes.getArray().length-1;i++) {
			System.out.println(array[i].toString());
		 }
		 
	 }
	 
	 
	
	
}
