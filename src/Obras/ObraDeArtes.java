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
	private ObraDeArtes array[];
	private ObraDeArtes arrayAux[];
	
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
		
		int tamañoInicial = 1;
		
		array = new ObraDeArtes[tamañoInicial];
		
	}

	

	@Override
	public abstract String toString();

	public void añadirObra(ObraDeArtes obra) {
	
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

    

	

	
	

}
