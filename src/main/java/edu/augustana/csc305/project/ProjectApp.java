package edu.augustana.csc305.project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjectApp extends Application {

    @Override public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new HelloView(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Amazing CSC 305 Project!");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}