/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c, ArrayList list) {
        super(c);
        lista = list;
    }

    public void establcerPromedioMatriculas() {
        double suma = 0;
        // size tamaño de la lista 
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma / lista.size();
    }

    public void establecerLista(ArrayList<Estudiante> list) {
        lista = list;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public double obtenerReporteSueldo() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String Cadena = "Reporte Estudiantes ";
        Cadena = String.format("%sCodigo:%s\n", Cadena, codigo);
        Cadena = String.format("%sLista de Estudiantes\n", Cadena);
        for (int i = 0; i < obtenerLista().size(); i++) {
            Estudiante d = obtenerLista().get(i);
            Cadena = String.format("%sNombre: %s - Sueldo: %.2f\n",
                    Cadena, d.getNombre(), d.getMatricula());

        }
        Cadena = String.format("%sEl promedo de suledo "
                + "es: %.3f\n",
                Cadena, obtenerReporteSueldo());
        return Cadena;
    }
}
