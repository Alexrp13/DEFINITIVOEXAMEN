package edu.upc.dsa;

import edu.upc.dsa.models.*;
import edu.upc.dsa.models.Persona;
import edu.upc.dsa.models.Vacunacion;
import edu.upc.dsa.models.Seguimiento;
import edu.upc.dsa.models.Vacuna;



import org.apache.log4j.Logger;

import java.util.*;


public class Covid19Managerimpl implements Covid19Manager{
    private HashMap<String, Persona> personas;
    private List<Vacunacion> VacunacionList;
    private List<Seguimiento> SeguimientoList;
    private ArrayList<Vacuna> VacunaArray;

    final static Logger logger = logger.getlogger(Covid19Managerimpl.class);
    private static Covid19Managerimpl covid19Manager;

    public static Covid19Managerimpl getInstance() {
        if (covid19Manager == null ){
            covid19Manager = new Covid19Managerimpl();
        }
        return covid19Manager;
    }

    private Covid19Managerimpl() {
        this.personas = new HashMap<>();
        this.VacunacionList = new ArrayList<>();
        this.SeguimientoList = new ArrayList<>();
        this.VacunaArray = new ArrayList<>();
    }

    public HashMap<String, Persona> getPersonas() { return personas; }
    public void setPersonas(HashMap<String, Persona> personas) { this.personas = personas; }

    public List<Vacunacion> getVacunacionList() { return VacunacionList; }
    public void setVacunacionList(List<Vacunacion> vacunacionList) { VacunacionList = vacunacionList; }

    public List<Seguimiento> getSeguimientoList() { return SeguimientoList; }
    public void setSeguimientoList(List<Seguimiento> seguimientoList) { SeguimientoList = seguimientoList; }

    public ArrayList<Vacuna> getVacunaArray() { return VacunaArray; }
    public void setVacunaArray(ArrayList<Vacuna> vacunaArray) { VacunaArray = vacunaArray; }

    @Override
    public void Vacunar(List<Vacunacion> vacunacion) throws Exception {
        Persona p = getPersonaId(vacunacion.get(0).getIdpersona());
        if (p == null) {
            logger.info("Persona no existente");
            throw new Exception(" Persona no existente");
        } else {
            logger.info("Guardando vacunacion");
            logger.debug(this.VacunacionList);
            this.VacunacionList.add(Vacunacion);
            logger.info("Vacunacion almazenada");
            logger.debug(this.VacunacionList);
        }
    }

    @Override
    public void Seguir(List<Seguimiento> seguimiento) throws Exception {
        Persona p = getPersonaId(seguimiento.get(0).getPersonaid());
        if (p == null) {
            logger.info("Persona no existente");
            throw new Exception(" Persona no existente");
        } else {
            logger.info("Guardando vacunacion");
            logger.debug(this.SeguimientoList);
            this.SeguimientoList.add(Seguimiento);
            logger.info("Vacunacion almazenada");
            logger.debug(this.SeguimientoList);
        }
    }

    @Override
    public List<Vacuna> getVacunasSortedbyVacunation() {
        this.VacunaArray.sort((Vacuna a, Vacuna b) -> Integer.compare(a.getCantidadvacunadas(), b.getCantidadvacunadas()));
        Collections.reverse(this.VacunaArray);
        return this.VacunaArray;
    }

    @Override
    public void setUpResources() {
        Persona p1 = new Persona("Alex");
        Persona p2 = new Persona("Patricia");

        HashMap<String, Persona> personas = new HashMap<>();
        personas.put(p1.getIdusuario(), p1);
        personas.put(p2.getIdusuario(), p2);
        covid19Manager.setPersonas(personas);

        Vacuna v1 = new Vacuna("moderna", 1);
        Vacuna v2 = new Vacuna("phaizer", 2);

        ArrayList<Vacuna> VacunaArray = new ArrayList<>();
        VacunaArray.add(v1);
        VacunaArray.add(v2);
        covid19Manager.setVacunaArray();

        covid19Manager.setVacunacionList();

        Vacunacion V1 = new Vacunacion(p1.getIdusuario(), v1.getMarca(), 21 - 04 - 2021);
        Vacunacion V2 = new Vacunacion(p2.getIdusuario(), v2.getMarca(), 210 - 4 - 2021);

        List<Vacunacion> vacunacionList = new ArrayList<>();
        vacunacionList.add(V1);
        vacunacionList.add(V2);
    }




        @Override
    public void tearDownResources() {
        setPersonas(new HashMap<>(String, Persona));
        setSeguimientoList(new ArrayList<>(Seguimiento));
        setVacunaArray(new ArrayList<>(Vacuna));
        setVacunacionList(new ArrayList<>(Vacunacion));
    }

    @Override
    public Persona getPersonaId(String id) {return this.personas.get(id);}

    }




}
