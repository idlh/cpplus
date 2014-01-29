/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author IdlhDeveloper
 */
public class Nat {
   public Object getEdad(String fecha){
   EntityManagerFactory emf = Persistence.createEntityManagerFactory("PyP_PersisPU");   
   EntityManager em = emf.createEntityManager();
   String Consulta = "SELECT `calc_edad`('"+fecha+"');";
   Query q = em.createNativeQuery(Consulta); 
   return q.getSingleResult().toString();
   } 
}
