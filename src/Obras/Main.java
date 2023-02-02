package Obras;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
		ObraDeArtes obra1 = new ObraPictorica(1,"Guernica", "P.Picasso","Pictorica",1000,5,2,5,"Cuadro guerra civil","Óleo");		
		ObraDeArtes obra2 = new ObraPictorica(2,"La vie", "P.Picasso","Pictorica",200,1,1,1,"Óleo","Óleo");	
		ObraDeArtes obra3 = new ObraPictorica(3,"En sueño", "P.Picasso","Pictorica",300,1.3,1,1,"Óleo","Óleo");	
		ObraDeArtes obra4 = new ObraPictorica(4,"Retrato de Dora Maar", "P.Picasso","Pictorica",1,1,0.8,1,"Óleo","Óleo");		
		ObraDeArtes obra5 = new ObraEscultura(5,"El piel roja", "U.Checa","Escultura",350,1,0.8,1,"Escultura","Escultura");
	
		try {
			ObraDeArtes.añadirObra(obra1);
			ObraDeArtes.añadirObra(obra2);
			ObraDeArtes.añadirObra(obra3);
			ObraDeArtes.añadirObra(obra4);
			ObraDeArtes.añadirObra(obra5);
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		
		Scanner entrada = new Scanner(System.in);
		int opcion;
	    boolean salir = false;
	    
	    while(!salir) {
	    	
	    	System.out.println();
	    	System.out.println("1 - Mostrar obras");
	    	System.out.println("2- Añadir una obra");
	    	System.out.println("3- Modificar una obra");
	    	System.out.println("4- Visualizar una obra");
	    	System.out.println("5- Obtener el precio de una obra");
	    	System.out.println("6- Imprimir etiquetas de una obra");
	    	System.out.println("0 - Salir");
	    	System.out.println("Elige una opción: ");
	    	
	    	opcion = entrada.nextInt();
	    	
	    	if(opcion < 0 || opcion > 6 )
	    		System.out.println("Introduce una opcion valida");
	    	else if(opcion == 1)
	    		menu.mostrarObras();
	    	else if (opcion == 2) {
	    		try {
	    			menu.añadirObra();
	    		}
	    		catch(IllegalArgumentException ex) {
	    			System.out.println(ex.getMessage());
	    		}
	    		
	    	}	
	    	else if(opcion == 3)
	    	    menu.modificarObra();
	    	else if(opcion == 4)
	    		menu.visualizarObra();
	    	else if(opcion == 5)
	    		menu.obtenerPrecio();
	    	else if(opcion == 6)
	    		menu.imprimirEtiqueta();
	    	else if(opcion == 0) {
	    		salir = true;
	    		System.out.println("Saliendo de la aplicacion..");
	    	}
	    	
	    }
		
	}
	
	private static void incrementarArray() {
		
	}
	

}
