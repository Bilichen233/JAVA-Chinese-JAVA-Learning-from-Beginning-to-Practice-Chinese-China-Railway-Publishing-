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
    stage.setTitle("Label Sample");			//�������
    stage.setWidth(400); 					//���ô�����
    stage.setHeight(180); 					//���ô���߶�
    HBox hbox = new HBox();
    //�������
    Label label1 = new Label("С��6X��ǰ��2000�����˸���");
    label1.setTextFill(Color.web("#0076a3"));		//����������ɫ
    hbox.setSpacing(10);					//�������¼��
    hbox.getChildren().add((label1));			//�����ַ��ڴ�����
    ((Group) scene.getRoot()).getChildren().add(hbox);
    stage.setScene(scene);
    stage.show();
  }
  }
