/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

/**
 *
 * @author Lei SalamiSliceValidation class is for validating nutrition.xml
 * against Salami Slice pattern
 */
public class SalamiSliceValidation {

    private Source xmlFile;
    private InputStream xmlStream;
    private SchemaFactory schemaFactory;
    private Schema schema;
    private InputStream xslStream;
    private Source xslFile;
    private Validator validator;

    public void validate() {
        try {
            //Load instance/schema documents from classpath
            xmlStream = this.getClass().getClassLoader().getResourceAsStream("nutrition.xml");
            xslStream = this.getClass().getClassLoader().getResourceAsStream("nutritionSalamiSlice.xsd");
            xmlFile = new StreamSource(xmlStream);
            //Create schema factory
            schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            //Load schema document
            xslFile = new StreamSource(xslStream);
            schema = schemaFactory.newSchema(xslFile);
            //Create validator
            validator = schema.newValidator();
            //Validator
            validator.validate(xmlFile);
            System.out.println("\n\n====  Validation against Salami Slice Schema successfull!  ====\n\n");
        } catch (SAXException | IOException ex) {
            System.out.println(ex);
        } finally {
            if (xmlStream != null) {
                try {
                    xmlStream.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
            if (xslStream != null) {
                try {
                    xslStream.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
    
    public void invalidate(){
        try {
            //Load instance/schema documents from classpath
            xmlStream = this.getClass().getClassLoader().getResourceAsStream("invalidNutrition.xml");
            xslStream = this.getClass().getClassLoader().getResourceAsStream("nutritionSalamiSlice.xsd");
            xmlFile = new StreamSource(xmlStream);
            //Create schema factory
            schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            //Load schema document
            xslFile = new StreamSource(xslStream);
            schema = schemaFactory.newSchema(xslFile);
            //Create validator
            validator = schema.newValidator();
            //Validator
            validator.validate(xmlFile);
        } catch (SAXException | IOException ex) {
            System.out.println("\n\n====  Validation against Salami Slice Schema failed, the instance document is not valid!  ====\n\n");
            System.out.println(ex);
        } finally{
            if (xmlStream != null){
                try {
                    xmlStream.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
            if (xslStream != null){
                try {
                    xslStream.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
