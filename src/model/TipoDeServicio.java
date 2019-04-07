package model;

public class TipoDeServicio 
{
	private String nombre;
	private int numeroDeRealizaciones;
	private double ingresosAcumulados;
	private double valorAcumuladoPorConceptoDeImpuestos;

	public TipoDeServicio(String nombre, int numeroDeRealizaciones, double ingresosAcumulados, double valorAcumuladoPorConceptoDeImpuestos)
	{
		this.nombre = nombre;
		this.numeroDeRealizaciones = numeroDeRealizaciones;
		this.ingresosAcumulados = ingresosAcumulados;
		this.valorAcumuladoPorConceptoDeImpuestos = valorAcumuladoPorConceptoDeImpuestos;
	}
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public int getNumeroDeRealizaciones()
	{
		return numeroDeRealizaciones;
	}

	public void setNumeroDeRealizaciones(int numeroDeRealizaciones)
	{
		this.numeroDeRealizaciones = numeroDeRealizaciones;
	}

	public double getIngresosAcumulados() 
	{
		return ingresosAcumulados;
	}

	public void setIngresosAcumulados(double ingresosAcumulados) 
	{
		this.ingresosAcumulados = ingresosAcumulados;
	}

	public double getValorAcumuladoPorConceptoDeImpuestos() 
	{
		return valorAcumuladoPorConceptoDeImpuestos;
	}

	public void setValorAcumuladoPorConceptoDeImpuestos(double valorAcumuladoPorConceptoDeImpuestos)
	{
		this.valorAcumuladoPorConceptoDeImpuestos = valorAcumuladoPorConceptoDeImpuestos;
	}
}
