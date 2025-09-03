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
    }
    


    public boolean prestamo() {
        if (numPrestados < numEjemplares) {
            numPrestados=numPrestados + 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (numPrestados > 0) {
            numPrestados=numPrestados - 1;
            return true;
        } else {
            return false;
        }
    }
    
   
    public void  Imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de ejemplares: " + numEjemplares);
        System.out.println("Numero de ejemplares prestados: " + numPrestados);
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