/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Entidades.PypAdmAgend;
import Entidades.PypAdmProgramas;

/**
 *
 * @author IdlhDeveloper
 */
public class Declaraciones_AD {
        
    //Contenedores - Panel's
    public static Administrativo.C_Contenedor CContenedor = new Administrativo.C_Contenedor();
    public static Dialogos.A_Confirmar Confirmar = new Dialogos.A_Confirmar(null, true);
    //Entidades
    public PypAdmProgramas Programas_PYP  = new PypAdmProgramas();
    public PypAdmAgend RAgendas = new PypAdmAgend();
    //Controladores
     
}
