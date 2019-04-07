package ui;
import model*;
import java.util.Scanner;


public class Main
{
	private Scanner dataRead;
	private SalaDeEstetica peluqueriafeliz;
	
	public Main()
	{
		init();	
	}
	
	
	public static void main(String args[])
	{
		Main m = new Main();
		m.menu();
	}
	public void init()
	{
	//public TipoDeServicio(String nombre, int numeroDeRealizaciones, double ingresosAcumulados, double valorAcumuladoPorConceptoDeImpuestos)
	TipoDeServicio corte = new TipoDeServicio("Corte de Cabello", 0, 0, 0);
	TipoDeServicio pedicure = new TipoDeServicio("Pedicure", 0, 0, 0);
	TipoDeServicio manicure = new TipoDeServicio("Manicure", 0, 0, 0);
	Empleado empleado1 = new Empleado("Ricardo","1006230587","trapear", "2011",null, null, null);
	Empleado empleado2 = new Empleado("Milos","1006230586","barrer", "2011",null, null, null);
	peluqueriafeliz = new SalaDeEstetica("xddd", empleado1, empleado2);
	dataRead = new Scanner(System.in);
	}
	public void menu()
	{
		System.out.println("¡BIENVENIDO!, PORFAVOR ESCOJA UNA OPCION");
		System.out.println("1. Mostar empleados para agregar un servicio a un empleado");
		System.out.println("2. Calcular promedio de ingresos de los empleados");
		System.out.println("3. Mostrar ganancias de los empleados");
		System.out.println("4. Mostar Reporte de los empleados");
		int opcion = 0;
		opcion = dataRead.nextInt();
		dataRead.nextLine();
		if(opcion == 1) 
		{
			System.out.println("1. Para Ricardo 2. Para Milos");
			System.out.println("Empleados " + peluqueriafeliz.getEmpleado1().getNombre());
			System.out.println("Empleados " + peluqueriafeliz.getEmpleado2().getNombre());
			int lectura = 0;
			lectura = dataRead.nextInt();
			dataRead.nextLine();
			if(lectura == 1) 
			{
				System.out.println("Servicio 1. Corte  Servicio 2. pedicure Servicio 3. manicure" );
				int lectura2 = 0;
				lectura2 = dataRead.nextInt();
				dataRead.nextLine();
					if(lectura2 == 1) 
					{
						TipoDeServicio corte = new TipoDeServicio("Corte de Cabello", 0, 0, 0);
						peluqueriafeliz.agregarServicioE1(corte); 
					}
					else if(lectura2 == 2) 
					{
						TipoDeServicio pedicure = new TipoDeServicio("Pedicure", 0, 0, 0);
						peluqueriafeliz.agregarServicioE1(pedicure); 
					}
					else if(lectura2 == 3) 
					{
						TipoDeServicio manicure = new TipoDeServicio("Manicure", 0, 0, 0);
						peluqueriafeliz.agregarServicioE1(manicure);
					}
					else 
					{
						System.out.println("Nope");
						menu();
					}
			}
			else if(lectura == 2) 
			{
				System.out.println("Servicio 1. Corte  Servicio 2. pedicure Servicio 3. manicure" );
				int lectura2 = 0;
				lectura2 = dataRead.nextInt();
				dataRead.nextLine();
					if(lectura2 == 1) 
					{
						TipoDeServicio corte = new TipoDeServicio("Corte de Cabello", 0, 0, 0);
						peluqueriafeliz.agregarServicioE2(corte); 
					}
					else if(lectura2 == 2) 
					{
						TipoDeServicio pedicure = new TipoDeServicio("Pedicure", 0, 0, 0);
						peluqueriafeliz.agregarServicioE2(pedicure); 
					}
					else if(lectura2 == 3) 
					{
						TipoDeServicio manicure = new TipoDeServicio("Manicure", 0, 0, 0);
						peluqueriafeliz.agregarServicioE2(manicure);
					}
					else 
					{
						System.out.println("Nope");
						menu();
					}
			}
			else 
			{
				System.out.println("Nope");
			}
			
			
			
			
			//public Empleado(String nombre,String cedula, String cargoEnPeluqueria, String anioDeIngreso, TipoDeServicio corteDeCabello, TipoDeServicio manicure, TipoDeServicio pedicure)
			/*
			System.out.println("Ingrese nombre");
			String nombre = dataRead.nextLine();
			System.out.println("Ingrese cedula");
			String cedula = dataRead.nextLine();
			System.out.println("Ingrese cargo");
			dataRead.nextLine();
			System.out.println("Ingrese Año de ingreso");
			dataRead.nextLine();
			System.out.println("1. Para corte de cabello 2. Para manicure 3. Para pedicure");
			int opcion2 = 0;
			opcion2 = dataRead.nextInt();
			dataRead.nextLine();
			if(opcion2 == 1) 
			{
				dataRead.nextInt(); 
			}
			*/
		}
		else if(opcion == 2) 
		{
			
		}
		else if(opcion == 3)
		{
			
		}
		else if(opcion == 3) 
		{
			
		}
		else 
		{
			System.out.println("Opcion no existe");
			menu();
		}
	}
	public void mostarServicios() 
	{
		
	}

}
