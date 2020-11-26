package Model;

import application.CurrentUser;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ToggleButton;

public class MainModel {
	
	static CurrentUser userNew = new CurrentUser();
	
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
			F.getStyleClass().add("inpudt-field");
			
			M.getStyleClass().clear();
			M.getStyleClass().add("input-field");
		}
		
		CurrentUser.gender = type;
	}
	
	private static boolean is_numeric(String str) {
		  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
	
	public static void validate_weight_height(String weight, String height) {
		boolean checkWeight = is_numeric(weight);
		
		if (checkWeight == false) {
			Alert a = new Alert(AlertType.NONE);
			a.setAlertType(AlertType.ERROR);
			a.setContentText("Weight Field is not a number. ");
			a.show();
			return;
		}
		
		System.out.println("It" + height);
		
		if (height == "") {
			Alert a = new Alert(AlertType.NONE);
			a.setAlertType(AlertType.ERROR);
			a.setContentText("Height Field is not a number. ");
			a.show();
			return;
		}
		int iWeight = Integer.parseInt(weight);
		CurrentUser.weight = iWeight;
		
		return;
		
	}
}
