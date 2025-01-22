package bayes;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^PE(\\d{2})FISI20(\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        String codigo;

        while (true) {
            System.out.print("Ingresa el código universitario: ");
            codigo = scanner.nextLine();
            Matcher matcher = pattern.matcher(codigo);

            if (matcher.matches()) {
                // Extraer y validar el año de ingreso
                int anioIngreso = Integer.parseInt(matcher.group(1));
                if (anioIngreso < 0 || anioIngreso > 24) {
                    System.out.println("El año de ingreso debe estar entre 00 y 24. Intenta nuevamente.");
                    continue;
                }

                // Extraer y validar el número de matrícula
                int numeroIngresante = Integer.parseInt(matcher.group(2));
                if (numeroIngresante < 1 || numeroIngresante > 150) {
                    System.out.println("El número de matrícula debe estar entre 0001 y 0128. Intenta nuevamente.");
                    continue;
                }

                // Si todo es válido
                System.out.println("Código válido: " + codigo);
                break;
            } else {
                System.out.println("Formato incorrecto. Asegúrate de usar el formato PE<aa>FISI20<nnnn>. Intenta nuevamente.");
            }
        }

        scanner.close();
    }
}