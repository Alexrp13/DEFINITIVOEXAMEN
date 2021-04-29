package edu.upc.dsa.models;

public class Vacunacion {
    public String idpersona;
    public String idvacuna;
    public int fecha;

    public Vacunacion (String idpersona, String idvacuna, int fecha) {
        this.idvacuna = idvacuna;
        this.idpersona = idpersona;
        this.fecha = fecha;
    }

    public String getIdpersona() { return idpersona; }
    public void setIdpersona(String idpersona) { this.idpersona = idpersona; }

    public String getIdvacuna() { return idvacuna; }
    public void setIdvacuna(String idvacuna) { this.idvacuna = idvacuna; }

    public String getFecha() { return fecha; }
    public void setFecha(int fecha) { this.fecha = fecha; }

    @Override
    public String toString() { return  "IdPersona:" +getIdpersona()+ " IdVacuna:" +getIdvacuna()+ " Fecha:" +getFecha();}

}
