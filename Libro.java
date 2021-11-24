
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
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, int vecesPrestadas, boolean libroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = vecesPrestadas;
        esLibroDeTexto = libroDeTexto;
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
        String nosDevuelve ="";
        if(numeroReferencia.length()==0){
            if( esLibroDeTexto == true){
                nosDevuelve = "Autor: "+ autor + ", "+"Título: "+ titulo+", "+"Páginas: "+ numeroPaginas+", "+"Número de veces prestadas: "+vecesPrestado+", "+"Libro de texto: Si"+", "+"Número de referencia: ZZZ";
            }
            else{
                nosDevuelve = "Autor: "+ autor + ", "+"Título: "+ titulo+", "+"Páginas: "+ numeroPaginas+", "+"Número de veces prestadas: "+vecesPrestado+", "+"Libro de texto: No"+", "+"Número de referencia: ZZZ";
            } 
        }
        else {
            if( esLibroDeTexto == true){
                nosDevuelve = "Autor: "+ autor + ", "+"Título: "+ titulo+", "+"Páginas: "+ numeroPaginas+", "+"Número de veces prestadas: "+vecesPrestado+", "+"Libro de texto: Si"+", "+"Número de referencia: "+ numeroReferencia;
            }
            else{
                nosDevuelve = "Autor: "+ autor + ", "+"Título: "+ titulo+", "+"Páginas: "+ numeroPaginas+", "+"Número de veces prestadas: "+vecesPrestado+", "+"Libro de texto: No"+", "+"Número de referencia: "+ numeroReferencia;
            } 
        }
        System.out.println(nosDevuelve);
    }

    public String getDetalles(){
        String aDevolver = "";
        if(numeroReferencia.length() == 0){
            if(esLibroDeTexto == true){
                aDevolver = "Autor del libro: " +autor+", "+"Título del libro: "+titulo+", "+"Número de páginas: "+numeroPaginas+ ", "+"Número de veces prestadas: "+vecesPrestado+", "+"Libro de texto: Si"+", "+"Número de referencia: ZZZ";
            }
            else{
                aDevolver = "Autor del libro: " +autor+", "+"Título del libro: "+titulo+", "+"Número de páginas: "+numeroPaginas+ ", "+"Número de veces prestadas: "+vecesPrestado+", "+"Libro de texto: No"+", "+"Número de referencia: ZZZ";
            }
        }
        else{
            if(esLibroDeTexto == true){
                aDevolver = "Autor del libro: " +autor+", "+"Título del libro: "+titulo+", "+"Número de páginas: "+numeroPaginas+ ", "+"Número de veces prestadas: "+vecesPrestado+", "+"Libro de texto: Si"+","+"Número de referencia: "+ numeroReferencia;
            }
            else{   
                aDevolver = "Autor del libro: " +autor+", "+"Título del libro: "+titulo+", "+"Número de páginas: "+numeroPaginas+ ", "+"Número de veces prestadas: "+vecesPrestado+", "+"Libro de texto: No"+","+"Número de referencia: "+ numeroReferencia;
                
            }
        }
        System.out.println(aDevolver);
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

    public boolean getEsLibroDeTexto(){
        return esLibroDeTexto;
    }
}
