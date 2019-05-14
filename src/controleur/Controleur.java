package controleur;
import javafx.util.Duration;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import modele.Carte;
import modele.Monde;
import vue.vueMonde;

public class Controleur implements Initializable{
	
	private Timeline gameLoop;
	private int temps;

    @FXML
    private Pane fond_terrain;
    @FXML
    private Pane blocks_terre;
    
    Monde theWorld = new Monde();
    Carte background = new Carte("ressource/Carte_Background.csv");
    Carte premierPlan = new Carte("ressource/Carte_Premier_Plan.csv");
    vueMonde mondeView = new vueMonde(theWorld);
    
    private void initAnimation() {
		gameLoop = new Timeline();
		gameLoop.setCycleCount(Timeline.INDEFINITE);

		KeyFrame kf = new KeyFrame(
				Duration.seconds(0.1), (ev ->{
					if(temps==1000){
						System.out.println("fini");
					}		
				})
		);
		gameLoop.getKeyFrames().add(kf);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initAnimation();
		gameLoop.play();
		mondeView.creerVue(premierPlan, blocks_terre);
		mondeView.creerVue(background, fond_terrain);	}
}