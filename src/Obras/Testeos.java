package Obras;


import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Testeos {

	static ObraDeArtes obra1 = new ObraPictorica(1,"Guernica", "P.Picasso","Pictorica",1000,5,2,5,"Cuadro guerra civil","Óleo");
	static ObraDeArtes obra2 = new ObraEscultura(5,"El piel roja", "U.Checa","Escultura",350,1,0.8,1,"Escultura","Escultura");
	
	@BeforeAll
	static void CrearArray() {
		
		ObraDeArtes.crearColeccionObras();
		

		ObraDeArtes.añadirObra(obra1);	
		ObraDeArtes.añadirObra(obra2);
	
	}
	
	
	//Probando que las obras añadidas no sean nulas y que sean del tipo correspondiente :
	
	@Test
	void probandoObras() {
	
		int primeraObra = 0;
		int segundaObra = 1;
		
		assertEquals( true, (ObraDeArtes.getArray()[primeraObra] instanceof ObraPictorica) );
		
		assertEquals( true, (ObraDeArtes.getArray()[segundaObra] instanceof ObraEscultura) );
		
		
	}
	
	
	// Probamos que el array incrementa en 1 posicion luego de añadir una obra : 
	@Test
	void probarIncrementoArray() {
		
		int tamañoAumentado = ObraDeArtes.getArray().length + 1;
		
		ObraDeArtes obra3 = new ObraPictorica(3,"Prueba", "P.Prueba","Pictorica",1000,5,2,5,"Probando","prueba");
		ObraDeArtes.añadirObra(obra3);
		
		assertEquals(tamañoAumentado, ObraDeArtes.getArray().length);
		
	}
	
	
	
	/*
	 * Probando que no se puedan poner ids repetidos al añadir obras ni al modificarlas
	 * y que la excepcion lanzada sea IllegalArgument :
	 */
	@Test
	void probarIdRepetidos() {
	
		ObraDeArtes obra3 = new ObraPictorica(1,"Prueba", "P.Prueba","Pictorica",1000,5,2,5,"Probando","prueba");	
		
		//Añadiendo la obra:
		
		try {
			ObraDeArtes.añadirObra(obra3);
		}
		catch (Exception ex) {
			
			assertEquals( true, (ex instanceof IllegalArgumentException) );
		
		}
		
		
		//Modificando una obra :
		
		int idRepetido = 1;
		try {
			obra3.setId(idRepetido);
		}
		catch (Exception ex) {
			
			assertEquals( true, (ex instanceof IllegalArgumentException) );
		
		}
		
		
		
	}
	
	
	//Probando que no se admitan tipos que no sean escultura o pictorica : 
	
	@Test
	void probarTipoDeObra() {
		
		ObraDeArtes obra3 = new ObraPictorica(1,"Prueba", "P.Prueba","OtroTipo",1000,5,2,5,"OtroTipo","prueba");	
		
		try {
			ObraDeArtes.añadirObra(obra3);
		}
		catch (Exception ex) {
			
			assertEquals( true, (ex instanceof IllegalArgumentException) );
		
		}
		
	}
	

	
	
	//Probando que el precio obtenido sea el correcto:
	@Test
	void probarPrecio(){
		
		double precioFinal_obra1 = 1332.0;
		double precioFinal_obra2 = 432.0;
		
		
		int primeraObra = 0;
		int segundaObra = 1;
		
		assertEquals( precioFinal_obra1, (ObraDeArtes.getArray()[primeraObra].obtenerPrecioFinal()) );
		
		assertEquals( precioFinal_obra2, (ObraDeArtes.getArray()[segundaObra].obtenerPrecioFinal()) );
		
		
		
		
	}
	
	
		
	
	

}
