package Vista;

import java.util.List;
import modelo.Consulta;
import modelo.Mascota;
import modelo.Medicamento;
import modelo.Propietario;

public class VeterinariaVista {

    public void mostrarPropietariosConMascotas(List<Propietario> propietarios) {

        System.out.println("========================================");
        System.out.println("       PROPIETARIOS Y SUS MASCOTAS");
        System.out.println("========================================");

        for (Propietario propietario : propietarios) {
            System.out.println("Propietario: " + propietario.getNombre());
            System.out.println("Documento: " + propietario.getDocumento());
       

            System.out.println("Mascotas:");

            for (Mascota mascota : propietario.getMascotas()) {
                System.out.println("- " + mascota.getNombre());
            }

            System.out.println("----------------------------------------");
        }
    }
}

    
