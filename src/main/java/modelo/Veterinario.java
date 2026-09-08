
package modelo;

import modelo.Medicamento;
import modelo.Consulta;
import java.util.ArrayList;


public class Veterinario {
    private String nombre;
    private String documento;
    private String especialidad;
    private ArrayList<Consulta> consultas;

        public Veterinario(String nombre, String documento, String especialidad) {
            this.nombre = nombre;
            this.documento = documento;
            this.especialidad = especialidad;
            
        }
    

public Veterinario(){
    consultas = new ArrayList<>();
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

public void recetar(Medicamento medicamento, Consulta consulta) {
        consulta.agregarMedicamento(medicamento);
    }

}