/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Controladores.PypAdmProgramasJpaController;
import Entidades.PypAdmProgramas;

/**
 *
 * @author IdlhDeveloper
 */
public class Declaraciones_AD {
    
    
    //Dialogos
   
    
    //Contenedores - Panel's
    public Administrativo.C_Contenedor CContenedor = new Administrativo.C_Contenedor();
    public Administrativo.C_Agendar Agendar = new Administrativo.C_Agendar();
    
    //Entidades
    public PypAdmProgramas Programas_PYP  = new PypAdmProgramas();
    
    //Controladores
    public PypAdmProgramasJpaController Control_Programas_PYP = new PypAdmProgramasJpaController();
    
    
    
    
    
    
    
    
}
