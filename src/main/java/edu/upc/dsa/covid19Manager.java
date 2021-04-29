package edu.upc.dsa;
import edu.upc.dsa.models.Seguimiento;
import edu.upc.dsa.models.Vacuna;
import edu.upc.dsa.models.Vacunacion;
import edu.upc.dsa.models.Persona

import java.util.List;

public interface covid19Manager {
    public void Vacunar(List<Vacunacion> vacunacion) throws Exception;
    public void Seguir(List<Seguimiento> seguimiento) throws Exception;
    public List<Vacuna> getVacunasSortedbyVacunation();
    public void setUpResources();
    public void tearDownResources();
    public Persona getpersonaId(String id );

}
