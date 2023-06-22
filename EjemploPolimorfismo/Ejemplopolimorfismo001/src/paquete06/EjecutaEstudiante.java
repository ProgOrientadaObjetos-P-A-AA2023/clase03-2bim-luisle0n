package paquete06;

import java.util.ArrayList;
import java.util.Scanner;
import paquete06.Estudiante;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        int n;
        contador = 0;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        System.out.println("Ingrese el numero de estudiantes: ");
        n = entrada.nextInt();
        // inicio de solución
        for (int i = 0; i < n; i++) {

        }
        while (contador < n) {
            // Se imprime mensaje en pantalla para solicitar
            // el tipo de estudiante que se desea ingresar
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + "Ingrese (2) para Estudiante Distancia");
            // se captura el valor ingresado por el usuario en 
            // la variable tipoEstudiante
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            // Solicitar el ingreso de valores para las variables

            // Solicitar nombresEst, apellidosEst, identificacionEst, edadEst
            // Leer nombresEst, apellidosEst, identificacionEst, edadEst
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {

                // Declarar,crear e iniciar objeto tipo EstudiantePresencial
                // Solicitar ingreso de valores para variables 
                // Solicitar numeroCreds, costoCred
                // Leer numeroCreds, costoCred
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                EstudiantePresencial estudianteP = new EstudiantePresencial(
                        nombresEst, apellidosEst, identificacionEst, edadEst,
                         numeroCreds);
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                // estudianteP.establecerNombresEstudiante(nombresEst);
                //estudianteP.establecerApellidoEstudiante(apellidosEst);
                //estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                //estudianteP.establecerEdadEstudiante(edadEst);
                //estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudiantePresencial
                estudianteP.calcularMatricula();
                System.out.println(estudianteP);

            } else {
                // Si el usuario ingresa un número diferente del valor 1 para 
                // tipoEstudiante se procede a crear los procesos necesarios para 
                // crear un objeto de tipo EstudianteDistancia

                // Declarar,crear e iniciar objeto tipo EstudianteDistancia
                // Solicitar ingreso de valores para variables 
                // Solicitar numeroAsigs, costoAsig 
                // Leer numeroAsigs, costoAsig
                System.out.println("Ingrese el número de asignaturas");
                numeroAsigs = entrada.nextInt();

                System.out.println("Ingrese el costo de cada cada asignatura");
                costoAsig = entrada.nextDouble();
                EstudianteDistancia estudianteD = new EstudianteDistancia(
                        nombresEst, apellidosEst, identificacionEst, edadEst,
                        numeroAsigs);
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                // estudianteD.establecerNombresEstudiante(nombresEst);
                //estudianteD.establecerApellidoEstudiante(apellidosEst);
                //estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                //estudianteD.establecerEdadEstudiante(edadEst);
                //estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                estudianteD.establecerCostoAsignatura(costoAsig);

                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudianteDistancia
                estudianteD.calcularMatricula();
                System.out.println(estudianteD);

            }

            contador = contador + 1;
        }

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
