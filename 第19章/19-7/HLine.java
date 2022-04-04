import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
public class HLine extends Application {
	  public static void main(String[] args) {
	    launch(args);
	  }
public void start(Stage stage) {
    VBox box = new VBox();
    final Scene scene = new Scene(box,300, 250);	//窗体大小
    scene.setFill(null);
    Line line = new Line();						//绘制线条
    line.setStartX(0.0f);						//起始X坐标
    line.setStartY(0.0f); 						//起始Y坐标
    line.setEndX(100.0f); 						//终点X坐标
    line.setEndY(100.0f); 						//终点Y坐标
    box.getChildren().add(line);
    stage.setScene(scene);						//使用setter方法调用设置开始和结束坐标
    stage.show();
}
}