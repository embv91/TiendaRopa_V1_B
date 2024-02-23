
package Usuarios;

import java.util.Date;

public abstract class Usuario {

    private String dni;
    private String nombre;
    private String correoElectronico;
    private Date fechNac;
    private String direccion;
    private String telefono;

    // Atributo de clase para realizar un seguimiento del número total de usuarios
    private static int totalUsuarios = 0;

    // Constructor principal
    public Usuario(String nombre, String correoElectronico, Date fechNac,
                   String direccion, String telefono, String dni) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.fechNac = fechNac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;

        // Incrementar el contador de usuarios cada vez que se crea una instancia
        totalUsuarios++;
    }

    // Constructor adicional sin dirección y teléfono
    public Usuario(String nombre, String correoElectronico, Date edad,
                   String dni) {
        this(nombre, correoElectronico, edad, "", "", dni);
    }

    // Constructor adicional sin edad, dirección y teléfono
    public Usuario(String nombre, String correoElectronico, String dni) {
        this(nombre, correoElectronico, null, "", "", dni);
    }


    // Métodos abstractos que deben ser implementados por las subclases
    public abstract String info();

    // Getters y setters para los atributos privados
    public static int getTotalUsuarios() {
        return totalUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getEdad() {
        return fechNac;
    }

    public void setEdad(Date fechNac) {
        this.fechNac = fechNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
