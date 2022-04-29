package src;

import java.io.PrintWriter;

public class StringConverter {
    private String string;

    public StringConverter(String string) {
        this.string = string;
    }

    public String convertToAllCap() {
        try {
            return this.string.toUpperCase();
        } catch (Exception e) {
            return e.toString();
        }
    }

    public String convertAlternateCharacter() {
        StringBuilder sb = new StringBuilder();

        try {
            for (int index = 0; index < this.string.length(); index++) {
                char c = this.string.charAt(index);
                if (index % 2 == 0) {
                    sb.append(String.valueOf(c).toUpperCase());
                } else {
                    sb.append(String.valueOf(c).toLowerCase());
                }
            }

            return sb.toString();
        } catch (Exception e) {
            return e.toString();
        }
    }

    public void createCSV() {
        try (PrintWriter writer = new PrintWriter("string.csv")) {

            StringBuilder sb = new StringBuilder();
            for (int index = 0; index < this.string.length(); index++) {
                char c = this.string.charAt(index);
                sb.append(String.valueOf(c));

                if (index < this.string.length() - 1)
                    sb.append(",");
            }

            writer.write(sb.toString());

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("CSV created!");
        }
    }
}
