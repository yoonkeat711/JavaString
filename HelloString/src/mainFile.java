package src;

import java.util.Scanner;

public class mainFile {
    public static void main(String[] args) {

        System.out.println("Enter a string:");
        try (Scanner sc = new Scanner(System.in)) {
            String string = sc.nextLine();

            StringConverter stringConvert = new StringConverter(string);

            System.out.println(stringConvert.convertToAllCap());
            System.out.println(stringConvert.convertAlternateCharacter());
            stringConvert.createCSV();
            
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}
