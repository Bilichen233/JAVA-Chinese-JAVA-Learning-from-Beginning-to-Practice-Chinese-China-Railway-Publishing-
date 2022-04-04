import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Zi extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("");
    Group root = new Group();
    Scene scene = new Scene(root, 500, 250, Color.WHITE);

    Group g = new Group();


    Text t = new Text();
    t.setCache(true);
    t.setX(10.0);
    t.setY(70.0);
    t.setFill(Color.RED);
    t.setText("小米8SE，晓龙710全球首发");
    t.setFont(Font.font(null, FontWeight.BOLD, 32));
    g.getChildren().add(t);

    root.getChildren().add(g);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}