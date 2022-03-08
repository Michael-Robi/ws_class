package sample;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class AppMain extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    // Initialized via DI framework
    AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("app.fxml"));
    Scene scene = new Scene(root);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
  }
  
  public static void main(String[] args) {
		launch(args);
	}
}