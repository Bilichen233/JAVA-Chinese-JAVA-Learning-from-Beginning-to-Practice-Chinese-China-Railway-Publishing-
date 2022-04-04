import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LFlowPane extends Application  {
	  public void start(Stage primaryStage) {
	      //����FlowPane������pane������������
	    FlowPane pane = new FlowPane();
	    pane.setPadding(new Insets(11, 12, 13, 14));
	    pane.setHgap(5);
	    pane.setVgap(5);
	      //��pane�����з��ñ�ǩ���ı�
	    pane.getChildren().addAll(new Label("�û��ǳ�:"), 
	      new TextField(), new Label("MI:"));
	    TextField tfMi = new TextField();
	    tfMi.setPrefColumnCount(1);
	    pane.getChildren().addAll(tfMi, new Label("�û�����:"),
	      new TextField()); 
	      //����Scene����scene��������stage��
	    Scene scene = new Scene(pane, 200, 250);
	      primaryStage.setTitle("ShowFlowPane");	//���ñ���
	      primaryStage.setScene(scene);
	      primaryStage.show();					//��ʾstage
	  }

	  public static void main(String[] args) {
		    launch(args);
		  }
}