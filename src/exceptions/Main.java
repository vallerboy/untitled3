package exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program działa dalej");

        try {
            test();
        } catch (IOException e) {
            System.out.println("Hejo userku, sorki nie dziala :)");
        } finally {
            System.out.println("asdsadasdsadsa zawsze sie wykona");
        }
    }


    //-------------------------------------------------------------------------------------------

    public static void test() throws IOException {
        methodWitchIsThrowingEx();
    }

    public static void methodWitchIsThrowingEx() throws IOException {
        int b = 0;
        if(b == 0){
            throw new IOException();
        }
    }
}
