
package modelo;

import modelo.Mascota;
import java.util.ArrayList;


public class Propietario {
    
    private ArrayList<Mascota> mascotas;
    private String nombre;
    private String documento;

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
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

    public Propietario(ArrayList<Mascota> mascotas, String nombre, String documento) {
        this.mascotas = mascotas;
        this.nombre = nombre;
        this.documento = documento;
    }
    
    public void agregarMascota(Mascota mascota) { 
        mascotas.add(mascota); 
    }
}
