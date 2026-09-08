
package modelo;

import modelo.Animal;


public class Mascota extends Animal {
    
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public Mascota(String nombre, String especie, String edad) {
        super(nombre, especie, edad);
    }
    
}
