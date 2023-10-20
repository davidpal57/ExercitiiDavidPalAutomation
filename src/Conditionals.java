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
    }
}
