package MyWork;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.animation.PathTransition; 
import javafx.application.Application; 

import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 

import javafx.scene.shape.Circle; 
import javafx.scene.shape.LineTo; 
import javafx.scene.shape.MoveTo; 
import javafx.scene.shape.Path;  

import javafx.stage.Stage; 
import javafx.util.Duration; 
 /**
  * This class create a boss movement 
  * @author jcmar
  *
  */

   public class Boss extends Application {   
 
   public void start(Stage stage) {   
       
	   
	      
	 //Creating the boss
	  ImageView boss = new ImageView();
	  boss.setImage(new Image("file:\\Images\\Boss.png"));
      
	  boss.setFitWidth(150);

	  boss.setPreserveRatio(true);
     
      
      //Creating a Path 
      Path path = new Path(); 
      
      //Moving to the starting point 
      MoveTo moveTo = new MoveTo(50, 50);               
      
      //Creating 1st line 
      LineTo line1 = new LineTo(750, 50);      
      
           
      //Adding all the elements to the path  
      path.getElements().add(moveTo); 
      path.getElements().addAll(line1);     
      
      
      //Creating the path transition 
      PathTransition pathTransition = new PathTransition(); 
      
      //Setting the duration of the transition 
      pathTransition.setDuration(Duration.millis(2000));       
      
      //Setting the node for the transition 
      pathTransition.setNode(boss); 
      
      //Setting the path for the transition 
      pathTransition.setPath(path); 
      
      //Setting the orientation of the path 
      pathTransition.setOrientation(
         PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT); 
      
      //Setting the cycle count for the transition 
      pathTransition.setCycleCount(50); 
      
      //Setting auto reverse value to off
      pathTransition.setAutoReverse(true); 
      
      //Playing the animation 
      pathTransition.play(); 
             
      //Creating a Group object  
      Group root = new Group(boss); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 800, 600);  
      
      //Setting title to the Stage 
      stage.setTitle("Path transition"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }
   public static void main(String args[]){ 
      launch(args); 
   } 
} 
