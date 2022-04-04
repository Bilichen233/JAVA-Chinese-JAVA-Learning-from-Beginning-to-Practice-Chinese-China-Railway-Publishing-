import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LFlowPane extends Application  {
	  public void start(Stage primaryStage) {
	      //创建FlowPane面板对象pane并设置其属性
	    FlowPane pane = new FlowPane();
	    pane.setPadding(new Insets(11, 12, 13, 14));
	    pane.setHgap(5);
	    pane.setVgap(5);
	      //在pane对象中放置标签和文本
	    pane.getChildren().addAll(new Label("用户昵称:"), 
	      new TextField(), new Label("MI:"));
	    TextField tfMi = new TextField();
	    tfMi.setPrefColumnCount(1);
	    pane.getChildren().addAll(tfMi, new Label("用户密码:"),
	      new TextField()); 
	      //创建Scene对象scene，并放在stage中
	    Scene scene = new Scene(pane, 200, 250);
	      primaryStage.setTitle("ShowFlowPane");	//设置标题
	      primaryStage.setScene(scene);
	      primaryStage.show();					//显示stage
	  }

	  public static void main(String[] args) {
		    launch(args);
		  }
}