/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String c, ArrayList list) {
        super(c);
        lista=list;
    }
    public void establecerPromedioSueldo() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getEdad();

        }
        promedioEdades = suma / lista.size();

    }

    public void  establecerLista(ArrayList<Policia> list) {
        lista=list;
    }
    public ArrayList<Policia> obtenerLista(){
        return lista;
    }
    public double obtenerReporteSueldo(){
        return promedioEdades;
    }
    
    @Override
    public String toString() {
         String Cadena= "Reporte POLICIA";
         Cadena =String.format("%sCodigo:%s\n", Cadena, codigo);
         Cadena = String.format("%sLista de Policias\n", Cadena);
         for (int i = 0; i < obtenerLista().size(); i++) {
             Policia d= obtenerLista().get(i);
             Cadena = String.format("%sNombre: %s - Promedioedades: %.2f\n",
                     Cadena, d.getNombre(), d.getEdad());
            
        }
        Cadena=String.format("%sEl promedo de suledo "
                + "es: %.3f\n",
                Cadena,obtenerReporteSueldo());
            return Cadena;
    }
}

