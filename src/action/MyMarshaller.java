/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import domain.Nutrition;
import domain.Nutrition.DailyValues;
import domain.Nutrition.DailyValues.Carb;
import domain.Nutrition.DailyValues.Cholesterol;
import domain.Nutrition.DailyValues.Fiber;
import domain.Nutrition.DailyValues.Protein;
import domain.Nutrition.DailyValues.SaturatedFat;
import domain.Nutrition.DailyValues.Sodium;
import domain.Nutrition.DailyValues.TotalFat;
import domain.Nutrition.Food;
import domain.Nutrition.Food.Calories;
import domain.Nutrition.Food.Minerals;
import domain.Nutrition.Food.Serving;
import domain.Nutrition.Food.Vitamins;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author Lei MyMarshaller class includes marshall and unmarshall() methods for
 * marhsalling and unmarshalling
 */
public class MyMarshaller {

    private TotalFat totalFat;
    private SaturatedFat saturatedFat;
    private Cholesterol cholesterol;
    private Sodium sodium;
    private Carb carb;
    private Fiber fiber;
    private Protein protein;
    private Serving serving;
    private Calories calories;
    private Vitamins vitamins;
    private Minerals minerals;
    private Food food;
    private List<Food> foodList;
    private DailyValues dailyValues;
    private Nutrition nutrition;
    private FileOutputStream marshalledFile;
    private JAXBContext jaxbContext;
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;
    private InputStream xmlStream;

