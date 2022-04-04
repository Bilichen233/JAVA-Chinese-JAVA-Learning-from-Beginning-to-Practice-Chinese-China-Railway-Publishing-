import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GXJButton extends Application {
  protected Text text = new Text(50, 50, "JD双十一价格可能会便宜一点点，但是物流太慢！");
  protected BorderPane getPane() {
    HBox paneForButtons = new HBox(20);
    Button btLeft = new Button("左", 
      new ImageView("left.gif"));
      Button btRight = new Button("右", 
      new ImageView("right.gif"));   
    paneForButtons.getChildren().addAll(btLeft, btRight);
      paneForButtons.setAlignment(Pos.CENTER);
      paneForButtons.setStyle("-fx-border-color: green");

      BorderPane pane = new BorderPane();
    pane.setBottom(paneForButtons);
      Pane paneForText = new Pane();
      paneForText.getChildren().add(text);
    pane.setCenter(paneForText);    
    btLeft.setOnAction(e -> text.setX(text.getX() - 10));
    btRight.setOnAction(e -> text.setX(text.getX() + 10));    
    return pane;
  } 
  @Override
  public void start(Stage primaryStage) {
    //创建Scene对象scene
    Scene scene = new Scene(getPane(), 750, 200);
    primaryStage.setTitle("ButtonDemo"); //设置标题
    primaryStage.setScene(scene);
    primaryStage.show();
  }

	  public static void main(String[] args) {
		    launch(args);
		  }
}