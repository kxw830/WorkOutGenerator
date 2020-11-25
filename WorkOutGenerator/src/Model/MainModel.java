package Model;

import javafx.scene.control.ToggleButton;

public class MainModel {
	
	public static void toggle_gender_buttons(ToggleButton M, ToggleButton F, ToggleButton O, String type) {
		if(type == "male") {
			M.getStyleClass().add("input-field-select");
			M.getStyleClass().remove("input-field");
			
			F.getStyleClass().remove("input-field-select");
			F.getStyleClass().add("input-field");
			
			O.getStyleClass().add("input-field");
			O.getStyleClass().remove("input-field-select");
		} else if(type == "female") {
			F.getStyleClass().add("input-field-select");
			F.getStyleClass().remove("input-field");
			
			M.getStyleClass().add("input-field");
			M.getStyleClass().remove("input-field-select");
			
			O.getStyleClass().add("input-field");
			O.getStyleClass().remove("input-field-select");
		} else if(type == "other") {
			O.getStyleClass().add("input-field-select");
			O.getStyleClass().remove("input-field");
			
			F.getStyleClass().add("input-field");
			F.getStyleClass().remove("input-field-select");
			
			M.getStyleClass().add("input-field");
			M.getStyleClass().remove("input-field-select");
		}
	}

}
