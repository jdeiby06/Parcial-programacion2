import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Libro 1 usando el constructor con parámetros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);

        // Libro 2 usando el constructor por defecto
        Libro libro2 = new Libro();

        // Obtener datos para libro2 por consola
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el título del libro 2: ");
        libro2.setTitulo(sc.nextLine());

        System.out.print("Ingrese el autor del libro 2: ");
        libro2.setAutor(sc.nextLine());

        System.out.print("Ingrese el número de ejemplares del libro 2: ");
        libro2.setNumEjemplares(sc.nextInt());

        System.out.print("Ingrese el número de ejemplares prestados del libro 2: ");
        libro2.setNumPrestados(sc.nextInt());

        // Imprimir datos de ambos libros
        System.out.println("\nDatos del libro 1:");
        libro1.Imprimir();

        System.out.println("\nDatos del libro 2:");
        libro2.Imprimir();

        sc.close();
    }
}