package ec.com.edulibro.entidades;
/**
 *
 * @author Vinicio Diaz .vinicioismael1694@gmail.com
 */
public class cliente {
    private int id;
    private String RUC;
    private String nombre;
    private String telefono;

    /**
     * Constructor que crea un objeto vacio
     */
    public cliente() {
    }

    /**
     * Constructor que crea un objeto directamente con datos
     * @param id (int) representa el autonumerico de la base de datos
     * @param RUC (String) Registro Unico de contribuyentes
     * @param nombre (String) Nombre y apellido del cliente
     * @param telefono (String) Telefóno de contacto del cliente 
     */
    public cliente(int id, String RUC, String nombre, String telefono) {
        this.id = id;
        this.RUC = RUC;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "cliente{" + "id=" + id + ", RUC=" + RUC + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
}