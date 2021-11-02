package ucf.assignment;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */

public class HelloApplication extends javafx.application.Application {
    @Override
    //starts up the whole program
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/mainScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("To-Do App");//name of stage
        stage.setScene(scene);//create the program window
        stage.show(); //shows the visual stage
    }

    public static void main(String[] args) {

        launch(); //starts the program

    } }

