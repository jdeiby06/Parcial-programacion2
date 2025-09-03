import java.util.Scanner;

public class Main {
    public  String titulo;
    public  String autor;
    private  int numEjemplares;
    private  int numPrestados;

    public static void main(String[] args) {
        
        Libro libro1 = new Libro("En agosto nos vemos", "Gabriel Garcia Marquez", 4, 2);

        
        Libro libro2 = new Libro();

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el título del libro 2: ");
        libro2.setTitulo(sc.nextLine());

        System.out.print("Ingrese el autor del libro 2: ");
        libro2.setAutor(sc.nextLine());

        System.out.print("Ingrese el número de ejemplares del libro 2: ");
        libro2.setNumEjemplares(sc.nextInt());

        System.out.print("Ingrese el número de ejemplares prestados del libro 2: ");
        libro2.setNumPrestados(sc.nextInt());

        
        System.out.println("\nDatos del libro 1:");
        libro1.Imprimir();

        System.out.println("\nDatos del libro 2:");
        libro2.Imprimir();

        sc.close();
    }
}