
package com.coders.hospital.validation;

/**
 *
 * @author Codersbay
 */
public class Validation {
    
    public static boolean isEmpty(String... text) {
        for (String s : text) {
            if (s.isEmpty()) {
                return true;
            }
        }
        return false;
//        for (int i = 0; i < text.length; i++) {
//            if (text[i] == null || text[i].isEmpty()) {
//                return true;
//            }
//        }
//        return false;

    }
    public static boolean isEmpty(int... values) {
        for(int i : values) {
            if (i < 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isDigit (String... text){
        for (String s : text){
            if (!s.matches("[0-9]+")){
                return false;
            }
        }
      return true;
    }
        public static boolean isText (String... text){
        for (String s : text){
            if (!s.matches("[a-zA-Z]+")){
                return false;
            }
        }
      return true;
    }
}
