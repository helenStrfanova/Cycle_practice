/**
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Alyona Sviridova NTU KhPI
 */
package Palindrome;

public class Main {

    public static void main(String[] args) {

        /*
        * Tested palindromes:
        * 1. А в Енисее – синева
        * 2. А за работу дадут?
        * 3. А к долу лодка
        * 4. А кобыле цена дана, да не целы бока
        * 5. А Луна канула
        * 6. А муза – раба разума
        * 7. А ты сама сыта?
        * 8. «Ба-бах!» - у уха баб
        * 9. Ах, Ира – во повариха!
        * 10. Двор – доход РОВД
        * 11. «Ирода в ад?»., -: ори!
        * **/
        String palindrome = "«Ирода в ад?»., -: ори!";

        String palindromeClean = palindrome
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("!", "")
                .replaceAll("\\?", "")
                .replaceAll("-", "")
                .replaceAll("-", "")
                .replaceAll("»", "")
                .replaceAll("«", "")
                .replaceAll(":", "")
                .replaceAll(" ", "")
                .toLowerCase();

        int intersections = 0;

        for (int i = 0; i < palindromeClean.length(); i++) {

            if(palindromeClean.charAt(palindromeClean.length() - i - 1)
                    == palindromeClean.charAt(i)){
                intersections++;
            }
        }
        if (intersections == palindromeClean.length())
            System.out.println("This is palindrome!");
        else {
            System.out.println("This is not palindrome.");
        }
    }
}
