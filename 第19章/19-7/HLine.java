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
    final Scene scene = new Scene(box,300, 250);	//�����С
    scene.setFill(null);
    Line line = new Line();						//��������
    line.setStartX(0.0f);						//��ʼX����
    line.setStartY(0.0f); 						//��ʼY����
    line.setEndX(100.0f); 						//�յ�X����
    line.setEndY(100.0f); 						//�յ�Y����
    box.getChildren().add(line);
    stage.setScene(scene);						//ʹ��setter�����������ÿ�ʼ�ͽ�������
    stage.show();
}
}