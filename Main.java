import java.util.Scanner;

public class Main {
    public  String titulo;
    public  String autor;
    private  int numEjemplares;
    private  int numPrestados;

    

    
    
    
     
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("En agosto nos vemos", "Gabriel Garcia Marquez", 4, 2);

        
        System.out.println("Datos del libro 1:");
        libro1.Imprimir();
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
        
        

        System.out.println("Datos del libro 2:");
        libro2.Imprimir();

        sc.close();
    
   

        
        if (libro1.prestamo()) {
            System.out.println("Préstamo realizado para libro 1.");
        } else {
            System.out.println("No se pudo realizar el préstamo para libro 1.");
        }

        if (libro1.devolucion()) {
            System.out.println("Devolución realizada para libro 1.");
        } else {
            System.out.println("No se pudo realizar la devolución para libro 1.");
        }

       
        if (libro2.prestamo()) {
            System.out.println("Préstamo realizado para libro 2.");
        } else {
            System.out.println("No se pudo realizar el préstamo para libro 2.");
        }

        if (libro2.devolucion()) {
            System.out.println("Devolución realizada para libro 2.");
        } else {
            System.out.println("No se pudo realizar la devolución para libro 2.");
        }

    }


    
    
    
    
   
    
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }
}
