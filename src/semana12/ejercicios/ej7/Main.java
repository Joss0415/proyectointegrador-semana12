package semana12.ejercicios.ej7;

public class Main {
    public static void main(String[] args) {
        Audiolibro audio = new Audiolibro("Cuentos");
        System.out.println(audio.toString());
        System.out.println(audio.prestar("Luis"));
        int diasAtraso = 4;
        int factorMulta = 1;
        System.out.println(diasAtraso * factorMulta);
    }
}