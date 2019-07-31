package formacion;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EscribirFichero {
	 public static void main(String[] args) {
	        Path write = Paths.get("C:/Users/Usuario/eclipse-workspace/formacion/src/HolaMundo.txt");
	        try (BufferedWriter writer = 
	                 Files.newBufferedWriter(write, StandardCharsets.UTF_8, 
	                     StandardOpenOption.WRITE)) {

	            
	                writer.write(String.format("esto es una modificacion"));
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
