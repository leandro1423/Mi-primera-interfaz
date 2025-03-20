package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

public class NotificacionController {

    @FXML
    private ChoiceBox<String> cbTipoMensaje;

    @FXML
    private TextArea txtMensaje;

    @FXML
    private Button btnEnviar;

    @FXML
    public void enviarMensaje() {
        System.out.println("¡Mensaje enviado!");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText(null);
        alert.setContentText("¡Su mensaje ha sido enviado!");
        alert.showAndWait();
    }


    @FXML
    public void initialize() {
        // Agregar opciones al ChoiceBox
        cbTipoMensaje.getItems().addAll("SMS", "Email");

        // Evento cuando se selecciona un elemento
        cbTipoMensaje.setOnAction(event -> {
            String seleccion = cbTipoMensaje.getValue();
            System.out.println("Seleccionaste: " + seleccion);
        });
    }


}
