import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class CircleCenter extends Application {
	  @Override
	  public void start(Stage primaryStage) {    
	    //创建pane对象来放置circle 
	    Pane pane = new Pane();
	    Circle circle = new Circle();
	  circle.centerXProperty().bind(pane.widthProperty().divide(2));
	  circle.centerYProperty().bind(pane.heightProperty().divide(2));
	    circle.setRadius(50);
	    circle.setStroke(Color.BLACK); 
	    circle.setFill(Color.WHITE);
	    pane.getChildren().add(circle);			//将circle添加到pane
	    //创建一个指定大小的scene并放置到stage
	    Scene scene = new Scene(pane, 200, 200);
	    primaryStage.setTitle("ShowCircleCentered");	//设置stage 标题
	    primaryStage.setScene(scene);				//将scene放置到stage
	    primaryStage.show();					//显示stage
	  }
	  public static void main(String[] args) { 
		    launch(args);
		  }
}
