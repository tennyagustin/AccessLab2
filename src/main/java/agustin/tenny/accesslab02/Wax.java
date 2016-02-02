package agustin.tenny.accesslab02;

/**
 * Created by Tenny on 2/2/16.
 */
public class Wax {

    private String color;
    private String type;

    private Wax(String x, String y) {

        setColor(x); //to set color

        if (color.equals("Yellow") || color.equals("White")) {
            type = "Standard";
        } else {
            type = y; //to set type; can set either way
        }
    }

    public static Wax chooseWax(String x, int y) {
        String typeChoice = chooseType(x);
        String colorChoice = chooseColor(y);

        return new Wax(typeChoice, colorChoice); //alias-ing (String x, String y) from constructor
//every time you see a ., it's calling a method
//new is a special method call that looks for a constructor
    }

    public String getColor() {
        return color;
    }

    public void setColor(String x) {
        color = x;
    }

    public String getType() {
        return type;
    }

    public void setType(String y) {
        type = y;
    }

    private static String chooseType(String x) {
        String temp = "";

        if (x.toLowerCase().equals("powder")) {
            temp = "Special";
        } else if (x.toLowerCase().equals("firm")) {
            temp = "Standard";
        } else if (x.toLowerCase().equals("crusty")) {
            temp = "Extra";
        } else {
            temp = "Invalid.";
        }
        return temp;
    }


    private static String chooseColor(int x) {

        String temp="";

        if(x>38) {
            temp = "Yellow";
        } else if(x>31 && x<=38) {
            temp = "Red";
        } else if(x>26 && x<=38) {
            temp = "Violet";
        } else if(x>18 && x<=31) {
            temp = "Blue";
        } else if(x>5 && x<=18) {
            temp = "Green";
        } else if(x<=5) {
            temp = "White";
        }

        return temp;

    }

}


