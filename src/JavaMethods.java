public class JavaMethods {
    public static void main(String[] args) {
        printHello();
        weLearn();
        helloName("David");
        getSum(2,3);
        getProduct(5,10);
        getSum(5,12,763);
        getSum(2.3,5.6);
        helloNameAge("David", 100);
        twoFriends("Asterix","Obelix");
        System.out.println(getSumWithReturn(5,6));//trebuie or sa dam unei variabile valoarea cu functia "getSumWithReturn" si pe urma sa o afisam sau sa o afisam direct, cum am facut eu
        System.out.println(getProductWithReturn(5,6));
        System.out.println(areMere("Ana"));
        System.out.println(areMere("David"));
        inversulNumarului(35);
        numarulMaiMare(-4,0);
        mediaAritmetica(1, 2, 3.3);
        lungimeString("Propaganda");
        concatenareStringuri("tu alegi", "ce alegi");
        inversString("abcdefg");
        System.out.println('\n');
        ninge();
        System.out.println(nrPar(84));
        lunaAnotimp("decembrie");
        System.out.println(nrMaiMare(11,21));
        System.out.println(nrCelMaiMare(11,11,11,12));
        System.out.println(literaMijloc("zapada"));
        System.out.println(lungimeaString("perpendicular"));
        System.out.println(sumaCifrelor(354));
        System.out.println(metodaEx8Optionale(873));
    }

    private static void printHello(){
        System.out.println("Hello World");
    }

    private static void weLearn(){
        System.out.println("We learn methods.");
    }

    private static void helloName(String name){
        System.out.println("Hello " + name);
    }

    private static void helloNameAge(String name, int age){
        System.out.println(name + " is " + age + " years old");
    }

    private static void getSum(int x, int y){
        System.out.println(x+y);
    }

    private static void getSum(double x, double y){
        System.out.println(x + y);
    }

    private static void getSum(int x, int y, int z){
        System.out.println(x+y+z);
    }

    private static void getProduct(int a, int b){
        System.out.println(a*b);
    }

    private static void twoFriends(String name1, String name2){
        System.out.println(name1 + " and " + name2 + " are friends");
    }
    private static int getSumWithReturn(int x, int y){
        int sum = x+y;
        return sum;
    }

    private static int getProductWithReturn(int x, int y){
        int prod = x*y;
        return prod;
    }
    private static String areMere(String nume){
        return nume + " are mere";
    }

    private static void inversulNumarului(int x){
        System.out.println(x-2*x);
    }

    private static void numarulMaiMare(int x, int y){
        if (x > y)
            System.out.println(x);
        else System.out.println(y);
    }

    private static void mediaAritmetica(double x, double y, double z){
        double sum;
        sum = (x + y + z) / 3;
        System.out.println(sum);
    }

    private static void lungimeString (String input){
        System.out.println(input.length());
    }

    private static void concatenareStringuri (String input1, String input2){
        System.out.println(input1 + " " + input2);
    }

    private static void inversString (String input){
        char litere[] = input.toCharArray();
        for (int i = input.length() - 1; i >= 0; i--){
            System.out.print(litere[i]);
        }
    }

    private static void ninge(){
        System.out.println("In sfarsit ninge!");
    }

    private static boolean nrPar(int x) {
        if (x % 2 == 0)
            return true;
        else return false;
    }

    private static void lunaAnotimp (String luna){
        String primvara[] = {"martie", "aprilie", "mai"};
        String vara[] = {"iunie", "iulie", "august"};
        String toamna[] = {"septembrie", "octombrie", "noiembrie"};
        String iarna[] = {"decembrie", "ianuarie", "februarie"};
        if (luna == primvara[0] || luna == primvara[1] || luna == primvara[2])
            System.out.println("primavara");
        else if (luna == vara[0] || luna == vara[1] || luna == vara[2])
            System.out.println("vara");
        else if (luna == toamna[0] || luna == toamna[1] || luna == toamna[2])
            System.out.println("toamna");
        else if (luna == iarna[0] || luna == iarna[1] || luna == iarna[2])
            System.out.println("iarna");
        else System.out.println("unknown");
    }

    private static int nrMaiMare (int x, int y){
        if (x>y)
            return x;
        else if (y>x)
            return y;
        else
            return x;
    }

    private static int nrCelMaiMare (int a, int b, int c, int d){
        if (a > b || a > c || a > d)
            return a;
        else if (b > a || b > c || b > d)
            return b;
        else if (c > a || c > b || c > d)
            return c;
        else
            return d;
    }

    private static char[] literaMijloc (String cuvant){
        char litere[] = cuvant.toCharArray();
        if(cuvant.length()%2==1)
            return new char[]{litere[cuvant.length() / 2]};
        else
            return new char[]{litere[cuvant.length()/2 - 1], litere[cuvant.length()/2]};
    }

    private static int lungimeaString (String cuvant){
        return cuvant.length();
    }

    private static double sumaCifrelor (double numar){
        double nrcifre;
        double nr = 0;
        nrcifre = numar;
        while (nrcifre>10) {
            nrcifre /= 10;
            nr++;
        }
        double b = (int) (numar / Math.pow(10, nr));
        double a;
        while (nr>0){
            a = (int) (numar - (numar / Math.pow(10,nr)) * Math.pow(10,nr));
            nr--;
            if(nr >= 1)
            b += a/Math.pow(10,nr);
            else b += a;
        }
        return b;
    } // EPIC FAIL..

    public static int metodaEx8Optionale (int numar){
        int sum = 0;
        while (numar > 0) {
            sum = sum + numar % 10;
            numar = numar / 10;
        }
        return sum;
    } // :/
}
