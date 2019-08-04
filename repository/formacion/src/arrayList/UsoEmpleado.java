package arrayList;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {

		/*
		 * Empleado listaEmpleados[]=new Empleado[3];
		 * 
		 * listaEmpleados[0]=new Empleado("Adolfo", 21, 2000); listaEmpleados[1]=new
		 * Empleado("Juan", 26, 2500); listaEmpleados[2]=new Empleado("Yoli", 29, 1000);
		 */

		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

		listaEmpleados.add(new Empleado("Adolfo", 21, 2000));
		listaEmpleados.add(new Empleado("Juan", 26, 2500));
		listaEmpleados.add(new Empleado("Yoli", 29, 1000));

		listaEmpleados.trimToSize();

		/*
		 * for(Empleado e:listaEmpleados) { System.out.println(e.dameDatos()); } //HAY
		 * VARIAS FORMAS DE RECORRER EL ARRAY, LA MAS OPTIMA ES LA PRIMERA for(int i=0;
		 * i<listaEmpleados.size();i++) { Empleado e=listaEmpleados.get(i);
		 * System.out.println(e.dameDatos()); }
		 */

		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		while (!salir) { // Esto hará que hasta que nosotros no pongamos salir=true, no salgamos

			System.out.println("1. Añadir");
			System.out.println("2. Quitar");
			System.out.println("3. Ver Todo");
			System.out.println("4. Salir");

			System.out.println("Escribe una de las opciones");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:

				Scanner teclado2 = new Scanner(System.in);
				System.out.println("introduzca el nombre:");
				String nombre = teclado2.nextLine();
				System.out.println("Introduzca la edad");
				int edad = teclado2.nextInt();
				System.out.println("Introduzca la salario");
				double salario = teclado2.nextDouble();

				listaEmpleados.add(new Empleado(nombre, edad, salario));
				break;
			case 2:
				// se borra por indice en un arraylist
				Scanner teclado3 = new Scanner(System.in);
				System.out.println("introduce la posicion");
				int indice = teclado3.nextInt();
				listaEmpleados.remove(indice);
				break;
			case 3:
				for (Empleado e : listaEmpleados) {
					System.out.println(e.dameDatos());
				}
				break;
			case 4:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1 y 4");
			}

		}

		// CON ITERATOR SACAMOS LOS DATOS

		/*
		 * Iterator<Empleado> miLista=listaEmpleados.iterator();
		 * 
		 * while (miLista.hasNext()) { System.out.println(miLista.next().dameDatos());
		 * 
		 * }
		 */

	}
}

class Empleado {
//USAMOS ESTATIC PARA PODER ACCEDER A LAS VARIABLES DESDE CUALQUIER FICHERO
	 String nombre;
	 int edad;
	 double salario;

	public Empleado(String nombre, int edad, double salario) {

		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String dameDatos() {
		return "El empleado se llama " + nombre + ". Tiene: " + edad + " y cobra " + salario;
	}

}