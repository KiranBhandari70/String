package reverseString;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ReverseClass extends Application {

    @Override
    public void start(Stage primaryStage) {
       
        Label lbltext = new Label("Enter the Text");
        lbltext.setStyle("-fx-font-weight: bold;");

        TextField txtone = new TextField();

        Button btnsubmit = new Button("Submit");

        Label lblres = new Label();
        lblres.setStyle("-fx-text-fill: Brown ; -fx-font-weight: bold;");

        btnsubmit.setOnAction(e -> {
            String inputText =txtone.getText();
            String reversedText = new StringBuilder(inputText).reverse().toString();
            lblres.setText("Reversed String: " + reversedText);
        });

        VBox vbox = new VBox(10, lbltext, txtone, btnsubmit,lblres);
        vbox.setPadding(new Insets(25));
        vbox.setStyle("-fx-background-color: Gray ; -fx-alignment: center; -fx-pref-width: 250px;");

        Scene scene = new Scene(vbox);
        primaryStage.setTitle("Reverse String");
        
    	primaryStage.setWidth(300);
		primaryStage.setHeight(300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}