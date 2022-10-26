package S1T5N1E3;

import java.io.File;
import java.io.FileWriter;


public class MainDir {

	public static void main(String[] args) throws Exception {
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
	//mètode per veure la ruta
	public static void veureArbre(File carpeta, String tab) { //afegim la direcció (File) i un tabulador que farà de espais o simbols al mètode
		String arxiu = escriureArxiu("\n"); //creem la variable arxiu i li afegim el mètode escriureArxiu amb "\n" perque guardi la ruta tabulada 
		
		File contingut[] = carpeta.listFiles(); //fiquem la direcció a la Array contingut

		if (contingut != null) {
			for (int i = 0; i < contingut.length; i++) {
				if (contingut[i].isDirectory()) {//li diem que si es directory imprimexi D el directori i la data amb els simbols de l'arbre
					arxiu = "D" + tab + "+-" + contingut[i].getName();
					veureArbre(contingut[i], tab + "|  "); //cridem al mètode de forma recursiva.
				} else if (contingut[i].isFile()) {//li diem que si es arxiu imprimexi F i la data amb els simbols de l'arbre
					arxiu = "F" + tab + "+-" + contingut[i].getName();
					escriureArxiu(arxiu); //escribim la ruta al txt amb el mètode
					veureArbre(contingut[i], tab + "|  "); //tornem a cridar el mètode de forma recursiva.
				} 
			}
		}
	}
	//mètode per escriure la ruta
	public static String escriureArxiu(String arxiu) {
		String frase = arxiu;
		try {
			FileWriter escriureArxiu = new FileWriter("C:\\CLASE\\readme.txt",true); //indiquem la direcció on guardarem l'arxiu txt.
			
			for(int i = 0; i < frase.length(); i++) {//i sigui es igual 0 i sigui menor que la longitud de la frase
				escriureArxiu.write(frase.charAt(i));
			}
			escriureArxiu.close();
		} catch (Exception ex) {
			System.out.println("Error al escriure l'arxiu."); // si no hi ha arxiu llença la Exepció
	}
		return frase;
}
}
			
			
		
