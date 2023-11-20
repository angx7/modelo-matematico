import java.util.Scanner;

public class reloj {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String Horas = "";
        System.out.println("Ingresa la hora de inicio");
        int horaini = read.nextInt();
        System.out.println("Ingresa los minutos");
        int minini = read.nextInt();

        System.out.println("Ingresa la hora de fin");
        int horafin = read.nextInt();
        System.out.println("Ingresa los minutos");
        int minfin = read.nextInt();

        if (horaini > horafin) {
            int horafindinamica = 24, minfindinamico = 60;
            for (int i = horaini; i <= horafindinamica; i++) {
                if (horaini <= horafindinamica) {
                    for (int j = minini; j < minfindinamico; j++) {
                        // inicio
                        double triangulo;
                        if (i >= 0 && i <= 23) {
                            horaini = i;
                            if (horaini > 12) {
                                horaini -= 12;
                            }
                            triangulo = ((horaini * 60) + j) * 0.5;
                            double circulo = j * 6;
                            double rayon = triangulo - circulo;
                            if (rayon < 0) {
                                rayon *= -1;
                            }

                            if (rayon >= 89.5 && rayon <= 90.5) {
                                if (i >= 12) {
                                    Horas += "\t" + i + ":" + j + " PM\n";
                                } else {
                                    Horas += "\t" + i + ":" + j + " AM\n";

                                }

                            } else if (rayon >= 269.5 && rayon <= 270.5) {
                                if (i >= 12) {
                                    Horas += "\t" + i + ":" + j + " PM\n";
                                } else {
                                    Horas += "\t" + i + ":" + j + " AM\n";

                                }
                            }
                            // fin
                            if (i == horafindinamica) {
                                minfindinamico = minfin;
                            }

                        }
                        minini = 0;
                    }
                }
                if (i == 24) {
                    horafindinamica = horafin;
                    i = -1;
                    horaini = i;
                }
            }
        } else {
            int horafindinamica = 24, minfindinamico = 60;
            for (int i = horaini; i < horafindinamica; i++) {
                if (horaini < horafindinamica) {
                    for (int j = minini; j < minfindinamico; j++) {
                        // inicio
                        double triangulo;
                        if (i >= 0 && i <= 23) {
                            horaini = i;
                            if (horaini > 12) {
                                horaini -= 12;
                            }
                            triangulo = ((horaini * 60) + j) * 0.5;
                            double circulo = j * 6;
                            double rayon = triangulo - circulo;
                            if (rayon < 0) {
                                rayon *= -1;
                            }

                            if (rayon >= 89.5 && rayon <= 90.5) {
                                if (i >= 12) {
                                    Horas += "\t" + i + ":" + j + " PM\n";
                                } else {
                                    Horas += "\t" + i + ":" + j + " AM\n";

                                }

                            } else if (rayon >= 269.5 && rayon <= 270.5) {
                                if (i >= 12) {
                                    Horas += "\t" + i + ":" + j + " PM\n";
                                } else {
                                    Horas += "\t" + i + ":" + j + " AM\n";

                                }
                            }
                            // fin
                            if (i == horafindinamica) {
                                minfindinamico = minfin;
                            }
                        }
                        minini = 0;
                    }
                }
                if (i == 24) {
                    horafindinamica = horafin;
                    i = -1;
                    horaini = i;
                }
            }
        }

        System.out.println(
                "\nLas horas en donde se forma un ángulo de 90° entre las manecillas de la hora y los minutos son\n\n"
                        + Horas);
        read.close();
    }
}
