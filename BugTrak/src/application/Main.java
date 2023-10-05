package application;

import SQL.*;
import java.sql.*;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;

public class Main extends Application {

	//connect to database
	Connection conn = Queries.Connect();
	
	@Override
	public void start(Stage primaryStage) {
		try {

			// Layout Manager
			VBox root = new VBox();

			// width x height
			Scene scene = new Scene(root, 800, 400);

			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);

			// show whatever is set
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// Launch method inherited from Application
		launch(args);
	}
}
