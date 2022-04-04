import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
  @Override 
  public void start(Stage primaryStage) {
    Button btOK = new Button("所有的优衣库商品一律3-5折！");
    Scene scene = new Scene(btOK, 200, 250);
    primaryStage.setTitle("国庆活动");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  public static void main(String[] args) { 
    launch(args);
  }
}

