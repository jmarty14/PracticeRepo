package MyWork;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Atarashi extends Application {
  
	public static void main(String[] args) {
			launch();
		}
	public void start(Stage stage) throws Exception {
		
		  //Create the Image components.
            Image Boss = new Image("file:\\Images\\Boss.png");

			ImageView bossIView = new ImageView(Boss);
			//Resize the image, preserving its aspect ratio.

			bossIView.setFitWidth(200);

			bossIView.setPreserveRatio(true);
            //Create a GridPane.

			GridPane gridpane = new GridPane();
			//Add the ImageViews to the GridPane.

			gridpane.add(bossIView, 50, 0); // Col 50, Row 0

			//Set the gap sizes.

			gridpane.setVgap(10);

			gridpane.setHgap(10);

            //Set the GridPane's padding.

			gridpane.setPadding(new Insets(30));

            //Create a Scene with the GridPane as its root node.

			Scene scene = new Scene(gridpane, 800, 500, Color.GREEN);


            //Add the Scene to the Stage.

		    stage.setScene(scene);


            //Set the stage title.

		    stage.setTitle("Atarashi");



			//Show the window.

			stage.show();
			}
			

	}
	
	




