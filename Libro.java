
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
        String nosDevuelve = "";
        nosDevuelve = "Autor del libro: " +autor+", "+"Título del libro: "+titulo+", "+"Número de páginas: "+numeroPaginas+ ", "+"Número de veces prestadas: "+vecesPrestado;
        if(esLibroDeTexto == true){
            nosDevuelve= nosDevuelve + ", "+"Libro de texto: Si";
        }
        else{
            nosDevuelve= nosDevuelve + ", "+"Libro de texto: No";
        }
        if(esLibroDeTexto == true){
            nosDevuelve= nosDevuelve+ ", "+"Número de referencia: ZZZ";
        }
        else{
            nosDevuelve= nosDevuelve +", "+ "Número de referencia: ZZZ";
        }
        System.out.println(nosDevuelve);
    }

    public String getDetalles(){
        String aDevolver = "";
        aDevolver = "Autor del libro: " +autor+", "+"Título del libro: "+titulo+", "+"Número de páginas: "+numeroPaginas+ ", "+"Número de veces prestadas: "+vecesPrestado;
        if(esLibroDeTexto == true){
            aDevolver= aDevolver + ", "+"Libro de texto: Si";
        }
        else{
            aDevolver= aDevolver + ", "+"Libro de texto: No";

        }
        if(esLibroDeTexto == true){
            aDevolver= aDevolver + ", "+"Número de referencia: ZZZ";
        }
        else{
            aDevolver= aDevolver +", "+ "Número de referencia: ZZZ";

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

    public boolean getEsLibroDeTexto(){
        return esLibroDeTexto;
    }
}
