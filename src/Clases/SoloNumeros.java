/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
/**
 *
 * @author idlhdeveloper
 */
public class SoloNumeros extends PlainDocument {
  
    @Override
    public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException
    {
     for (int i=0;i<arg1.length();i++) {
            if (!Character.isDigit(arg1.charAt(i))) {
             return;
         }
        }
     super.insertString(arg0, arg1, arg2);
 }  
    
}
