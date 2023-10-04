import java.sql.SQLOutput;

public class DataTypes {
    public static void main(String[] args) {
        boolean myBoolean = true;
        char myChar = 'a';
        byte myByte = 57;
        short myShort = 32767;
        int myInt = 32768;
        long myLong = 9999999999999999L;
        float myFloat = 5.5f + 8.5f;
        double myDouble = 7.7534 + 6.1562;

        int x = 5;
        double y = 7.5;
        double z = 5.5;
        // x=5; y = x -> double poate lua valoare lui int fiindca e mai mare
        // y=7.5; x = y -> int nu poate lua valoare lui double fiindca e mai mic
        double sum = (int) (x+y); // se poate luat doar partea intreaga a sumei deoarece o variabila este de tip double
        int w = (int) z; // variabila w poate luat valoare lui z doar daca iau partea intreaga (int) din z
        System.out.println(x + y); // asta va fi o suma de tip double deoarece double este mai mare
        System.out.println(sum);
        System.out.println(z);

        System.out.println(myBoolean);
        myBoolean = false;
        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println("myDouble" + "\n");

        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        String myOtherText = "1a2b3c";
        byte myByteNum = 57;
        int myIntNum = myByteNum;
        float myFloatNum2 = 6.63f;
        int myIntNum2 = (int) myFloatNum2;

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println(myOtherText);

        System.out.print(myIntNum);
        System.out.print("\n");
        System.out.println(myIntNum2);

        float varUnu = 5.77f;
        float varDoi = 7.11f;

        System.out.println(varUnu + varDoi);
        System.out.println(varUnu - varDoi);
        System.out.println(varUnu * varDoi);
    }
}
