/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_pyp;

import javax.swing.UIManager;

/**
 *
 * @author IdlhDeveloper
 */
public class Modulo_PyP {
public static Desktop d;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
         try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
        }
        d = new Desktop();
        d.show();
    }
}
