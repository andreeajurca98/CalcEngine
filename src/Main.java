

public class Main {
    public static void main(String[] args) {
        //lesson 3-4
        /*double value1 = 100.0d;
        double value2 =  50.0d;
        double result = 0.0d;
        char opCode = 's';

       if(opCode == 'a'){
            result = value1+value2;
        }
        else if (opCode == 's') {
            result = value1 - value2;}
            else if (opCode == 'm'){
                result = value1 * value2;}
                else if (opCode == 'd'){
                    result = value1/value2;
            } else {
                    result = 0.0d;
        }
//System.out.println(result);*/
        //lesson5-4
        /* int students=150;
        int rooms=0;
        if (rooms != 0 && students/rooms > 30){
            System.out.println("Crowded");
        }

        //System.out.println("smth"); */
        //lesson10-4
        /* switch(opCode) {
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value2 != 0 ? value1 / value2 : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        System.out.println(result); */
        //lesonn2-5
        /*int someValue = 4;
        int factorial = 1;
        while(someValue>1){
            factorial *= someValue;
            someValue--;
        }
        System.out.println(factorial);*/
        //lesson3-5
        /*  int iVal = 10;
        do{
            System.out.println(iVal);
            System.out.println("*2=");
            iVal *=2;
            System.out.println(iVal);
        } while (iVal < 25); */
        //lesson 4-5
        /*for(int i=1; i<100; i *=2){
            System.out.println(i);
        }*/
        //lesson 5-5
        /* float[] theVals1 = new float[3];
        theVals1[0] = 10.0f;
        theVals1[1] = 20.0f;
        theVals1[2] = 15.0f;
        float sum1 = 0.0f;
        for(int index = 0; index < theVals1.length; index++)
            sum1 += theVals1[index];
        System.out.println(sum1); // displays 45
        float[] theVals2 = new float[3];
        theVals2[0] = 10.0f;
        theVals2[1] = 20.0f;
        theVals2[2] = 15.0f;
        float sum2 = 0.0f;
        for(int index = 0; index < theVals2.length; index++)
            sum2 += theVals2[index];
        System.out.println(sum2); // displays 45
        float sum3 = 0.0f;
        for(float currentVal1 : theVals1)
            sum3 += currentVal1;
        System.out.println(sum3); // displays 45

        float sum4 = 0.0f;
        for(float currentVal2 : theVals2)
            sum4 += currentVal2;
        System.out.println(sum4); // displays 45 */
        //lesson 8-5
        /* double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        for(int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode: " + opCodes[i]);
                    results[i] = 0.0d;
                    break;
            }
        }

        for(double currentResult : results)
            System.out.println(currentResult);*/

        //lesson 7-6 + 9-6 + 10 - 6
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

        if (args.length == 0)
        {
            for (int i = 0; i < opCodes.length; i++) {
                execute(opCodes[i], leftVals[i], rightVals[i]);
            }
            for (double currentResult : results)
                System.out.println(currentResult);
        }  else if (args.length == 3)
                handleCommandLine(args);

            else
            System.out.println("Please provide an operation code and 2 numeric values:");
    }

        private static void handleCommandLine (String[]args){
         char opCode = args[0].charAt(0);
         double leftVal = Double.parseDouble(args[1]);
         double rightVal = Double.parseDouble(args[2]);
         double result = execute(opCode, leftVal, rightVal);
         System.out.println(result);
        }
//smth
    static double execute(char opCode, double leftVal, double rightVal){
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        return  result;
    }
}