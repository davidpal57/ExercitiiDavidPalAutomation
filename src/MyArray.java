public class MyArray {
    public static void main(String[] args) {
        int myArray[] = {1,2,3,4}; // un array se declara daca se pune [] inainte de nume sau [] dupa nume
        String []myStringArray = {"Unu", "Doi", "Trei", "Patru"}; // un array declarat prin String
        System.out.println(myArray[3]);
        System.out.println(myStringArray[1]);

//        System.out.println(myStringArray[0]);
//        System.out.println(myStringArray[1]);
//        System.out.println(myStringArray[2]);
        for (int i=0; i<myStringArray.length; i++){
            if(i==3)
                System.out.print(myStringArray[i] + "\n");
            else
                System.out.print(myStringArray[i] + " ");
        }

        for (int i=0; i<myArray.length; i++){
            if(i==3)
                System.out.print(myArray[i] + "\n");
            else
                System.out.print(myArray[i] + " ");
        }
        System.out.println(myArray.length);

        double exercitiuArray[] = {1.5, 2.6, 3.7, 4.8};
        System.out.println(exercitiuArray[1]);
        System.out.println(exercitiuArray[3]);
        System.out.println(exercitiuArray.length);

        System.out.println("\n");
        char exDoiArray[] = {'a', 'b', 'c', 'd'};
        System.out.println(exDoiArray[0]);
        System.out.println(exDoiArray[1]);
        System.out.println(exDoiArray[3]);
        System.out.println("\n");
        for (int i=0; i<exDoiArray.length; i++)
            System.out.println(exDoiArray[i]);
    }
}
