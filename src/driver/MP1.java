/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import action.MyMarshaller;
import action.RussianDollValidation;
import action.SalamiSliceValidation;
import action.VenetianBlindValidation;

/**
 *
 * @author Lei
 */
public class MP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.exit(1);
        }

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("russianDollValidation")) {
                RussianDollValidation russianDollValidation = new RussianDollValidation();
                russianDollValidation.validate();
            }
            if (args[i].equals("russianDollInvalidation")){
                RussianDollValidation russianDollValidation = new RussianDollValidation();
                russianDollValidation.invalidate();
            }
            if (args[i].equals("salamiSliceValidation")) {
                SalamiSliceValidation salamiSliceValidation = new SalamiSliceValidation();
                salamiSliceValidation.validate();
            }
            if (args[i].equals("salamiSliceInvalidation")){
                SalamiSliceValidation salamiSliceValidation = new SalamiSliceValidation();
                salamiSliceValidation.invalidate();
            }
            if (args[i].equals("venetianBlindValidation")) {
                VenetianBlindValidation venetianBlindValidation = new VenetianBlindValidation();
                venetianBlindValidation.validate();
            }
            if (args[i].equals("venetianBlindInvalidation")){
                VenetianBlindValidation venetianBlindValidation = new VenetianBlindValidation();
                venetianBlindValidation.invalidate();
            }
            if (args[i].equals("marshall")) {
                MyMarshaller myMarshaller = new MyMarshaller();
                myMarshaller.marshall();
            }
            if (args[i].equals("unmarshall")) {
                MyMarshaller myMarshaller = new MyMarshaller();
                myMarshaller.unmarshall();
            }
        }
    }
}
