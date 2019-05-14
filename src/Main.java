
import java.io.File;
import java.net.URL;

import controleur.Controleur;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {	
		try {
			FXMLLoader loader = new FXMLLoader(); 											
			URL url = new File("vue/vueJeu.fxml").toURI().toURL();		
			loader.setLocation(url);													
			System.out.println(loader.getLocation());							
			BorderPane root = new BorderPane(); 									
			root = loader.load();
	     	Scene scene = new Scene(root,root.getPrefWidth(),root.getPrefHeight());
	     	primaryStage.setScene(scene);												
			primaryStage.show();														
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);																	
	}

}