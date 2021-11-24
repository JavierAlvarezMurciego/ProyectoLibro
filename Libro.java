
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
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, int vecesPrestadas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = vecesPrestadas;
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
        if(numeroReferencia.length()==0){
            System.out.println("Autor: "+ autor + ", "+"Título: "+ titulo+", "+"Páginas: "+ numeroPaginas+", "+"Número de veces prestadas: "+vecesPrestado);
            System.out.println("Número de referencia: ZZZ"); 
        }
        else {
            System.out.println("Autor: "+ autor + ", "+"Título: "+ titulo+", "+"Páginas: "+ numeroPaginas);
            System.out.println("Número de referencia: "+ numeroReferencia);
        }
    }

    public String getDetalles(){
        String aDevolver = "";
        if(numeroReferencia.length() == 0){ 
            aDevolver = "Autor del libro: " +autor+", "+"Título del libro: "+titulo+", "+"Número de páginas: "+numeroPaginas+ ", "+"Número de veces prestadas: "+vecesPrestado;
            System.out.println("Número de referencia: ZZZ"); 
        }
        else{
            aDevolver = "Autor del libro: " +autor+", "+"Título del libro: "+titulo+", "+"Número de páginas: "+numeroPaginas+ ", "+"Número de veces prestadas: "+vecesPrestado;
            System.out.println("Número de referencia: "+ numeroReferencia);
        }
        return aDevolver;
    }

    public String getNumeroReferencia(){
        return numeroReferencia;
    }

    public void setNumeroReferencia(String nuevoNumeroReferencia){
        if (nuevoNumeroReferencia.length() < 3){
            System.out.println("Error: No se aceptan valores menores de tres caracteres");
        }
        else{
            numeroReferencia = nuevoNumeroReferencia;
        }
    }
    
    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
}
