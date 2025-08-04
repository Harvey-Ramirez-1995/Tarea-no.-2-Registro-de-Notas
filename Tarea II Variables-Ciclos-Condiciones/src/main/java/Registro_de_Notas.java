import java.util.Scanner;

public class Registro_de_Notas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Variables
        String[] nombres = new String[5];
        double[] promedios = new double[5];
        String[] estados = new String[5];
        int cantidad;

        // Pedir cantidad de estudiantes
        do {
            System.out.print("¿Cuántos estudiantes va a registrar? (1-5): ");
            cantidad = entrada.nextInt();
            if(cantidad < 1 || cantidad > 5) {
                System.out.println("¡Error! Solo de 1 a 5 estudiantes");
            }
        } while(cantidad < 1 || cantidad > 5);

        // Ingresar datos
        for(int i = 0; i < cantidad; i++) {
            System.out.println("\nEstudiante #" + (i+1));

            System.out.print("Nombre: ");
            entrada.nextLine();
            nombres[i] = entrada.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = entrada.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = entrada.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = entrada.nextDouble();

            promedios[i] = (nota1 + nota2 + nota3) / 3;
            estados[i] = (promedios[i] >= 61) ? "Aprobado" : "Reprobado";
        }

        // Mostrar resultados (con el formato solicitado)
        System.out.println("\nResumen de estudiantes:");
        for(int i = 0; i < cantidad; i++) {
            System.out.printf("Nombre: %-6s Promedio: %-6.2f Estado: %-9s%n",
                    nombres[i], promedios[i], estados[i]);
        }

        entrada.close();
    }
}