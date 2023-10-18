import java.sql.SQLOutput;

public class Loops {
    public static void main(String[] args) {
        System.out.println("FOR");
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.print("\n");
        for(int i = 5; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.print("\n");
        for(int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.print("\n");
        String cars[] = {"BMW", "Mazda", "Opel", "Toyota"};
        for(String car: cars){
            System.out.println(car);
        }
        System.out.print("\n");
        System.out.println("WHILE");
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }
        System.out.print("\n");
        System.out.println("DO WHILE");
        int j = 0;
        do{
            System.out.println(j);
            j++;
        } while (j<5);
        System.out.print("\n");
        System.out.println("BREAK");
        for(int k = 0; k < 10; k++) {
            System.out.println(k);
            if (k == 4) break; // intrerupe executia cand k=4
        }
        System.out.print("\n");
        System.out.println("CONTINUE");
        for(int k = 0; k < 10; k++) {
            if (k == 4) continue; // ajunge la k = 4 si continua cu urmatorul proces
            System.out.println(k); // afiseaza de k de la 0 la 9, 4 fiind exclus datorita comenzii de mai sus
        }
        System.out.print("\n");
        int k = 0;
        while (k < 10) {
            k++;
            if(k == 4) continue;
            System.out.println(k);
        }
    }
}
