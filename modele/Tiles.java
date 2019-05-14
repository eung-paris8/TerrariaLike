package modele;
import javafx.scene.image.Image;
public class Tiles {
	public static Image selectionTile(int choix) {
		
		if(choix== -1) {
			return null;
		}
		else {
			
		}
		return new Image("ressources/Tileset.png");
	}
	
	public static int TileSize() {
		return 32;
	}
	
}
