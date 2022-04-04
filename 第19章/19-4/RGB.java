import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RGB extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Text");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);	//��ɫ�ľ�������
        int x = 100;						//x���궨λ
        int y = 100; 						//y���궨λ
        int red = 30;						//��ɫֵ
        int green = 40; 					//��ɫֵ
        int blue = 50; 					//��ɫֵ
        Text text = new Text(x, y, "���κ����ֻ��Ѿ���������ӭ�´ι��٣�");	//������ʾ���ı�����text
        text.setFill(Color.rgb(red, green, blue, .99));	//�����ɫ
        text.setRotate(60);					//��ת�ı�60��
        root.getChildren().add(text);			//����ı�
        primaryStage.setScene(scene);
        primaryStage.show();
    }
} 
