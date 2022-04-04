import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LStack extends Application  {
	  public void start(Stage primaryStage) {
		    //创建scene对象，并在里面放一个按钮
		    StackPane pane = new StackPane();
		    pane.getChildren().add(new Button("按钮"));    
		    Scene scene = new Scene(pane, 500, 200);
		    primaryStage.setTitle("按钮是一个pane"); //设置标题
		    primaryStage.setScene(scene);
		    primaryStage.show();
		  }

	  public static void main(String[] args) {
		    launch(args);
		  }
}