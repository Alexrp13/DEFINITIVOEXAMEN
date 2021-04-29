package edu.upc.dsa.models;

public class Seguimiento {
    public String Personaid;
    public String FechaSeguimiento;
    public String Estado;

    public Seguimiento (String Personaid, String FechaSeguimiento, String Estado) {
        this();
        this.Personaid = Personaid;
        this.FechaSeguimiento = FechaSeguimiento;
        this.Estado = Estado;
    }

    public String getPersonaid() { return Personaid; }
    public void setPersonaid(String personaid) { Personaid = personaid; }

    public String getFechaSeguimiento() { return FechaSeguimiento; }
    public void setFechaSeguimiento(String fechaSeguimiento) { FechaSeguimiento = fechaSeguimiento; }

    public String getEstado() { return Estado; }
    public void setEstado(String estado) { Estado = estado; }

    @Override
    public String toString() {return "ID:" +getPersonaid()+ " Fecha:" +getFechaSeguimiento()+ " Estado:" +getEstado();}
}
