
import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {	ArrayList<MovableObjects> listeObjets;
		try {
			FXMLLoader loader = new FXMLLoader(); 											
			URL url = new File("vue/vueMonde.fxml").toURI().toURL();		
			loader.setLocation(url);													
			System.out.println(loader.getLocation());							
			Pane root = new Pane(); 									
			root = loader.load();	
			Scene scene = new Scene(root,root.getPrefWidth(),root.getPrefHeight());										
			primaryStage.setScene(scene);												
			primaryStage.show();															
		} catch (Exception e) {
			e.printStackTrace();													
		}
	}


}