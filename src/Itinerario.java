public class Itinerario {
    byte numVuelo;
    String ciudadDestino, ciudadSalida;
    byte horaInicio, horaFinal;
    Piloto pilotoAsignado;
    Avion avionAsignado;
    public Itinerario(String salida,String destino, int hi, int hf){
        this.ciudadSalida = salida;
        this.ciudadDestino = destino;
        AsignarPiloto();
        AsignarAvion();
        AsignarHorario((byte)hi, (byte)hf);
        generadorAletorio();
    }
    public void AsignarPiloto(){
        this.pilotoAsignado = new Piloto();
    }
    public void AsignarAvion(){
        this.avionAsignado = new Avion();
    }
    public void AsignarHorario(byte hInicio, byte hFinal){
        this.horaInicio = hInicio;
        this.horaFinal = hFinal;
    }

    public void generadorAletorio(){
        numVuelo = (byte)(Math.random() * (10 - 0 + 10));
    }
}