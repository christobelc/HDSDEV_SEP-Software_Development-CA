package SentenceEncoder;

import java.util.Scanner;

public class SentenceEncoderApp {
    public static void main(String[] args) {

        // Variable declaration
        SentenceEncoder encode;
        Scanner scanner = new Scanner(System.in);
        String testSentence;

        System.out.println("Input a sentence to encode:");
        // ---------------input--------------
        testSentence = scanner.nextLine();

        // -------------process--------------
        // pass the input testsentence to the SentenceEncoder class
        encode = new SentenceEncoder(testSentence);
        // encode the sentence
        encode.encodeSentence();

        // -------------output --------------
        System.out.println(encode.getEncodedSentence());
        // Close scanner.
        scanner.close();
    }
}