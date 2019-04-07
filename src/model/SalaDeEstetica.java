package model;

public class SalaDeEstetica 
{

	private String nombre;
	//Association
	private Empleado empleado1;
	private Empleado empleado2;
	public SalaDeEstetica(String nombre, Empleado empleado1, Empleado empleado2/*, String nombre1 ,String cedula1, String cargoEnPeluqueria1 , String anioDeIngreso1, String nombre2,String cedula2, String cargoEnPeluqueria2, String anioDeIngreso2*/) 
	{
		this.nombre = nombre;
		this.empleado1 = empleado1;
		this.empleado2 = empleado2;
		/*
		empleado1 = new Empleado(nombre1, cedula1, cargoEnPeluqueria1, anioDeIngreso1);
		empleado2 = new Empleado(nombre2, cedula2, cargoEnPeluqueria2, anioDeIngreso2);
		*/
	}
	public String agregarEmpleado(Empleado e) 
	{
		if(empleado1 == null)
		{
			String agrego = "";
			empleado1 = e;
			agrego =  "Cliente Creado";
			return agrego;
		} 
		else if(empleado2 == null)
		{
			String agrego = "";
			empleado2 = e;
			agrego =  "Cliente Creado";
			return agrego;
		}
		return "no se pudo agregar";	
	}
	public String agregarServicioE1(TipoDeServicio t) 
	{
		empleado1.agregarServicio(t);
		return "";
	}
	public String agregarServicioE2(TipoDeServicio t) 
	{
		empleado2.agregarServicio(t);
		return "";
	} 
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public Empleado getEmpleado1() 
	{
		return empleado1;
	}
	public void setEmpleado1(Empleado empleado1) 
	{
		this.empleado1 = empleado1;
	}
	public Empleado getEmpleado2() 
	{
		return empleado2;
	}
	public void setEmpleado2(Empleado empleado2) 
	{
		this.empleado2 = empleado2;
	}
	

}