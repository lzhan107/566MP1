/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Lei
 * Annotated class for marshalling
 */
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dailyValues",
    "food"
})
@XmlRootElement(name = "nutrition")
public class Nutrition {

    @XmlElement(name = "daily-values", required = true)
    protected Nutrition.DailyValues dailyValues;
    @XmlElement(required = true)
    protected List<Nutrition.Food> food;

    public Nutrition.DailyValues getDailyValues() {
        return dailyValues;
    }

    public void setDailyValues(Nutrition.DailyValues value) {
        this.dailyValues = value;
    }

    public List<Nutrition.Food> getFood() {
        if (food == null) {
            food = new ArrayList<>();
        }
        return this.food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalFat",
        "saturatedFat",
        "cholesterol",
        "sodium",
        "carb",
        "fiber",
        "protein"
    })
    public static class DailyValues {

        @XmlElement(name = "total-fat", required = true)
        protected Nutrition.DailyValues.TotalFat totalFat;
        @XmlElement(name = "saturated-fat", required = true)
        protected Nutrition.DailyValues.SaturatedFat saturatedFat;
        @XmlElement(required = true)
        protected Nutrition.DailyValues.Cholesterol cholesterol;
        @XmlElement(required = true)
        protected Nutrition.DailyValues.Sodium sodium;
        @XmlElement(required = true)
        protected Nutrition.DailyValues.Carb carb;
        @XmlElement(required = true)
        protected Nutrition.DailyValues.Fiber fiber;
        @XmlElement(required = true)
        protected Nutrition.DailyValues.Protein protein;

        public Nutrition.DailyValues.TotalFat getTotalFat() {
            return totalFat;
        }

        public void setTotalFat(Nutrition.DailyValues.TotalFat value) {
            this.totalFat = value;
        }

        public Nutrition.DailyValues.SaturatedFat getSaturatedFat() {
            return saturatedFat;
        }

        public void setSaturatedFat(Nutrition.DailyValues.SaturatedFat value) {
            this.saturatedFat = value;
        }

        public Nutrition.DailyValues.Cholesterol getCholesterol() {
            return cholesterol;
        }

        public void setCholesterol(Nutrition.DailyValues.Cholesterol value) {
            this.cholesterol = value;
        }

        public Nutrition.DailyValues.Sodium getSodium() {
            return sodium;
        }

        public void setSodium(Nutrition.DailyValues.Sodium value) {
            this.sodium = value;
        }

        public Nutrition.DailyValues.Carb getCarb() {
            return carb;
        }

        public void setCarb(Nutrition.DailyValues.Carb value) {
            this.carb = value;
        }

        public Nutrition.DailyValues.Fiber getFiber() {
            return fiber;
        }

        public void setFiber(Nutrition.DailyValues.Fiber value) {
            this.fiber = value;
        }

        public Nutrition.DailyValues.Protein getProtein() {
            return protein;
        }

        public void setProtein(Nutrition.DailyValues.Protein value) {
            this.protein = value;
        }

        @Override
        public String toString() {
            return "DailyValues{" + "totalFat=" + totalFat + ", saturatedFat=" + saturatedFat + ", cholesterol=" + cholesterol + ", sodium=" + sodium + ", carb=" + carb + ", fiber=" + fiber + ", protein=" + protein + '}';
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Carb {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "units")
            protected String units;

            public BigInteger getValue() {
                return value;
            }

            public void setValue(BigInteger value) {
                this.value = value;
            }

            public String getUnits() {
                return units;
            }

            public void setUnits(String value) {
                this.units = value;
            }

            @Override
            public String toString() {
                return "Carb{" + "value=" + value + ", units=" + units + '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Cholesterol {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "units")
            protected String units;

            public BigInteger getValue() {
                return value;
            }

            public void setValue(BigInteger value) {
                this.value = value;
            }

            public String getUnits() {
                return units;
            }

            public void setUnits(String value) {
                this.units = value;
            }

            @Override
            public String toString() {
                return "Cholesterol{" + "value=" + value + ", units=" + units + '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Fiber {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "units")
            protected String units;

            public BigInteger getValue() {
                return value;
            }

            public void setValue(BigInteger value) {
                this.value = value;
            }

            public String getUnits() {
                return units;
            }

            public void setUnits(String value) {
                this.units = value;
            }

            @Override
            public String toString() {
                return "Fiber{" + "value=" + value + ", units=" + units + '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Protein {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "units")
            protected String units;

            public BigInteger getValue() {
                return value;
            }

            public void setValue(BigInteger value) {
                this.value = value;
            }

            public String getUnits() {
                return units;
            }

            public void setUnits(String value) {
                this.units = value;
            }

            @Override
            public String toString() {
                return "Protein{" + "value=" + value + ", units=" + units + '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class SaturatedFat {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "units")
            protected String units;

            public BigInteger getValue() {
                return value;
            }

            public void setValue(BigInteger value) {
                this.value = value;
            }

            public String getUnits() {
                return units;
            }

            public void setUnits(String value) {
                this.units = value;
            }

            @Override
            public String toString() {
                return "SaturatedFat{" + "value=" + value + ", units=" + units + '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Sodium {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "units")
            protected String units;

            public BigInteger getValue() {
                return value;
            }

            public void setValue(BigInteger value) {
                this.value = value;
            }

            public String getUnits() {
                return units;
            }

            public void setUnits(String value) {
                this.units = value;
            }

            @Override
            public String toString() {
                return "Sodium{" + "value=" + value + ", units=" + units + '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TotalFat {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "units")
            protected String units;

            public BigInteger getValue() {
                return value;
            }

            public void setValue(BigInteger value) {
                this.value = value;
            }

            public String getUnits() {
                return units;
            }

            public void setUnits(String value) {
                this.units = value;
            }

            @Override
            public String toString() {
                return "TotalFat{" + "value=" + value + ", units=" + units + '}';
            }
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "mfr",
        "serving",
        "calories",
        "totalFat",
        "saturatedFat",
        "cholesterol",
        "sodium",
        "carb",
        "fiber",
        "protein",
        "vitamins",
        "minerals"
    })
    public static class Food {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String mfr;
        @XmlElement(required = true)
        protected Nutrition.Food.Serving serving;
        @XmlElement(required = true)
        protected Nutrition.Food.Calories calories;
        @XmlElement(name = "total-fat", required = true)
        protected BigInteger totalFat;
        @XmlElement(name = "saturated-fat", required = true)
        protected BigInteger saturatedFat;
        @XmlElement(required = true)
        protected BigInteger cholesterol;
        @XmlElement(required = true)
        protected BigInteger sodium;
        @XmlElement(required = true)
        protected BigInteger carb;
        @XmlElement(required = true)
        protected BigInteger fiber;
        @XmlElement(required = true)
        protected BigInteger protein;
        @XmlElement(required = true)
        protected Nutrition.Food.Vitamins vitamins;
        @XmlElement(required = true)
        protected Nutrition.Food.Minerals minerals;

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

        public String getMfr() {
            return mfr;
        }

        public void setMfr(String value) {
            this.mfr = value;
        }

        public Nutrition.Food.Serving getServing() {
            return serving;
        }

        public void setServing(Nutrition.Food.Serving value) {
            this.serving = value;
        }

        public Nutrition.Food.Calories getCalories() {
            return calories;
        }

        public void setCalories(Nutrition.Food.Calories value) {
            this.calories = value;
        }

        public BigInteger getTotalFat() {
            return totalFat;
        }

        public void setTotalFat(BigInteger value) {
            this.totalFat = value;
        }

        public BigInteger getSaturatedFat() {
            return saturatedFat;
        }

        public void setSaturatedFat(BigInteger value) {
            this.saturatedFat = value;
        }

        public BigInteger getCholesterol() {
            return cholesterol;
        }

        public void setCholesterol(BigInteger value) {
            this.cholesterol = value;
        }

        public BigInteger getSodium() {
            return sodium;
        }

        public void setSodium(BigInteger value) {
            this.sodium = value;
        }

        public BigInteger getCarb() {
            return carb;
        }

        public void setCarb(BigInteger value) {
            this.carb = value;
        }

        public BigInteger getFiber() {
            return fiber;
        }

        public void setFiber(BigInteger value) {
            this.fiber = value;
        }

        public BigInteger getProtein() {
            return protein;
        }

        public void setProtein(BigInteger value) {
            this.protein = value;
        }

        public Nutrition.Food.Vitamins getVitamins() {
            return vitamins;
        }

        public void setVitamins(Nutrition.Food.Vitamins value) {
            this.vitamins = value;
        }

        public Nutrition.Food.Minerals getMinerals() {
            return minerals;
        }

        public void setMinerals(Nutrition.Food.Minerals value) {
            this.minerals = value;
        }

        @Override
        public String toString() {
            return "Food{" + "name=" + name + ", mfr=" + mfr + ", serving=" + serving + ", calories=" + calories + ", totalFat=" + totalFat + ", saturatedFat=" + saturatedFat + ", cholesterol=" + cholesterol + ", sodium=" + sodium + ", carb=" + carb + ", fiber=" + fiber + ", protein=" + protein + ", vitamins=" + vitamins + ", minerals=" + minerals + '}';
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Calories {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "total")
            protected String total;
            @XmlAttribute(name = "fat")
            protected String fat;

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String value) {
                this.total = value;
            }

            public String getFat() {
                return fat;
            }

            public void setFat(String value) {
                this.fat = value;
            }

            @Override
            public String toString() {
                return "Calories{" + "value=" + value + ", total=" + total + ", fat=" + fat + '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ca",
            "fe"
        })
        public static class Minerals {

            @XmlElement(required = true)
            protected BigInteger ca;
            @XmlElement(required = true)
            protected BigInteger fe;

            public BigInteger getCa() {
                return ca;
            }

            public void setCa(BigInteger value) {
                this.ca = value;
            }

            public BigInteger getFe() {
                return fe;
            }

            public void setFe(BigInteger value) {
                this.fe = value;
            }

            @Override
            public String toString() {
                return "Minerals{" + "ca=" + ca + ", fe=" + fe + '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Serving {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "units")
            protected String units;

            public BigInteger getValue() {
                return value;
            }

            public void setValue(BigInteger value) {
                this.value = value;
            }

            public String getUnits() {
                return units;
            }

            public void setUnits(String value) {
                this.units = value;
            }

            @Override
            public String toString() {
                return "Serving{" + "value=" + value + ", units=" + units + '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "a",
            "c"
        })
        public static class Vitamins {

            @XmlElement(required = true)
            protected BigInteger a;
            @XmlElement(required = true)
            protected BigInteger c;

            public BigInteger getA() {
                return a;
            }

            public void setA(BigInteger value) {
                this.a = value;
            }

            public BigInteger getC() {
                return c;
            }

            public void setC(BigInteger value) {
                this.c = value;
            }

            @Override
            public String toString() {
                return "Vitamins{" + "a=" + a + ", c=" + c + '}';
            }
        }
    }

    @Override
    public String toString() {
        return "Nutrition{" + "dailyValues=" + dailyValues + ", food=" + food + '}';
    }
}