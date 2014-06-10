package Clases;

import java.util.regex.Pattern;

/**
 *
 * @author Camilo
 */
public class FuncionesC {

    public static String FormatDecimal(String numero) {

        numero = numero.replace(".", ",");
        if (numero.indexOf(",") == -1) {
            numero = numero + ",00";
        }
        if (Pattern.matches("\\d{1,9},\\d{1,2}", numero)) {
            String Num[] = numero.split(",");
            for (int i = 0; i < Num[0].length(); i++) {
                if (!Character.isDigit(Num[0].charAt(i))) {
                    return "";
                }
            }
            for (int i = 0; i < Num[1].length(); i++) {
                if (!Character.isDigit(Num[1].charAt(i))) {
                    return "";
                }
            }
            if (Num[1].length() == 1) {
                Num[1] = Num[1] + "0";
                numero = Num[0] + "." + Num[1];
            }
        } else {
            return "";
        }
        return numero;
    }
}
