//import java.util.Scanner;
//public class Test {
//    public static void main(String[] args) {
//        int[] mass = enterArray();
//        int size = mass.length;
//        int temp = mass[0];
//        int s = 0;
//        int m = 1;
//        for (int i = 1; i < size; i++) {
//            if (mass[i] > temp) {
//                s += mass[i];
//                m *= mass[i];
//            } else {
//                temp = mass[i];
//                s = 0;
//                if (i == size - 1) m = 0;
//                else m = 1;
//
//            }
//        }
//        System.out.println(s);
//        System.out.println(m);
//    }
//    public static int[] enterArray(){
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int size = 2*n;
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++){
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//}

class Test{
    public static void main(String[] args) {
        String str1 = "London";
        String str2 = "Berlin";
        String str3 = "London";
        String str4 = "berlin";
        String str5 = new String("Rome").intern();
        String str6 = new String("Berlin");
        String str7 = new String("Rome").intern();
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);
        System.out.println(str2 == str6);
        System.out.println(str5 == str7);
    }
}