package S1T5N1E5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainDir {

	public static void serialitzar(Alumnes alumnat) { //generm una secuencia de bytes lleste per ser emmagatzemada o transmesa
		try {
			FileOutputStream llista = new FileOutputStream("C:\\CLASE\\readme.ser"); //direcció on anirà l'arxiu .ser
			ObjectOutputStream llistaAlum = new ObjectOutputStream(llista); //sortida per serializar objectes
			
			if (llistaAlum != null)
			
				llistaAlum.writeObject(alumnat); //escribim objectes serialitzables
				llistaAlum.close(); //tanquem l'arxiu
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al veure l'arxiu."); // si no hi ha arxiu llença la Exepció
		}
	}
		
		public static void desserialitzar() { //construïm l'objecta que estava serialtzat
		try {	
			FileInputStream llista = new FileInputStream("C:\\CLASE\\readme.ser"); //agafem l'arxiu serialitzat
			ObjectInputStream llistaAlum = new ObjectInputStream(llista); //entrada per desserialitzar objectes
			
			if (llistaAlum != null)
				
			System.out.println(llistaAlum.readObject());//lectura d'bjectes serialitzats i ho mostrem
			llistaAlum.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al veure l'arxiu."); // si no hi ha arxiu llença la Exepció
		}
	}

	public static void main(String[] args) throws Exception {

		Alumnes alumnat = new Alumnes("Ismael", "Tortosa", 39);
		
		serialitzar(alumnat);
		desserialitzar();

		// TODO Auto-generated method stub

	}

}
