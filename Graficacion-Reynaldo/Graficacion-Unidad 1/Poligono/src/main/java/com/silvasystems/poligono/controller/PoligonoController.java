package com.silvasystems.poligono.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Polygon;

public class PoligonoController {
    @FXML
    private Button btnMostrarPoligono;

    @FXML
    protected void onDraw(ActionEvent actionEvent){
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                200.0, 50.0,
                400.0, 50.0,
                450.0, 150.0,
                400.0, 250.0,
                200.0, 250.0,
                150.0, 150.0,
        });
        Group root = new Group(polygon);
        btnMostrarPoligono.getScene().setRoot(root);

    }
}