public class Operators {
    public static void main(String[] args) {
        int sum1 = 100+50;
        int sum2 = sum1+50;
        int sum3 = sum1+sum2;

        System.out.println("sum1=" + sum1);
        System.out.println("sum2=" + sum2);
        System.out.println("sum3=" + sum3);

        int number1 = 100;
        int number2 = 50;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);
        System.out.println(number1 * number2);
        System.out.println(9/2); // catul
        System.out.println(9%2); // restul impartirii
        System.out.println(10%7);
        System.out.println(++number1); // se noteaza inainte, nu dupa ca la c++
        System.out.println(number1++); // daca ii dau ++ dupa ce apelez variabila atunci urmatoarea data cand o s-o afisez
        System.out.println(number1);// imi va afisa variabila crescuta deoarece am folosit operaia ++ dupa apelarea variabilei (conteaza ordinea in situatiile asemanatoare)
        System.out.println(--number2);
        int number3 = number2;
        number2 = 1;
        System.out.println(number3);
        System.out.println(number2);

        //number2 = number2+2;
        number2+=4;
        System.out.println(number2);
        number2-=2;
        System.out.println(number2);
        number2/=3;
        System.out.println(number2);
        number2*=5;
        System.out.println(number2);
        System.out.println(number1>number2);
        System.out.println('A'=='A');
        System.out.println('A'>'B');
        System.out.println(!true);
        number1 = 101;
        number2 = 6;
        boolean condition = number1>number2 && number1>100;
        System.out.println(condition);
        condition = number1>number2 || number1>100;
        System.out.println(condition);

        if (condition)
            System.out.println("Conditia este adevarata");
        else System.out.println("Cobditia nu este adevarata");

        int z=2;
        if(z%2==0)
            System.out.println("Numarul este par");
        else System.out.println("Numarul nu este par");

        System.out.println("Exercitul 5:");
        int u = 29;
        int o = 57;
        int s = u + o;

    }
}
