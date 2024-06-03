import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TondeuseMain {

	public static void main(String[] args) {
		try {
			File file = new File(".\\ressources\\input.txt");
			BufferedReader bf = new BufferedReader(new FileReader(file));
			
			// Lecture de dimensions de la pelouse
			String poleuseDimensions [] = bf.readLine().split(" ");
			int pelouseLargeur = Integer.parseInt(poleuseDimensions[0]);
			int pelouseLongeur = Integer.parseInt(poleuseDimensions[1]);
			Pelouse pelouse = new Pelouse(pelouseLargeur, pelouseLongeur);
			
			String line;
			while((line = bf.readLine()) != null) {
				// Lecture initiale de position et orientation de la tendeus
				String [] initialPosition = line.split(" ");
				int x = Integer.parseInt(initialPosition[0]);
				int y = Integer.parseInt(initialPosition[1]);
				Orientation orientation = Orientation.valueOf(initialPosition[2]);
				Position position = new Position(x, y, orientation);	
				
				// Lecture d'instructions
				String instructions = bf.readLine();
				Tondeuse tandeuse = new Tondeuse(position, pelouse);
				tandeuse.executeInstructions(instructions);
				
				// Resultat final
				System.out.println(tandeuse.getPosition());
			} bf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
