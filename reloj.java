import java.util.Scanner;

public class reloj {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String Horas = "";
        System.out.println("Ingresa la hora de inicio");
        int horaini = read.nextInt();
        System.out.println("Ingresa los minutos");
        int minini = read.nextInt();

        // System.out.println("Ingresa la hora de fin");
        // int horai00i = read.nextInt();
        // System.out.println("Ingresa los minutos");
        // int minini = read.nextInt();
        double triangulo;
        if (horaini >= 0 && horaini <= 23) {
            if (horaini > 12) {
                horaini -= 12;
            }
            triangulo = ((horaini * 60) + minini) * 0.5;
            double circulo = minini * 6;
            double rayon = triangulo - circulo;
            if (rayon < 0) {
                rayon *= -1;
            }

            if (rayon >= 89.5 && rayon <= 90.5) {
                Horas += horaini + ":" + minini;
            } else if (rayon >= 269.5 && rayon <= 270.5) {
                Horas += horaini + ":" + minini;
            } else {
                System.out.println("no");
            }
            System.out.println(Horas);
            read.close();
        }
    }
}
