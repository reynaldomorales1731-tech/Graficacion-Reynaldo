module com.silvasystems.imagen {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.silvasystems.imagen to javafx.fxml;
    exports com.silvasystems.imagen;
    exports com.silvasystems.imagen.controller;
    opens com.silvasystems.imagen.controller to javafx.fxml;
}