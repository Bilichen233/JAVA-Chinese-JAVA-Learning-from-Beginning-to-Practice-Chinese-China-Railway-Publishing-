import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class ButtonInPane extends Application {
  @Override 
  public void start(Stage primaryStage) {
      //����һ��scene�������������һ��button��ť
    StackPane pane = new StackPane();
    pane.getChildren().add(new Button("�������ύ����"));    
    Scene scene = new Scene(pane, 200, 50);
      primaryStage.setTitle("Button in a pane"); 	//����stage�ı���
      primaryStage.setScene(scene);			//��scene����stage��
      primaryStage.show(); //��ʾstage
  }
  public static void main(String[] args) { 
	    launch(args);
	  }
}