package MyWork;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import javafx.event.EventHandler;

import javafx.scene.input.KeyEvent;

import javafx.scene.input.KeyCode;

/**
 * This class create a player movement
 * @author jcmar
 *
 */

public class MovePlayer extends Application{

public static void main(String[] args){
launch(args);
}



@Override
public void start(Stage primaryStage){

//Constants for the scene size

final double SCENE_WIDTH = 800.0;

final double SCENE_HEIGHT = 500.0;



//Constants for the player

final double START_X = 100.0, START_Y = 40.0;

final double RADIUS = 10.0;

final double STEP = 2.0;



//Create the player.
Pane pane = new Pane();
Image player = new Image("file:C:\\Images\\character.png");
ImageView imageView = new ImageView();
imageView.setImage(player);
pane.getChildren().add(imageView);

//Create a Scene and display it.

Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);

//Register a KEY_PRESSED handler for the scene.

scene.setOnKeyPressed(event ->{

//Check for the down-arrow key.

if (event.getCode() == KeyCode.DOWN && imageView.getY() < (SCENE_HEIGHT - RADIUS)){
   
	imageView.setY(imageView.getY() + STEP);
}

//Check for the up-arrow key.
if (event.getCode() == KeyCode.UP &&imageView.getY() > RADIUS){

	imageView.setY(imageView.getY() - STEP);

}

//Check for the right-arrow key.
if (event.getCode() == KeyCode.RIGHT && imageView.getX() < (SCENE_WIDTH - RADIUS)){

	imageView.setX(imageView.getX() + STEP);

}

//Check for the left-arrow key.
if (event.getCode() == KeyCode.LEFT && imageView.getX()   > RADIUS){

	imageView.setX(imageView.getX() - STEP);

}
});
//Set the scene on the stage and display it.

primaryStage.setScene(scene);

primaryStage.show();

}

}