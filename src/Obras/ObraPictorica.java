package Obras;

import java.util.Scanner;

public class ObraPictorica extends ObraDeArtes{
	
	private String tecnica;
	
	
	public ObraPictorica(int id, String nombre, String autor, String tipo, double precio, double altura, double peso,
			int piezas, String descripcion,String tecnica) {
		
		super(id, nombre, autor, tipo, precio, altura, peso, piezas, descripcion);
		
		this.tecnica = tecnica;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcularPrecio() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void modificarDatos() {
		
		Scanner entrada = new Scanner(System.in);
		
		super.modificarDatos();
		
        System.out.println("Introduce la nueva tecnica: ");
        setTecnica(entrada.nextLine());
        
	
	}
	
	@Override
	public String toString() {
		
		StringBuilder list = new StringBuilder();
		list.append(super.toString());
		list.append("Tecnica : " + tecnica + "\n");
		
		return list.toString();
		
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}



	
	

}
