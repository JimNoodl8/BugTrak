package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomePage extends Application {

    @Override
    public void start(Stage primaryStage) {
    	
        // Create the main layout
        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: white;");

        // Create a StackPane for the top-center position
        StackPane topStackPane = new StackPane();
        Text title = new Text("BugTrak");
        title.setFont(Font.font(30));
        topStackPane.getChildren().add(title);
        // Change the title position
        topStackPane.setPadding(new Insets(10, 0, 0, 0));
        borderPane.setTop(topStackPane);
        

        // Create the welcome text
        Text welcomeText = new Text("Welcome to your personal bug tracking system");
        welcomeText.setFont(Font.font(18));
        StackPane welcomeStackPane = new StackPane(welcomeText);
        
        // Change the welcome message position
        welcomeStackPane.setPadding(new Insets(100, 0, 0, 0));
        topStackPane.getChildren().add(welcomeStackPane);
        borderPane.setTop(topStackPane);

        // Create the "Create" button
        Button createButton = new Button("Create");

        // Customize button size
        createButton.setMinSize(100, 30);
        createButton.setMaxSize(100, 30);

        // Create a VBox for the bottom section
        VBox bottomVBox = new VBox(createButton);
        bottomVBox.setAlignment(Pos.BOTTOM_RIGHT);
        bottomVBox.setPadding(new Insets(10));

        // Set the bottom of the BorderPane to the VBox
        borderPane.setBottom(bottomVBox);


        // Set up the scene
        Scene scene = new Scene(borderPane, 800, 500);
        primaryStage.setTitle("BugTrak App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
