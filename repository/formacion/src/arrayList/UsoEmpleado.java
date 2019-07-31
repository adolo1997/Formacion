package arrayList;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		/*Empleado listaEmpleados[]=new Empleado[3];
		
		listaEmpleados[0]=new Empleado("Adolfo", 21, 2000);
		listaEmpleados[1]=new Empleado("Juan", 26, 2500);
		listaEmpleados[2]=new Empleado("Yoli", 29, 1000);*/
		
		ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
		
			listaEmpleados.add(new Empleado("Adolfo", 21, 2000));
			listaEmpleados.add(new Empleado("Juan", 26, 2500));
			listaEmpleados.add(new Empleado("Yoli", 29, 1000));
		
			listaEmpleados.trimToSize();
			
		/*for(Empleado e:listaEmpleados) {
			System.out.println(e.dameDatos());
		}
						//HAY VARIAS FORMAS DE RECORRER EL ARRAY, LA MAS OPTIMA ES LA PRIMERA
		for(int i=0; i<listaEmpleados.size();i++) {
			Empleado e=listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}*/
			
		//CON ITERATOR SACAMOS LOS DATOS
			
			Iterator<Empleado> miLista=listaEmpleados.iterator();
			
			while (miLista.hasNext()) {
				System.out.println(miLista.next().dameDatos());
				
			}
			
	}
}

class Empleado{
	
	private String nombre;
	private int edad;
	private double salario; 
	
	public Empleado(String nombre, int edad, double salario) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene: " + edad + " y cobra " + salario;
	}
	
	
}
