import org.w3c.dom.ls.LSOutput;

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

}
