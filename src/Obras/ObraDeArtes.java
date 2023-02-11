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

	public abstract double obtenerPrecioFinal();

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
		try {
			setId(entrada.nextInt());
		}
		catch(IllegalArgumentException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
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
	
	public double obtenerPrecioDeVenta() { // Una función que usan las clases hijas para luego calcular el precio final
		
		double aux, precioDeVenta;
		
		System.out.println("Nombre :"+nombre);
		System.out.println("Altura(m): " + altura);
		System.out.println("Peso(t): "+peso);
		System.out.println("Numero de piezas : " + piezas);
		System.out.println("Precio(€): "+precio);
		
		aux = precio*0.25;
		precioDeVenta = precio + aux;
		
		System.out.println("Comisión galería: "+aux);
		
		aux = peso > 1 ? 100 :20 ;
		precioDeVenta = precioDeVenta+aux;
		
		System.out.println("Importe por peso: "+aux);
		
		aux =  altura > 1 ? 100 :20 ;
		precioDeVenta = precioDeVenta+aux;
		
		System.out.println("Importe por altura: "+aux);
		
		if(piezas > 2) {
			for(int i = 3 ; i <= piezas;i++) {
				
				precioDeVenta = precioDeVenta + 10;
				System.out.println("Importe adicional - Pieza "+i+"(€): 10");
				
			}
		}
		
		System.out.println("Precio de venta(€): "+ precioDeVenta);
		return precioDeVenta;
	}

	public static void crearColeccionObras() {
		
	     int tamañoInicial = 1;
		
		array = new ObraDeArtes[tamañoInicial];
		
	}
	public static void añadirObra(ObraDeArtes obra) {
		
		if(buscarId(obra.getId()))
			throw new IllegalArgumentException("Error: El id" + obra.getId()+ " ya existe");
	
		array[array.length-1] = obra;
		
		arrayAux = new ObraDeArtes[array.length+1];
		
		for(int i =0; i < array.length;i++)
			arrayAux[i] = array[i];
		
		array = arrayAux;
	

		
	}

	public static boolean buscarId(int id) {
		
		boolean seRepite = false;
		
		for(int i = 0; i < ObraDeArtes.array.length;i++) {
			
			if(ObraDeArtes.array[i]!= null)
				if(id == ObraDeArtes.array[i].getId())
					seRepite = true;
			
		}
		
		
		return seRepite;
	}
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		
	   if(id != this.id && ObraDeArtes.buscarId(id)  )
	     throw new IllegalArgumentException("Error: El id" + id+ " ya existe");
	   
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
