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
	    //����pane����������circle 
	    Pane pane = new Pane();
	    Circle circle = new Circle();
	  circle.centerXProperty().bind(pane.widthProperty().divide(2));
	  circle.centerYProperty().bind(pane.heightProperty().divide(2));
	    circle.setRadius(50);
	    circle.setStroke(Color.BLACK); 
	    circle.setFill(Color.WHITE);
	    pane.getChildren().add(circle);			//��circle��ӵ�pane
	    //����һ��ָ����С��scene�����õ�stage
	    Scene scene = new Scene(pane, 200, 200);
	    primaryStage.setTitle("ShowCircleCentered");	//����stage ����
	    primaryStage.setScene(scene);				//��scene���õ�stage
	    primaryStage.show();					//��ʾstage
	  }
	  public static void main(String[] args) { 
		    launch(args);
		  }
}
