package application;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class NewProjectPage extends VBox{
	
    private TextField projectNameField;
    private TextField startDateField;
    private TextField descriptionField;


    public NewProjectPage() {
    	
        Label title  = new Label("Bug Trak");
        Label subtitle = new Label("Welcome to your personal bug trackign system");
        Label projectName = new Label("Project Name");
        projectNameField = new TextField("Please enter project name");
        Label projectStartingDate = new Label("Project Starting Date");
        startDateField = new TextField("MM/DD/YYYY");
        Label description = new Label("Project Description");
        descriptionField = new TextField("Project Description");
        Button saveButton = new Button("Save");
        Button clearButton = new Button("Clear");

        getChildren().addAll(title, subtitle, projectName, projectNameField, 
        		projectStartingDate, startDateField, description, descriptionField, saveButton, clearButton);
        

        clearButton.setOnAction(event -> {
            projectNameField.clear();
            startDateField.clear();
            descriptionField.clear();
        });
        
    }
    
}
