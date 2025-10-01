package edu.augustana.csc305.project;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class HelloView extends HBox {

    public HelloView() {
        super(buildLabel());
        this.setSpacing(7);
        this.setPadding(new Insets(0, 0, 0, 50));
        this.setAlignment(Pos.CENTER_LEFT);
    }

    private static Label buildLabel() {
        Label label = new Label();
        label.setText("This project is going to be great!");
        return label;
    }
}
