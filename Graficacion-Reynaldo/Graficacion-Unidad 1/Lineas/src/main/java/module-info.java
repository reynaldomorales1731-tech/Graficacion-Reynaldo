module com.silvasystems.lineas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.silvasystems.lineas to javafx.fxml;
    exports com.silvasystems.lineas;
    exports com.silvasystems.lineas.controller;
    opens com.silvasystems.lineas.controller to javafx.fxml;
}