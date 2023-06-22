/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String miCodigo, ArrayList<Docente> lis) {
        super(miCodigo);
        
        lista = lis;
    }

    public void establecerPromedioSueldo() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getSueldo();

        }
        promedioSueldos = suma / lista.size();

    }

    public void  establecerLista(ArrayList<Docente> list) {
        lista=list;
    }
    public ArrayList<Docente> obtenerLista(){
        return lista;
    }
    public double obtenerReporteSueldo(){
        return promedioSueldos;
    }
    
    @Override
    public String toString() {
         String Cadena= "Reporte Docente ";
         Cadena =String.format("%sCodigo:%s\n", Cadena, codigo);
         Cadena = String.format("%sLista de Docentes\n", Cadena);
         for (int i = 0; i < obtenerLista().size(); i++) {
             Docente d= obtenerLista().get(i);
             Cadena = String.format("%sNombre: %s - Sueldo: %.2f\n",
                     Cadena, d.getNombre(), d.getSueldo());
            
        }
        Cadena=String.format("%sEl promedo de suledo "
                + "es: %.3f\n",
                Cadena,obtenerReporteSueldo());
            return Cadena;
    }
}