package Javalin.Automobili;

public class Automobili {

    static String [] marka = {"BMW", "Mercedes", "Audi", "Opel", "Ford"};
    static String [] model = {"320", "530", "740", "850", "A class", "B class", "C class", "E class",
            "S class", "A1", "A2", "A3", "A4", "A5", "A6", "A8", "Corsa", "Astra", "Insignia", "Fiesta", "Focus", "Mondeo"};
    static String [] tip = {"Hetchback", "Sedan", "Wagon", "Coupe"};

    public static String[] getMarka() {
        return marka;
    }

    public static void setMarka(String[] marka) {
        Automobili.marka = marka;
    }

    public static String[] getModel() {
        return model;
    }

    public static void setModel(String[] model) {
        Automobili.model = model;
    }

    public static String[] getTip() {
        return tip;
    }

    public static void setTip(String[] tip) {
        Automobili.tip = tip;
    }
}


