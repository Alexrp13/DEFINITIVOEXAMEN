package edu.upc.dsa.models;

import edu.upc.dsa.utils.RandomUtils;

public class Vacuna {
    private String marca;
    private int cantidadvacunadas;

    public Vacuna (String marca, int cantidadvacunadas) {
        this();
        this.marca = marca;
        this.cantidadvacunadas = cantidadvacunadas;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getCantidadvacunadas() { return cantidadvacunadas; }
    public void setCantidadvacunadas(int cantidadvacunadas) { this.cantidadvacunadas = cantidadvacunadas; }

    @Override
    public String toString() { return  "Marca:" +this.marca+ "Cantidad:" +this.cantidadvacunadas;}


}
