package vista;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.Lottery;

public class LotteryFX extends Application {
	
	public static void main(String[] args) {
	    
    	launch(args);
    
    }

	    private Label resultLabel;

	    @Override
	    public void start(Stage primaryStage) {
	    	
	        primaryStage.setTitle("Lotería");

	        resultLabel = new Label();
	        resultLabel.setStyle("-fx-font-size: 24;");

	        Button generateButton = new Button("Generar número");
	        generateButton.setOnAction(e -> generateLotteryNumber());

	        VBox root = new VBox(10);
	        root.setPadding(new Insets(20));
	        root.getChildren().addAll(resultLabel, generateButton);
	        root.setStyle("-fx-background-color: #f0f0f0; -fx-alignment: center;");

	        Scene scene = new Scene(root, 300, 200);
	        primaryStage.setScene(scene);

	        primaryStage.show();
	        
	    }

	    private void generateLotteryNumber() {
	    	
	        Lottery lottery = new Lottery();
	        String randomNumber = lottery.generateLotteryNumber();
	        resultLabel.setText(randomNumber);
	    
	    }

	}

