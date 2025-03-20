module org.example.mensajeinterfazgrafica {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.mensajeinterfazgrafica to javafx.fxml;
    exports org.example.mensajeinterfazgrafica;
    exports controllers;
    opens controllers to javafx.fxml;
}