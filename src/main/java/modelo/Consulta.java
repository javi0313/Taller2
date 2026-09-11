package modelo;

import java.util.ArrayList;


public class Consulta {
    private String fecha;
    private String motivo;
    private Mascota mascota;
    private Veterinario vet;
    private ArrayList<Medicamento> medicamentos;

    public Consulta(String fecha, String motivo, Mascota mascota, Veterinario vet, ArrayList<Medicamento> medicamentos){
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
        this.vet = vet;
        this.medicamentos = medicamentos;
    }

    public Consulta(String fecha, String motivo, Mascota mascota, Veterinario vet) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.mascota = mascota;
        this.vet = vet;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        this.vet = vet;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

}