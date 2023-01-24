package Obras;

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

	

	@Override
	public abstract String toString();



	public int getId() {
		return id;
	}



	public String getNombre() {
		return nombre;
	}



	public String getAutor() {
		return autor;
	}



	public String getTipo() {
		return tipo;
	}



	public double getPrecio() {
		return precio;
	}



	public double getAltura() {
		return altura;
	}



	public double getPeso() {
		return peso;
	}



	public double getPiezas() {
		return piezas;
	}



	public String getDescripcion() {
		return descripcion;
	}


	

	
	

}
