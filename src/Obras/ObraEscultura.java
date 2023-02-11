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
	public double obtenerPrecioFinal() {
		
		double precioDeVenta = super.obtenerPrecioDeVenta();
		double precioFinal,descuento = 0.20, sobreCoste = 50;
		
		precioFinal = precioDeVenta - (precioDeVenta * descuento );
		System.out.println("Descuento(20% escultura): "+precioDeVenta * descuento);
		
		precioFinal = precioFinal + sobreCoste;
		System.out.println("Sobrecoste escultura): "+sobreCoste);
		
		
		return  precioFinal;
		
	
		
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