    public void marshall() {
        buildXMLElements();
        try {
            marshalledFile = new FileOutputStream("nutritionMarshalled.xml");
            jaxbContext = JAXBContext.newInstance("domain");
            marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(nutrition, marshalledFile);
            System.out.println("\n\n====  Marshalling successfully, please check nutritionMarshalled.xml in current folder.  ====\n\n");
        } catch (FileNotFoundException | JAXBException ex) {
            System.out.println(ex);
        } finally {
            if (marshalledFile != null) {
                try {
                    marshalledFile.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }

    public void buildXMLElements() {
        totalFat = new TotalFat();
        saturatedFat = new SaturatedFat();
        cholesterol = new Cholesterol();
        sodium = new Sodium();
        carb = new Carb();
        fiber = new Fiber();
        protein = new Protein();
        serving = new Serving();
        calories = new Calories();
        vitamins = new Vitamins();
        minerals = new Minerals();
        food = new Food();
        foodList = new ArrayList<>();
        dailyValues = new DailyValues();
        nutrition = new Nutrition();
        //Set values
        totalFat.setUnits("g");
        totalFat.setValue(new BigInteger("65"));
        saturatedFat.setUnits("g");
        saturatedFat.setValue(new BigInteger("20"));
        cholesterol.setUnits("mg");
        cholesterol.setValue(new BigInteger("300"));
        sodium.setUnits("mg");
        sodium.setValue(new BigInteger("2400"));
        carb.setUnits("g");
        carb.setValue(new BigInteger("300"));
        fiber.setUnits("g");
        fiber.setValue(new BigInteger("25"));
        protein.setUnits("g");
        protein.setValue(new BigInteger("50"));
        //Set up daily values
        dailyValues.setTotalFat(totalFat);
        dailyValues.setSaturatedFat(saturatedFat);
        dailyValues.setCholesterol(cholesterol);
        dailyValues.setSodium(sodium);
        dailyValues.setCarb(carb);
        dailyValues.setFiber(fiber);
        dailyValues.setProtein(protein);
        //End of setting up daily values
        serving.setUnits("g");
        serving.setValue(new BigInteger("29"));
        calories.setFat("100");
        calories.setTotal("110");
        vitamins.setA(new BigInteger("0"));
        vitamins.setC(new BigInteger("0"));
        minerals.setCa(new BigInteger("0"));
        minerals.setFe(new BigInteger("0"));
        food.setName("Avocado Dip");
        food.setMfr("Sunnydale");
        food.setServing(serving);
        food.setCalories(calories);
        food.setTotalFat(new BigInteger("11"));
        food.setSaturatedFat(new BigInteger("3"));
        food.setCholesterol(new BigInteger("5"));
        food.setSodium(new BigInteger("210"));
        food.setCarb(new BigInteger("2"));
        food.setFiber(new BigInteger("0"));
        food.setProtein(new BigInteger("1"));
        food.setVitamins(vitamins);
        food.setMinerals(minerals);
        foodList.add(food);
        //next food
        food = new Food();
        food.setName("Bagels, New York Style");
        food.setMfr("Thompson");
        serving = new Serving();
        serving.setValue(new BigInteger("104"));
        food.setServing(serving);
        calories = new Calories();
        calories.setFat("35");
        calories.setTotal("300");
        food.setCalories(calories);
        food.setTotalFat(new BigInteger("4"));
        food.setSaturatedFat(new BigInteger("1"));
        food.setCholesterol(new BigInteger("0"));
        food.setSodium(new BigInteger("510"));
        food.setCarb(new BigInteger("54"));
        food.setFiber(new BigInteger("3"));
        food.setProtein(new BigInteger("11"));
        vitamins = new Vitamins();
        vitamins.setA(new BigInteger("0"));
        vitamins.setC(new BigInteger("0"));
        food.setVitamins(vitamins);
        minerals = new Minerals();
        minerals.setCa(new BigInteger("8"));
        minerals.setFe(new BigInteger("20"));
        food.setMinerals(minerals);
        foodList.add(food);
        //next food
        food = new Food();
        food.setName("Beef Frankfurter, Quarter Pound");
        food.setMfr("Armitage");
        serving = new Serving();
        serving.setValue(new BigInteger("115"));
        food.setServing(serving);
        calories = new Calories();
        calories.setFat("290");
        calories.setTotal("370");
        food.setCalories(calories);
        food.setTotalFat(new BigInteger("32"));
        food.setSaturatedFat(new BigInteger("15"));
        food.setCholesterol(new BigInteger("65"));
        food.setSodium(new BigInteger("1100"));
        food.setCarb(new BigInteger("8"));
        food.setFiber(new BigInteger("0"));
        food.setProtein(new BigInteger("13"));
        vitamins = new Vitamins();
        vitamins.setA(new BigInteger("0"));
        vitamins.setC(new BigInteger("2"));
        food.setVitamins(vitamins);
        minerals = new Minerals();
        minerals.setCa(new BigInteger("1"));
        minerals.setFe(new BigInteger("6"));
        food.setMinerals(minerals);
        foodList.add(food);
        //Next food
        food = new Food();
        food.setName("Chicken Pot Pie");
        food.setMfr("Lakeson");
        serving = new Serving();
        serving.setValue(new BigInteger("198"));
        food.setServing(serving);
        calories = new Calories();
        calories.setFat("200");
        calories.setTotal("410");
        food.setCalories(calories);
        food.setTotalFat(new BigInteger("22"));
        food.setSaturatedFat(new BigInteger("9"));
        food.setCholesterol(new BigInteger("25"));
        food.setSodium(new BigInteger("810"));
        food.setCarb(new BigInteger("42"));
        food.setFiber(new BigInteger("2"));
        food.setProtein(new BigInteger("10"));
        vitamins = new Vitamins();
        vitamins.setA(new BigInteger("20"));
        vitamins.setC(new BigInteger("2"));
        food.setVitamins(vitamins);
        minerals = new Minerals();
        minerals.setCa(new BigInteger("2"));
        minerals.setFe(new BigInteger("10"));
        food.setMinerals(minerals);
        foodList.add(food);
        nutrition.setDailyValues(dailyValues);
        nutrition.setFood(foodList);
    }

    public void unmarshall() {
        try {
            jaxbContext = JAXBContext.newInstance("domain");
            unmarshaller = jaxbContext.createUnmarshaller();
            xmlStream = this.getClass().getClassLoader().getResourceAsStream("nutrition.xml");
            nutrition = (Nutrition) unmarshaller.unmarshal(new StreamSource(xmlStream));
            System.out.println("\n\n====  Unmarshalling successfully, result for nutrition object:  ====\n\n");
            System.out.println(nutrition + "\n\n");
        } catch (JAXBException ex) {
            System.out.println(ex);
        } finally {
            if (xmlStream != null) {
                try {
                    xmlStream.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
