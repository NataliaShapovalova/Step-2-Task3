package natasha.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String substr = reader.readLine();
        String str = reader.readLine();

        boolean isIt = fuzzySearch(substr, str);
        System.out.println(isIt);

    }

    public static boolean fuzzySearch(String substr, String str) {

        if (substr.isEmpty() || str.isEmpty()) {
            System.out.println("Неверный ввод");
            System.exit(1);
        }

        char[] substrArray = substr.toCharArray();
        char[] strArray = str.toCharArray();


        int equals = 0;
        int index = 0;

        for (char c : strArray) {
            if (c == substrArray[index]) {
                equals++;
                index++;
                if (index == substrArray.length) {
                    break;
                }
            }
        }
        return equals == substrArray.length;
    }
}
