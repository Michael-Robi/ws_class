package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class AppController {
  @FXML private ListView<String> theList;
  private final DataProvider<String> dataProvider;

  public AppController(DataProvider<String> dp) {
      this.dataProvider = dp;
  }
  public void initialize() {
    theList.getItems().addAll(dataProvider.getData());
  }
  public void addItem(ActionEvent ignored) {
    theList.getItems().add("Item " + theList.getItems().size());
  }
}