import java.util.Arrays;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
         Methods methods = new Methods();

        System.out.println(methods.test(9));
        System.out.println(methods.sum(5, 5));
        System.out.println(methods.isPrimeNumber(7));
        System.out.println(methods.maxOccursInArray());

    }
    ////////////////////////////////////////////

    public boolean isSquare(int a){
        for (int i = 1; i < a / 2; i++) {
            if(i * i == a){
                return true;
            }
        }
        return false;
    }


    public void test() {
        System.out.println("My first method!!!!!!");
    }

    public int sum(int a, int b){
        return a + b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        return a / (double) b;
    }



    public boolean pitagoras(int a, int b, int c){
        return a * a + b * b == c * c;
    }

    public int sumOfDigit(int a){
        int sum = 0;
        while (a != 0){
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public boolean test(int a){
        return Math.sqrt(a) % 1 == 0;
    }


    public int zad6(int a) {
        //135
        String str = Integer.toString(a);
        String[] strt = str.split("");
        int[] integers = new int[strt.length];
        for(int i=0; i<strt.length;i++){
            integers[i] = Integer.parseInt(strt[i]);
        }
        int sum = 0;
        for(int i= 0; i<integers.length;i++){
            sum += integers[i];
        }
        return sum;

    }


    public boolean isPrimeNumber(int a){
        for (int i = 2; i < a; i++) {
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }


    public double mediana(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby rozdzielone przecinkiem: ");
        String[] numbersAsString = scanner.nextLine().split(",");
        int[] integers = new int[numbersAsString.length];

        for (int i = 0; i < numbersAsString.length; i++) {
             integers[i] = Integer.valueOf(numbersAsString[i]);
        }

        Arrays.sort(integers);

        if(integers.length % 2 == 0){
            return integers[integers.length / 2];
        }else{
            return (integers[integers.length / 2] + integers[integers.length / 2 - 1]) / 2.0;
        }
    }

    public int maxOccursInArray(){
        int[] ints = {1,2,3,4,1,123,213,12,3,213, 1};
        int actualMax = 0;
        int actualCount = 0;

        for (int i = 0; i < ints.length; i++) { // 1
             int localCount = 0;

            for (int x = 0; x < ints.length; x++) { //1
                if(ints[i] == ints[x]){
                    localCount++;
                }
            }

            if(localCount > actualCount){
                 actualMax = ints[i];
                 actualCount = localCount;
            }
        }

        return actualMax;
    }


}
