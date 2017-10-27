package lesson3.Amex;

public class AmexCardChecker {
    boolean isAmex (String number){
        int length = number.length();
        boolean isValidLength = length == 15;
        boolean hasValidPrefix = number.startsWith("34") || number.startsWith("37");
        if (isValidLength && hasValidPrefix){
            return true;
        }
        return false;

    }

}
