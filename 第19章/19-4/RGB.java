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
        Scene scene = new Scene(root, 300, 250, Color.WHITE);	//白色的矩形区域
        int x = 100;						//x坐标定位
        int y = 100; 						//y坐标定位
        int red = 30;						//红色值
        int green = 40; 					//绿色值
        int blue = 50; 					//蓝色值
        Text text = new Text(x, y, "本次红米手机已经售罄，欢迎下次光临！");	//创建显示的文本对象text
        text.setFill(Color.rgb(red, green, blue, .99));	//填充颜色
        text.setRotate(60);					//旋转文本60度
        root.getChildren().add(text);			//添加文本
        primaryStage.setScene(scene);
        primaryStage.show();
    }
} 
