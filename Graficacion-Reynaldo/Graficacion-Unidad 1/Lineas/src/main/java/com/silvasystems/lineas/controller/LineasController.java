package com.silvasystems.lineas.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.shape.Line;

public class LineasController {
    @FXML
    private Button btnMostrarLineas;


    @FXML
    public void onDraw(ActionEvent actionEvent) {
        Line line = new Line();
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);
        Group root = new Group(line);
        btnMostrarLineas.getScene().setRoot(root);
        // otra linea
        Canvas miCanvas = new Canvas(600, 400);

        GraphicsContext gc = miCanvas.getGraphicsContext2D();
        gc.strokeLine(10, 10, 100, 100);
        root.getChildren().add(miCanvas);

    }
}