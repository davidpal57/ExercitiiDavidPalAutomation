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

        System.out.println("Exercitiul 1:");
        System.out.println(10*6);
        System.out.println("Exercitiul 2:");
        System.out.println(10/5);
        System.out.println("Exercitiul 3:");
        int x = 10;
        ++x;
        System.out.println(x);
        System.out.println("Exercitiul 4:");
        int y = 10;
        y += 5;
        System.out.println(y);
        System.out.println("Exercitul 5:");
        int u = 29;
        int o = 57;
        int s = u + o;

        if(s>=10)
            System.out.println("suma este mai mare decat 10");
        else System.out.println("suma este mai mica decat 10");

        System.out.println("Exercitiul 6:");
        if(s%2==0)
            System.out.println("suma este numar par");
        System.out.println("-Exercitii optionale-");
        System.out.println("Exercitiul 1:");
        int var1, var2, var3, var4;

        var1=5;
        var2=7;
        var3=2;
        var4=9;

        int suma = var1+var2+var3+var4;
        int produs = var1*var2*var3*var4;

        System.out.println(var1+var2+var3+var4);
        System.out.println(var1*var2*var3*var4);
        System.out.println(var4/var2);

        System.out.println("Exercitiul 2:");
        for(int i = 0; i < 3; i++)
            var1++;
        System.out.println(var1);

        System.out.println("Exercitiul 3:");
        for(int i = 0; i < 2; i++)
            var2--;
        System.out.println(var2);

        System.out.println("Exercitiul 4:");
        boolean cond1 = suma>100;
        boolean cond2 = produs>1000;
        System.out.println(cond1);
        System.out.println(cond2);

        System.out.println("Exercitiul 5:");
        if(cond1)
            System.out.println("Conditia este adevarata.");
        else System.out.println("Conditia este falsa.");
        if(cond2)
            System.out.println("Conditia este adevarata.");
        else System.out.println("Conditia este falsa.");
    }
}
