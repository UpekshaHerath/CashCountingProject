package application;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
    private TextField amount1;

    @FXML
    private Label notes_1000;

    @FXML
    private Label notes_2;

    @FXML
    private Label notes_100;

    @FXML
    private Label notes_50;

    @FXML
    private Label notes_20;

    @FXML
    private Label notes_10;

    @FXML
    private Label notes_5;

    @FXML
    private Label notes_1;

    @FXML
    private Label notes_500;
    
    public void amountChecking() {
    	//taking the change by using the greedy approach
    	int amount = Integer.parseInt(amount1.getText());
    	
    	int note_1000 = 0;
		int note_500 = 0;
		int note_100 = 0;
		int note_50 = 0;
		int note_20 = 0;
		int note_10 = 0;
		int note_5 = 0;
		int note_2 = 0;
		int note_1 = 0;
		
		int temp = amount;
		
			if(temp >= 1000) {
				note_1000 = temp / 1000;
				temp = temp % 1000;
			}
			if (temp >= 500) {
				note_500 = temp / 500;
				temp = temp % 500;
			}
			if(temp >= 100) {
				note_100 = temp / 100;
				temp = temp % 100;
			}	
			if(temp >= 50) {
				note_50 = temp / 50;
				temp = temp % 50;
			}	
			if(temp >= 20) {
				note_20 = temp / 20;
				temp = temp % 20;
			}	
			if(temp >= 10) {
				note_10 = temp / 10;
				temp = temp % 10;
			}	
			if(temp >= 5) {
				note_5 = temp / 5;
				temp = temp % 5;
			}	
			if(temp >= 2) {
				note_2 = temp / 2;
				temp = temp % 2;
			}	
			if(temp >= 1) {
				note_1 = temp / 1;
				temp = temp % 1;
			}	
			
		notes_1000.setText(Integer.toString(note_1000));
		notes_500.setText(Integer.toString(note_500));
		notes_100.setText(Integer.toString(note_100));
		notes_50.setText(Integer.toString(note_50));
		notes_20.setText(Integer.toString(note_20));
		notes_10.setText(Integer.toString(note_10));
		notes_5.setText(Integer.toString(note_5));
		notes_2.setText(Integer.toString(note_2));
		notes_1.setText(Integer.toString(note_1));
    }
}
