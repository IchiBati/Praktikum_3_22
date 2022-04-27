package de.hrw.progra2.assignment3;

public class TemperatureConverter {



    public static void main(String[] args) {

        if ( args.length == 2 && ( args[0].equals("0") || args[0].equals("1") ) || ( args.length == 3 && args[0].equals("--useInteger") && ( args[1].equals("0") || args[1].equals("1"))) ){

            int useInteger = args.length == 3 ? 1 : 0;
            float celsius = Float.parseFloat(args[1 + useInteger]);
            boolean convertToKelvin = args[useInteger].equals("0");
            char unit = args[useInteger].equals("0") ? 'K' : 'F';
            double result = convertToKelvin ? celsius + 273.15 : celsius * 1.8 + 32;


            if (useInteger == 1){
                System.out.println(celsius + "C" + " = " + (int)result + unit);
            }
            else{
                System.out.println(celsius + "C" + " = " + result + unit);
            }

        }

        else{
            System.out.println("Argument issue!");
        }



        




    }
}
