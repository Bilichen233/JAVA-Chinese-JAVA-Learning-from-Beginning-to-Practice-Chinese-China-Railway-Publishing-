import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LStack extends Application  {
	  public void start(Stage primaryStage) {
		    //����scene���󣬲��������һ����ť
		    StackPane pane = new StackPane();
		    pane.getChildren().add(new Button("��ť"));    
		    Scene scene = new Scene(pane, 500, 200);
		    primaryStage.setTitle("��ť��һ��pane"); //���ñ���
		    primaryStage.setScene(scene);
		    primaryStage.show();
		  }

	  public static void main(String[] args) {
		    launch(args);
		  }
}