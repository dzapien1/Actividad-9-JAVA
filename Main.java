import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su peso en kilogramos: ");
            double peso = scanner.nextDouble();

            System.out.print("Ingrese su altura en metros: ");
            double altura = scanner.nextDouble();

            Persona persona = new Persona(peso, altura);

            String diagnostico = persona.calcularIMC();
            System.out.println("Su diagnóstico es: " + diagnostico);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado. Intente nuevamente.");
        } finally {
            scanner.close();
        }
    }
}

