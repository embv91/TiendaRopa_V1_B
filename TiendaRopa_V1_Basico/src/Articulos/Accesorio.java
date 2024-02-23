/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Articulos;

public abstract class Accesorio extends Articulo {
    private String tipo;
    private String material;
    private String estilo;
    private boolean esPersonalizado;

    // constructor sin código de artículo
    public Accesorio(String nombre, float precio, String descripcion, 
            String marca, String tipo, String material, 
            String estilo, boolean esPersonalizado) {
        super(nombre, precio, descripcion, marca);
        this.tipo = tipo;
        this.material = material;
        this.estilo = estilo;
        this.esPersonalizado = esPersonalizado;
    }
    
    // constructor con código de artículo
    public Accesorio(String codigoProducto, String nombre, float precio, 
            String descripcion, String marca,  String tipo, String material, 
            String estilo, boolean esPersonalizado) {
        super(codigoProducto, nombre, precio, descripcion, marca);
        this.tipo = tipo;
        this.material = material;
        this.estilo = estilo;
        this.esPersonalizado = esPersonalizado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public boolean isEsPersonalizado() {
        return esPersonalizado;
    }

    public void setEsPersonalizado(boolean esPersonalizado) {
        this.esPersonalizado = esPersonalizado;
    }
}
