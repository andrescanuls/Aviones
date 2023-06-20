import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cs = "a", cd = "b";
        int hi = 10, hf = 12;

        Itinerario  horario1 = new Itinerario(cs,cd,hi,hf);

        System.out.println("¿Desea agendar un vuelo");

        /*
        String cs, cd;
        int hi, hf;

        System.out.println("Seleccionar la ciudad de salida");
        cs = sc.next();
        System.out.println("Seleccionar la ciudad de llegada");
        cd = sc.next();
        System.out.println("Seleccionar la hora de salida");
        hi = sc.nextInt();
        System.out.println("Seleccionar la ciudad de llegada");
        hf = sc.nextInt();
        */


        MostrarDatosVuelo(horario1);
    }

    public static void MostrarDatosVuelo (Itinerario horarioAMostrar){
        System.out.println("Es el vuelo número " + horarioAMostrar.numVuelo);
        System.out.println("El piloto asignado es " + horarioAMostrar.pilotoAsignado.nombre);
        System.out.println("El avión asignado es el número "+horarioAMostrar.avionAsignado.nAvion);
        System.out.println("El avión saldra de la ciudad de "+horarioAMostrar.ciudadSalida);
        System.out.println("El avión llegara de la ciudad de "+horarioAMostrar.ciudadDestino);
        System.out.println("El avión saldra a las "+horarioAMostrar.horaInicio + " hrs");
        System.out.println("El avión llegara  las "+horarioAMostrar.horaFinal + " hrs");
    }
}