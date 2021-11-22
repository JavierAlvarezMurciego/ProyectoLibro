
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void imprimeAutor(){
       System.out.println(autor); 
    }
    
    public void imprimeTitulo(){
        System.out.println(titulo); 
    }
    
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    public void imprimirDetalles(){
        System.out.println("Autor: "+ autor + ", "+"T�tulo: "+ titulo+", "+"P�ginas: "+ numeroPaginas);
    }
    
    public String getDetalles(){
        String detalles = "Autor del libro: " +autor+", "+"T�tulo del libro: "+titulo+", "+"N�mero de p�ginas: "+numeroPaginas;
        return detalles;
    }
}
