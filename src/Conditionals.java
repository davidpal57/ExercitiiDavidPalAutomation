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
        System.out.println("Exercitii10/18");
        System.out.println("\n");
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
        System.out.println("\n");
        System.out.println("Exercitiul 4:");
        String sir[] = {"mar", "capsune", "pere", "banane"};
        for(String fructe: sir) {
            System.out.println(fructe);
        }
    }
}
