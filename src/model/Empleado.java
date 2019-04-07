package model;

public class Empleado 
{
	private String nombre;
	private String cedula;
	private String cargoEnPeluqueria;
	private String anioDeIngreso;
	//Association
	private TipoDeServicio corteDeCabello;
	private TipoDeServicio manicure;
	private TipoDeServicio pedicure;

	public Empleado(String nombre,String cedula, String cargoEnPeluqueria, String anioDeIngreso, TipoDeServicio corteDeCabello, TipoDeServicio manicure, TipoDeServicio pedicure) 
	{
		this.nombre = nombre;
		this.cedula = cedula;
		this.cargoEnPeluqueria = cargoEnPeluqueria;
		this.anioDeIngreso = anioDeIngreso;	
	}
	public String agregarServicio(TipoDeServicio t) 
	{
		if(corteDeCabello == null)
		{
			String agrego = "";
			corteDeCabello = t;
			agrego =  "Servicio bien";
			return agrego;
		} 
		else if(manicure == null)
		{
			String agrego = "";
			manicure = t;
			agrego =  "Servicio bien";
			return agrego;
		}
		else if(pedicure == null)
		{
			String agrego = "";
			pedicure = t;
			agrego =  "Servicio bien";
			return agrego;
		}
		return "Nope";
	}
		public String getNombre() 
		{
			return nombre;
		}
	
		public void setNombre(String nombre)
		{
			this.nombre = nombre;
		}
	
		public String getCedula() 
		{
			return cedula;
		}
	
		public void setCedula(String cedula)
		{
			this.cedula = cedula;
		}
	
		public String getCargoEnPeluqueria()
		{
			return cargoEnPeluqueria;
		}
	
		public void setCargoEnPeluqueria(String cargoEnPeluqueria) 
		{
			this.cargoEnPeluqueria = cargoEnPeluqueria;
		}
	
		public String getAnioDeIngreso()
		{
			return anioDeIngreso;
		}
	
		public void setAnioDeIngreso(String anioDeIngreso)
		{
			this.anioDeIngreso = anioDeIngreso;
		}
	
		public TipoDeServicio getCorteDeCabello() 
		{
			return corteDeCabello;
		}
	
		public void setCorteDeCabello(TipoDeServicio corteDeCabello) 
		{
			this.corteDeCabello = corteDeCabello;
		}
	
		public TipoDeServicio getManicure() 
		{
			return manicure;
		}
	
		public void setManicure(TipoDeServicio manicure)
		{
			this.manicure = manicure;
		}
	
		public TipoDeServicio getPedicure()
		{
			return pedicure;
		}
	
		public void setPedicure(TipoDeServicio pedicure)
		{
			this.pedicure = pedicure;
		}
}
