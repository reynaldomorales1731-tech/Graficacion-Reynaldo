package com.silvasystems.imagen.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImagenController {
    @FXML
    private Button btnMostrarImagen;

    @FXML
    protected void onDraw(ActionEvent actionEvent) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Pictures\\Saved Pictures\\imagen.jpg"); // Asegúrate de que esta sea la ruta correcta
            Image image = new Image(fis, 600, 500, false, false);
            ImageView imageView = new ImageView(image);
            imageView.setX(5120);
            imageView.setY(2880);
            Group root = new Group(imageView);
            btnMostrarImagen.getScene().setRoot(root);
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Manejo de la excepción
        }
    }
}
