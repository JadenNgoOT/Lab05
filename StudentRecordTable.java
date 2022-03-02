package Labs.Lab05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentRecordTable extends Application{

    @Override
    public void start(Stage stage){
        TableView<StudentRecord> table = new TableView<>();

        table.getItems().addAll(DataSource.getAllMarks());

        table.getColumns().addAll(DataSource.getIDColumn(), DataSource.getAssignmentColumn(), DataSource.getMidtermColumn(), DataSource.getFinalExamColumn(), DataSource.getFinalColumn(), DataSource.getLetterColumn());

        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        table.setPlaceholder(new Label("No visible columns and/or data exist."));

        // Create the VBox
        VBox root = new VBox();
        // Add the Table to the VBox
        root.getChildren().add(table);
        // Set the Padding and Border for the VBox
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        // Create the Scene
        Scene scene = new Scene(root);
        // Add the Scene to the Stage
        stage.setScene(scene);
        // Set the Title of the Stage
        stage.setTitle("A simple TableView Example");
        // Display the Stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
