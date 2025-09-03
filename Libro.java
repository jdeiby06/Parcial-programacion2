public class Libro {
    
    public  String titulo;
    public  String autor;
    private  int numEjemplares;
    private  int numPrestados;
        
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.numPrestados = 0;
    }
    

    
    public  Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = 2;
        this.numPrestados = 1;
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

    

    