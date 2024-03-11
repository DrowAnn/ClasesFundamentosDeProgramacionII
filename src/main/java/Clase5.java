//Punteros

public class Clase5 {

    // Atributos
    private String contiene;
    private Clase5 siguiente;

    // Constructores
    public Clase5() {
        setContiene(null);
        setSiguiente(null);
    }

    public Clase5(String contiene) {
        setContiene(contiene);
        setSiguiente(null);
    }

    public Clase5(String contiene, Clase5 siguiente) {
        setContiene(contiene);
        setSiguiente(siguiente);
    }

    // Get and Set
    public String getContiene() {
        return contiene;
    }

    public void setContiene(String contiene) {
        this.contiene = contiene;
    }

    public Clase5 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Clase5 siguiente) {
        this.siguiente = siguiente;
    }

}