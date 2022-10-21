package S1T5N1E1;

import java.io.File;

public class MainDir {

	public static void main(String[] args) throws Exception  { //els arguments que fiquem per la consola s'emmagatzemen a l'Array args del mètode main

		try { 									//fiquem (args) a dins de carpeta amb la posició [0], perquè sabem que només hi ha un objecte
			File carpeta = new File(args[0]); 	//La classe File s'utilitza per obtendre informació sobre arxius i directoris

			System.out.println("La ruta està a: " + carpeta.getAbsolutePath()); // mirem on està la ruta
			System.out.println("La ruta es correcte: " + carpeta.exists()); // si existeix el directori donarà true de
																			// lo contrari false

			String[] nomsArxius = carpeta.list(); // fiquem la direcció a la Array nomsArxiu

			for (int i = 0; i < nomsArxius.length; i++) { // busquem i mostrem els arxius
				System.out.println(nomsArxius[i]);
			}
		} catch (Exception e) {
			System.out.println("Error de format."); // si no hi ha arxiu llença la Exepció
			// TODO: handle exception
		}

	}
}
