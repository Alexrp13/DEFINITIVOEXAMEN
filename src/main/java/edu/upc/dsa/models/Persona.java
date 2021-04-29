package edu.upc.dsa.models;

import edu.upc.dsa.utils.RandomUtils;


public class Persona {

    private String nombre;
    private String id;

    public Persona () {this.id = RandomUtils.getId();}

    public Persona (String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIdusuario() { return id; }
    public void setIdusuario(String idusuario) { this.id = idusuario; }

    @Override
    public String toString() {return "Persona:" +this.nombre+ " Id:" +this.id;}
}
