import java.util.Locale;

public class MyString {
    public static void main(String[] args) {
        String myString = "This is a text";
        int lungime = myString.length();
        System.out.println(lungime);
        String myName = "David Pal";
        int lungimeaNumelui = myName.length();
        System.out.println(lungimeaNumelui);
        System.out.println("lungimea numelui \""+myName+"\" este "+lungimeaNumelui); // \ - te lasa sa adaugi o variabila intre ghilimele
        System.out.println("lungimea numelui \""+myName+"\" este \n"+lungimeaNumelui); // \n - trece pe linia urmatoare intre ghilimele
        String myNameWithoutSpace = myName.replace(" ", ""); // se inlocuieste din myName ("David Pal") spatiul(" ") dintre "David" si "Pal" cu ""
        int lungimeaNumeluiFaraSpatii = myNameWithoutSpace.length(); // in urma inlocuirii de mai sus myNameWithoutSpace devine "DavidPal" si se calculeaza lungimea acestui string
        System.out.println(lungimeaNumeluiFaraSpatii);
        char aPatraLitera = myName.charAt(4); // numaratoarea intotdeauna se incepe de la 0 in string-uri
        char primaLitera = myName.charAt(0); // 0 este primul caracter introdus intre ghilimele
        System.out.println(aPatraLitera);
        System.out.println(primaLitera);

        String numeTara = "Islanda";
        int lungimeNumeTara = numeTara.length();
        System.out.println(lungimeNumeTara);

        String myFavouriteMovie =  "Forrest Gump";
        System.out.println("My favourite movie is \""+myFavouriteMovie+"\".");
        System.out.println(myFavouriteMovie.toLowerCase());
        System.out.println(myFavouriteMovie.toUpperCase());
        System.out.println(myFavouriteMovie.length());
    }
}