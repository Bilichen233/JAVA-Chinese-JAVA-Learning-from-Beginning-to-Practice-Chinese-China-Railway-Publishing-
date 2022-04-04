import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GXJLabel extends Application  {
	  public void start(Stage primaryStage) {
	      ImageView us = new ImageView(new Image("123.jpg"));
	    Label lb1 = new Label("开发\n工具", us);
	      lb1.setStyle("-fx-border-color: green; -fx-border-width: 2");
	    lb1.setContentDisplay(ContentDisplay.BOTTOM);
	      lb1.setTextFill(Color.RED);
	    Label lb2 = new Label("Circle", new Circle(50, 50, 25));
	    lb2.setContentDisplay(ContentDisplay.TOP);
	      lb2.setTextFill(Color.ORANGE);
	    Label lb3 = new Label("Retangle", new Rectangle(10, 10, 50, 25));
	    lb3.setContentDisplay(ContentDisplay.RIGHT);
	    Label lb4 = new Label("Ellipse", new Ellipse(50, 50, 50, 25));
	    lb4.setContentDisplay(ContentDisplay.LEFT);
	    Ellipse ellipse = new Ellipse(50, 50, 50, 25);
	      ellipse.setStroke(Color.GREEN);
	      ellipse.setFill(Color.WHITE);
	      StackPane stackPane = new StackPane();
	    stackPane.getChildren().addAll(ellipse, new Label("JavaFX"));
	    Label lb5 = new Label("里面有文本", stackPane);
	      lb5.setContentDisplay(ContentDisplay.BOTTOM);
	    HBox pane = new HBox(20);
	    pane.getChildren().addAll(lb1, lb2, lb3, lb4, lb5);
	      Scene scene = new Scene(pane, 550, 150); 	//创建Scene对象scene
	      primaryStage.setTitle("Label实例");		//设置标题
	      primaryStage.setScene(scene);
	      primaryStage.show();					//显示Stage
	  }

	  public static void main(String[] args) {
		    launch(args);
		  }
}