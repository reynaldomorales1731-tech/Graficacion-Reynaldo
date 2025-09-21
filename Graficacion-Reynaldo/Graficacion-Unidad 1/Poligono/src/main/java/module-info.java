module com.silvasystems.poligono {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.silvasystems.poligono to javafx.fxml;
    exports com.silvasystems.poligono;
    exports com.silvasystems.poligono.controller;
    opens com.silvasystems.poligono.controller to javafx.fxml;
}