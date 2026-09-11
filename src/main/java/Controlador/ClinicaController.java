package controlador;

import java.util.ArrayList;
import modelo.Consulta;
import modelo.Mascota;
import modelo.Medicamento;
import modelo.Propietario;
import modelo.Veterinario;
import Vista.VeterinariaVista;

public class ClinicaController {

    private VeterinariaVista vista;

    public ClinicaController() {
        this.vista = new VeterinariaVista();
    }

    public void iniciar() {
        
        ArrayList<Mascota> mascotasDeJuan = new ArrayList<>();
        Mascota firulais = new Mascota("Firulais", "Perro", "3");
        Mascota michi = new Mascota("Michi", "Gato", "2");
        mascotasDeJuan.add(firulais);
        mascotasDeJuan.add(michi);

        ArrayList<Mascota> mascotasDeAna = new ArrayList<>();
        Mascota rocky = new Mascota("Rocky", "Perro", "5");
        mascotasDeAna.add(rocky);

        Propietario juan = new Propietario(mascotasDeJuan, "Juan Pérez", "1001");
        Propietario ana = new Propietario(mascotasDeAna, "Ana Gómez", "1002");

        ArrayList<Propietario> propietarios = new ArrayList<>();
        propietarios.add(juan);
        propietarios.add(ana);

        
        Veterinario drLopez = new Veterinario("Dr. López", "V001", "Cirugía", new ArrayList<>());
        Veterinario draTorres = new Veterinario("Dra. Torres", "V002", "Dermatología", new ArrayList<>());

        
        Medicamento amoxicilina = new Medicamento("Amoxicilina", "250mg", "Cada 12 horas");
        Medicamento antipulgas = new Medicamento("Antipulgas", "1 pipeta", "Mensual");

        ArrayList<Medicamento> medsFirulais = new ArrayList<>();
        medsFirulais.add(amoxicilina);

        ArrayList<Medicamento> medsRocky = new ArrayList<>();
        medsRocky.add(antipulgas);

        
        Consulta consulta1 = new Consulta("2026-09-01", "Chequeo general", firulais, drLopez, medsFirulais);
        Consulta consulta2 = new Consulta("2026-09-05", "Control de pulgas", rocky, draTorres, medsRocky);

        
        drLopez.getConsultas().add(consulta1);
        draTorres.getConsultas().add(consulta2);

        ArrayList<Consulta> consultas = new ArrayList<>();
        consultas.add(consulta1);
        consultas.add(consulta2);

        
        vista.mostrarPropietariosConMascotas(propietarios);
        vista.mostrarConsultas(consultas);
        vista.mostrarMedicamentosRecetados(consultas);
    }
}