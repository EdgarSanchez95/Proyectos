
package Modelo;


public class Cliente {
    private int id;
    private int dni;
    private String nombre;
    private int telefono;
    private String direccion;
    private String correo;

    public Cliente() {
    }

    public Cliente(int id, int dni, String nombre, int telefono, String direccion, String correo) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
            
}