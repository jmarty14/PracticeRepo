package MyWork;



import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Game Main Menu
 * @author jcmar
 *
 */
public class MainMenu extends Application {
	
	
	  public static void main(String[] args) {
			launch();
		}
	
	public void start(Stage primaryStage) {
   
		
		// font size of letter
		Font font = Font.font(20);
		//Start button		
		Button Start = new Button("PLAY GAME");
		Start.setFont(font);
		
		
		//Exit Button		
		Button Exit = new Button("EXIT");
		Exit.setFont(font);
				
		//Putting the buttons vertical	
		VBox vbox = new VBox(10, Start, Exit);
		vbox.setTranslateX(350);
		vbox.setTranslateY(200);
		
	      Scene scene = new Scene(vbox, 800, 500);
		  primaryStage.setScene(scene);
		  primaryStage.show();
	}
		
		  
	
		
	}
	

	
	


	


	/**
	 * Launch the GUI Window
	 * @param args String array of arguments.
	 */
   
	
		
	
