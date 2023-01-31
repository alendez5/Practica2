package Obras;

import java.util.Scanner;

public class ObraEscultura extends ObraDeArtes{
	
	private String material;
	
	public ObraEscultura(int id, String nombre, String autor, String tipo, double precio, double altura, double peso,
			int piezas, String descripcion, String material) {
		
		super(id, nombre, autor, tipo, precio, altura, peso, piezas, descripcion);
		
		this.material = material;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void modificarDatos() {
		
		Scanner entrada = new Scanner(System.in);
		
		super.modificarDatos();
        
        
        System.out.println("Introduce el nuevo material: ");
        setMaterial(entrada.nextLine());
		
	}
	
	@Override
	public void calcularPrecio() {
	
		
	}

	@Override
	public String toString() {
		
		
		StringBuilder list = new StringBuilder();
		list.append(super.toString());
		list.append("Material : " + material + "\n");
		
		return list.toString();
		
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}




	
	

}
