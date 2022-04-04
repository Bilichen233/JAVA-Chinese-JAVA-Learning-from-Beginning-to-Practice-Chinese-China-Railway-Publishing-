import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class ButtonInPane extends Application {
  @Override 
  public void start(Stage primaryStage) {
      //创建一个scene，在里面放置来一个button按钮
    StackPane pane = new StackPane();
    pane.getChildren().add(new Button("单击我提交订单"));    
    Scene scene = new Scene(pane, 200, 50);
      primaryStage.setTitle("Button in a pane"); 	//设置stage的标题
      primaryStage.setScene(scene);			//将scene放在stage中
      primaryStage.show(); //显示stage
  }
  public static void main(String[] args) { 
	    launch(args);
	  }
}