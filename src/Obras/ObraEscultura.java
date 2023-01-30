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
		
		System.out.println("Introduce el nuevo id: ");
        setId(entrada.nextInt());
        entrada.nextLine();
        
    	System.out.println("Introduce el nuevo nombre: ");
        setNombre(entrada.nextLine());
        
     	System.out.println("Introduce el nuevo autor: ");
        setAutor(entrada.nextLine());
        
        System.out.println("Introduce el nuevo precio: ");
        setPrecio(entrada.nextDouble());
        
        System.out.println("Introduce la nueva altura:");
        setAltura(entrada.nextDouble());
        
        System.out.println("Introduce el nuevo peso: ");
        setPeso(entrada.nextDouble());
        
        System.out.println("Introduce las nuevas piezas: ");
        setPiezas(entrada.nextInt());
        entrada.nextLine();
        
        System.out.println("Introduce la nueva descripcion: ");
        setDescripcion(entrada.nextLine());
        
        
        System.out.println("Introduce el nuevo material: ");
        setMaterial(entrada.nextLine());
		
	}

	@Override
	public String toString() {
		
		StringBuilder list = new StringBuilder();
		list.append("Nombre : " + getNombre() + "\n");
		list.append("Autor : " + getAutor() + "\n");
		list.append("Precio : " + getPrecio() + "\n");
		list.append("Altura : " + getAltura() + "\n");	
		list.append("Peso : " + getPeso() + "\n");
		list.append("Numero de piezas : " + getPiezas() + "\n");
		list.append("Descripcion : " + getDescripcion() + "\n");
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
