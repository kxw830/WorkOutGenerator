package Model;

import javafx.scene.control.ToggleButton;

public class MainModel {
	
	public static void toggle_gender_buttons(ToggleButton M, ToggleButton F, ToggleButton O, String type) {
		if(type == "male") {
			M.getStyleClass().clear();
			M.getStyleClass().add("input-field-select");
			
			F.getStyleClass().clear();
			F.getStyleClass().add("input-field");
			
			O.getStyleClass().clear();
			O.getStyleClass().add("input-field");
		} else if(type == "female") {
			F.getStyleClass().clear();
			F.getStyleClass().add("input-field-select");

			M.getStyleClass().clear();
			M.getStyleClass().add("input-field");
			
			O.getStyleClass().clear();
			O.getStyleClass().add("input-field");
		} else if(type == "other") {
			O.getStyleClass().clear();
			O.getStyleClass().add("input-field-select");
			
			F.getStyleClass().clear();
			F.getStyleClass().add("input-field");
			
			M.getStyleClass().clear();
			M.getStyleClass().add("input-field");
		}
	}
	

}
