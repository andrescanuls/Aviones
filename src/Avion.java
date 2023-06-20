public class Avion {
    byte nAvion;
    String modelo = "UF15";
    String Tipo = "Pasajero";
    byte Capacidad = 40;

    public Avion(){
        generadorAletorio();
    }
    public void generadorAletorio(){
        nAvion = (byte)(Math.random() * (10 - 0 + 10));
    }
}