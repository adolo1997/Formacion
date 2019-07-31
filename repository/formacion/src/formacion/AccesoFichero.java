package formacion;

import java.io.FileReader;
import java.io.IOException;


public class AccesoFichero {
	public static void main(String[] args) {
		
		Leer_Fichero accede=new Leer_Fichero();
		accede.lee();
	}
}
	
	class Leer_Fichero{
		
		public void lee() {
			
			try { //CAPTURAMOS CON UN TRY CATCH LA EXCEPCION DEL FILE READER POR SI NO SE ENCUENTRA EL FICHERO
				FileReader entrada=new FileReader("C:/Users/Usuario/eclipse-workspace/formacion/src/HolaMundo.txt");
				
				int c=0; //ES UN INT YA QUE LEE EL FICHERO POR CARACTER
				
				while(c!=-1){ //MIENTRAS C SEA DIFERENTE DE -1 EJECUTARA EL WHILE ( EL METODO READ LLEGA AL FINAL CON -1 )
					c=entrada.read();
					
					char letra=(char)c;
					
					System.out.print(letra);
				}
				
				entrada.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.print("No se encuentra el archivo");
			}
		}
	}


