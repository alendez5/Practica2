package Obras;


public class ObraPictorica extends ObraDeArtes{
	
	private String tecnica;
	
	
	public ObraPictorica(int id, String nombre, String autor, String tipo, double precio, double altura, double peso,
			int piezas, String descripcion,String tecnica) {
		
		super(id, nombre, autor, tipo, precio, altura, peso, piezas, descripcion);
		
		this.tecnica = tecnica;
		// TODO Auto-generated constructor stub
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
