package de.hrw.progra2.assignment3;

public class TemperatureConverter {



    public static void main(String[] args) {


        if (args.length >= 2 && args.length <= 3){
            if (args.length == 2 && ( args[0].equals("0") || args[0].equals("1") ) ){
                float celsius = Float.parseFloat(args[1]);
                boolean convToKelvin = args[0].equals("0");
                System.out.printf("%.2fC = %.2f%s", celsius, convToKelvin ? celsius + 273.15 : celsius * 1.8 + 32, args[0] );
            }
            else if(args.length == 3 && args[0].equals("--useInteger") && ( args[1].equals("0") || args[1].equals("1") )){

            }
        }

        




    }
}
