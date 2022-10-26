package S1T5N1E4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainDir {

	public static void main(String[] args) throws Exception {
		try { 	// fiquem (args) a dins de carpeta amb la posició [0], perquè sabem que només hi ha un objecte
			File carpeta = new File(args[0]); // La classe File s'utilitza per obtendre informació sobre arxius i
												// directoris
			
			System.out.println("La ruta està a: " + carpeta.getAbsolutePath()); // mirem on està la ruta
			System.out.println("¿La ruta es correcte? " + carpeta.exists()); // si existeix el directori donarà true de

			llegirArxiu(carpeta);

		} catch (Exception e) {
			System.out.println("Error de format."); // si no hi ha arxiu llença la Exepció
			// TODO: handle exception
		}
	}
	
		//mètode per la lectura
	public static void llegirArxiu(File carpeta) {
		String frase;
		
		try {
		FileReader	arxiu1 = new FileReader(carpeta);
		BufferedReader llegirArxiu = new BufferedReader(arxiu1); //s'ha creat una memoria intermedia
		
		while((frase = llegirArxiu.readLine()) != null) {
		 			System.out.println(frase);}
		 			llegirArxiu.close();
					
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println("Error al veure l'arxiu."); // si no hi ha arxiu llença la Exepció
		}
	}
}
	