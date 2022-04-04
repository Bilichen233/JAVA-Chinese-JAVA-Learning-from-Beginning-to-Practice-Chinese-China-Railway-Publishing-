import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class WEB extends Application {
	  public static void main(String[] args) {
	    launch(args);
	  }

  public void start(Stage stage) {
    Scene scene = new Scene(new Group());
    stage.setTitle("Label Sample");			//窗体标题
    stage.setWidth(400); 					//设置窗体宽度
    stage.setHeight(180); 					//设置窗体高度
    HBox hbox = new HBox();
    //添加文字
    Label label1 = new Label("小米6X，前后2000万，拍人更美");
    label1.setTextFill(Color.web("#0076a3"));		//设置文字颜色
    hbox.setSpacing(10);					//设置上下间距
    hbox.getChildren().add((label1));			//将文字放在窗体中
    ((Group) scene.getRoot()).getChildren().add(hbox);
    stage.setScene(scene);
    stage.show();
  }
  }
