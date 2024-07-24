import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // clase Scanner que permite escribir al usuario
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "tonto";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control de tipo iterativa / bucle
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Estructura de control: iterativa (Bucle)

        while (!palabraAdivinada && intentos < intentosMax) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra, por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0)); // esto va a leer la primer letra que pone el User

            //Usamos la clase Scanner para pedir una letrao
            

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (letraCorrecta) {
                System.out.println("CORRECTO");
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡INCORRECTO! Te quedan " + (intentosMax - intentos) + " intentos.");
            } 

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicitaciones, has adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("HAS PERDIDO");
        }
        scanner.close();
    }
}
