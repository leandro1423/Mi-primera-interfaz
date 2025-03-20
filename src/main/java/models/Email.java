package models;

public class Email extends Notificacion{

    public Email(String mensaje){
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Email: " +getMensaje());
    }
}
