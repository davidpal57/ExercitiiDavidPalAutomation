public class Algorithms {
    public static void main(String[] args) {
        int numere[] = {1, -25, 34, -2, 67, 5};
        for(int i = 0; i < numere.length; i++){
            System.out.println((numere[i] - 1) + " " + (numere[i] + 1));
        }

        for(int i = 0; i < numere.length; i++)
            if(numere[i] < 0)
                System.out.println(numere[i]);

        String tari[] = {"Anglia", "Romania", "Albania", "Franta", "Elvetia", "China"};
        for(String t: tari){
            System.out.println(t.charAt(0) + " " + t.length() + " " + t.contains("n"));
        }

        System.out.println();
        for(String t:tari){
            if (t.charAt(0) == 'A')
                System.out.println(t);
        }
        String taranumelung = " ";
        String taranumescurt = "";
        for(String t:tari){
            if(t.length() > taranumelung.length())
                taranumelung = t;
            if(taranumescurt.length() == 0)
                taranumescurt = t;
            else if (taranumescurt.length() > t.length())
                taranumescurt = t;
        }
        System.out.println(taranumelung);
        System.out.println(taranumescurt);
    }
}
