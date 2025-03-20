package models;

public class Sms extends Notificacion{

    public Sms(String mensaje){
        super(mensaje);
    }
    @Override
    public void enviar() {
        System.out.println("Enviando Email: " +getMensaje());
    }
}
