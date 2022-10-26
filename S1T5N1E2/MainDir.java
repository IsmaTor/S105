package S1T5N1E2;

import java.io.File;
import java.text.SimpleDateFormat;

public class MainDir {

	public static void main(String[] args) throws Exception { // els arguments que fiquem per la consola s'emmagatzemen
																// a l'Array args del mètode main

		try { 	// fiquem (args) a dins de carpeta amb la posició [0], perquè sabem que només hi ha un objecte
			File carpeta = new File(args[0]); // La classe File s'utilitza per obtendre informació sobre arxius i
												// directoris

			System.out.println("La ruta està a: " + carpeta.getAbsolutePath()); // mirem on està la ruta
			System.out.println("¿La ruta es correcte? " + carpeta.exists()); // si existeix el directori donarà true de

			veureArbre(carpeta, ""); 

		} catch (Exception e) {
			System.out.println("Error de format."); // si no hi ha arxiu llença la Exepció
			// TODO: handle exception
		}
	}

	public static void veureArbre(File carpeta, String tab) { //afegim la direcció (File) i un tabulador que farà de espais o simbols al mètode
		
		SimpleDateFormat data = new SimpleDateFormat("MM/dd/yyyy"); //només la data sense la hora, amb la hora ("MM/dd/yyyy HH:mm:ss")
		
		File contingut[] = carpeta.listFiles(); //fiquem la direcció a la Array contingut

		if (contingut != null) {
			for (int i = 0; i < contingut.length; i++) {
				if (contingut[i].isDirectory()) {//li diem que si es directory imprimexi D el directori i la data amb els simbols de l'arbre
					System.out.println("D" + tab + "+-" + contingut[i].getName() + "   " + data.format(contingut[i].lastModified()));
					veureArbre(contingut[i], tab + "|  "); //cridem al mètode de forma recursiva.
				} else if (contingut[i].isFile()) {//li diem que si es arxiu imprimexi F i la data amb els simbols de l'arbre
					System.out.println("F" + tab + "+-" + contingut[i].getName() + "   " + data.format(contingut[i].lastModified()));
					veureArbre(contingut[i], tab + "|  "); //tornem a cridar el mètode de forma recursiva.
				} 
			}
		}

	}
}