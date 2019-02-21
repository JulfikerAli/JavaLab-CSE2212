package Sample;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;

import javafx.scene.Scene;

import javafx.stage.Stage;


public class JavafxSample extends Application {

    

    @Override

    public void start(Stage stage) throws Exception {
    	
    	Parent root = FXMLLoader.load(getClass().getResource("/genuinecoder/main/calculator.fxml"));

        

        Scene scene = new Scene(root);

        

        stage.setScene(scene);

        stage.centerOnScreen();

        stage.setTitle("Genuine Coder");

        stage.show();

    }
    public static void main(String[] args) {

    launch(args);

}



}