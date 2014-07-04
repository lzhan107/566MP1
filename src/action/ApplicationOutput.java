/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lei
 */
public class ApplicationOutput {

    private static PrintStream output;

    public static void redirectOutput() {
        try {
            output = new PrintStream("./output/mp1out.txt");
            System.setOut(output);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ApplicationOutput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static PrintStream getOutput() {
        return output;
    }
}
