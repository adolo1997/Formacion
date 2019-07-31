package formacion;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AccesoFichero2 {
	public static void main(String[] args) {
		
		Path path = Paths.get("C:/Users/Usuario/eclipse-workspace/formacion/src/HolaMundo.txt");
		
		try (BufferedReader reader = Files.newBufferedReader(path)) {
           String line;
           
           while ((line = reader.readLine()) != null) {
               System.out.println(line);
           }
           
       } catch (Exception e) {
           e.printStackTrace();
           
       }
	}
	
}

