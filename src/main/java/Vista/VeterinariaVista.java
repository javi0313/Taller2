package Vista;

import java.util.List;
import modelo.Consulta;
import modelo.Mascota;
import modelo.Medicamento;
import modelo.Propietario;

public class VeterinariaVista {

    public void mostrarPropietariosConMascotas(List<Propietario> propietarios) {
        System.out.println("========================================");
        System.out.println("        PROPIETARIOS Y SUS MASCOTAS");
        System.out.println("========================================");

        for (Propietario propietario : propietarios) {
            System.out.println("Propietario: " + propietario.getNombre());
            System.out.println("Documento: " + propietario.getDocumento());

            System.out.println("Mascotas:");
            for (Mascota mascota : propietario.getMascotas()) {
                System.out.println("- " + mascota.getNombre()
                        + " (" + mascota.getEspecie() + ", " + mascota.getEdad() + " años)");
            }

            System.out.println("----------------------------------------");
        }
    }

    public void mostrarConsultas(List<Consulta> consultas) {
        System.out.println("========================================");
        System.out.println("           CONSULTAS REALIZADAS");
        System.out.println("========================================");

        for (Consulta consulta : consultas) {
            System.out.println("Fecha: " + consulta.getFecha());
            System.out.println("Motivo: " + consulta.getMotivo());
            System.out.println("Mascota atendida: " + consulta.getMascota().getNombre());
            System.out.println("Veterinario: " + consulta.getVet().getNombre()
                    + " (" + consulta.getVet().getEspecialidad() + ")");
            System.out.println("----------------------------------------");
        }
    }

    public void mostrarMedicamentosRecetados(List<Consulta> consultas) {
        System.out.println("========================================");
        System.out.println("         MEDICAMENTOS RECETADOS");
        System.out.println("========================================");

        for (Consulta consulta : consultas) {
            System.out.println("Consulta del " + consulta.getFecha()
                    + " - Mascota: " + consulta.getMascota().getNombre());

            for (Medicamento medicamento : consulta.getMedicamentos()) {
                System.out.println("  * " + medicamento.getNombre()
                        + " - Dosis: " + medicamento.getDosis()
                        + " - Frecuencia: " + medicamento.getFrecuencia());
            }

            System.out.println("----------------------------------------");
        }
    }
}