package Obras;

import java.util.Scanner;

public abstract class ObraDeArtes {
	
	
	private int id;
	private String nombre;
	private String autor;
	private String tipo;
	private double precio;
	private double altura;
	private double peso;
	private int piezas;
	private String descripcion;
	private static ObraDeArtes array[];


	private static ObraDeArtes arrayAux[];
	
	public ObraDeArtes(int id, String nombre, String autor, String tipo, double precio, double altura, double peso,
			int piezas, String descripcion) {
		
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.tipo = tipo;
		this.precio = precio;
		this.altura = altura;
		this.peso = peso;
		this.piezas = piezas;
		this.descripcion = descripcion;
		
	
	}

	

	public String toString() {
		
		StringBuilder list = new StringBuilder();
		list.append("Id : " + getId() + "\n");
		list.append("Nombre : " + getNombre() + "\n");
		list.append("Autor : " + getAutor() + "\n");
		list.append("Precio : " + getPrecio() + "\n");
		list.append("Altura : " + getAltura() + "\n");	
		list.append("Peso : " + getPeso() + "\n");
		list.append("Numero de piezas : " + getPiezas() + "\n");
		list.append("Descripcion : " + getDescripcion() + "\n");
		
		return list.toString();
		
	}
	
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
        
	}
	
	public abstract void calcularPrecio();

	public static void crearColeccionObras() {
		
	     int tamañoInicial = 1;
		
		array = new ObraDeArtes[tamañoInicial];
		
	}
	public static void añadirObra(ObraDeArtes obra) {
	
		array[array.length-1] = obra;
		
		arrayAux = new ObraDeArtes[array.length+1];
		
		for(int i =0; i < array.length;i++)
			arrayAux[i] = array[i];
		
		array = arrayAux;
	
		
		
	}

	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public int getPiezas() {
		return piezas;
	}



	public void setPiezas(int piezas) {
		this.piezas = piezas;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static ObraDeArtes[] getArray() {
		return array;
	}



	

	
	

}
