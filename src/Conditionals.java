import java.sql.SQLOutput;

public class Conditionals {
    public static void main(String[] args) {
        if( 5 > 0 ){
            System.out.println("5 is greater than 0");
        }
        else {
            System.out.println("5 is not smaller than 0");
            System.out.println("another statement");
        }
        int time = 19;
        if( time < 10 ) {
            System.out.println("Good morning");
        }
        else if ( time < 18 ) {
            System.out.println("Good day");
        }
        else if ( time < 24 ) {
            System.out.println("Good evening");
        }
        else System.out.println("There are only 24 hours in a day");

        int day = 15;

        switch(day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("unknown");
        }
        System.out.print("\n");
        System.out.println("Exercitii 10/18");
        System.out.print("\n");
        System.out.println("Exercitiul 1:");
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.print("\n");
        System.out.println("Exercitiul 2:");
        for(int i = 20; i >= 10; i --)
            System.out.println(i);
        System.out.print("\n");
        System.out.println("Exercitiul 3:");
        for(int i = 0; i <=100; i += 2)
            System.out.println(i);
        System.out.print("\n");
        System.out.println("Exercitiul 4:");
        String numeFruct[] = {"mar", "capsune", "pere", "banane"};
        for(String fructe: numeFruct) {
            System.out.println("Imi place sa mananc " + fructe);
        }

        System.out.print("\n");
        System.out.println("Exercitiul 5:");
        int luna = 10;
        switch(luna){
            case 1: System.out.println("Ianuarie"); break;
            case 2: System.out.println("Februarie"); break;
            case 3: System.out.println("Martie"); break;
            case 4: System.out.println("Aprilie"); break;
            case 5: System.out.println("Mai"); break;
            case 6: System.out.println("Iunie"); break;
            case 7: System.out.println("Iulie"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("Septembrie"); break;
            case 10: System.out.println("Octombrie"); break;
            case 11: System.out.println("Noiembrie"); break;
            case 12: System.out.println("Decembrie"); break;
            default: System.out.println("Un an are doar 12 luni");
        }

        System.out.println("\n");
        System.out.println("Exercitii optionale - Testare automata");
        System.out.println("Instructiuni conditionale");
        System.out.println("\n");
        System.out.println("Exercitiul 1");
        int temperature = 20;
        if(temperature < 18)
            System.out.println("prea frig");
        else if (temperature >= 18 && temperature <= 22)
            System.out.println("ok");
        else if (temperature > 22)
            System.out.println("prea cald");

        System.out.println("\n");
        System.out.println("Exercitiul 2");
        char gen1 = 'm';
        char gen2 = 'f';
        boolean married = false;
        if(gen1 == 'm' && (married || married == false))
            System.out.println("Domnul");
        if (gen2 == 'f' && married)
            System.out.println("Doamna");
        else if (gen2 == 'f' && married == false)
            System.out.println("Domnisoara");

        System.out.println("\n");
        System.out.println("Exercitiul 3");
        int var1 = 28;
        int var2 = 65;
        if(var1 > var2)
            System.out.println(var1 + " este mai mare decat" + var2);
        else if (var2 > var1)
            System.out.println(var2 + " este mai mare decat " + var1);
        else if (var1 == var2)
            System.out.println("sunt egale");

        System.out.println("\n");
        System.out.println("Exercitiul 4");
        int var3 = 892;
        if(var1 > var2) {
            if(var1 > var3)
                System.out.println(var1);
            else System.out.println(var3);
        }
        else if (var2 > var1){
            if(var2 > var3)
                System.out.println(var2);
            else System.out.println(var3);
        }

        System.out.println("\n");
        System.out.println("Exercitiul 5");
        char letter = 'o';
        char vocale[] = {'a', 'e', 'i', 'o', 'u'};
        int vocala = 0;
        for(int i = 0; i < vocale.length; i++){
            if(letter == vocale[i])
                vocala++;
        }
        if (vocala > 0)
            System.out.println("\""+letter+"\" este vocala");
        else System.out.println("\""+letter+"\" este consoana");
    }
}
