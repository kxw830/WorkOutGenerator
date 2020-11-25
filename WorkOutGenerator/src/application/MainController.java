package application;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML
    private AnchorPane main_view;

    @FXML
    private ToggleButton female_button;

    @FXML
    private ToggleButton other_button;

    @FXML
    private Button next_main_button;

    @FXML
    private TextField height_field;

    @FXML
    private TextField weight_field;

    @FXML
    private ToggleButton male_button;

    @FXML
    void show_goals_view() {
    	System.out.println("It got here");
    }
    
    @FXML
    void toggle_gender_buttons() {
    	System.out.println("It got here");
    	
    	
    	
       	System.out.println("Hey!!!!!!!!!!");
    }

}
