import java.util.regex.Pattern;

public class MobileNumberValidator {
    private String validationCode;
    private String formattedNumber;

    public MobileNumberValidator(String number) {

        if (number == null || number.isEmpty()) {
            validationCode = "0004";
            formattedNumber = number;
            return;
        }

        String numericNumber = number.replaceAll("[^\\d]", "");


        if (numericNumber.length() > 15 || numericNumber.length() < 8 || numericNumber.startsWith("0")) {
            validationCode = "0005";
            formattedNumber = number;
            return;
        }

        if (numericNumber.length() == 8 && !Pattern.matches("[4-9]\\d{7}", numericNumber)) {
            validationCode = "0005";
            formattedNumber = number;
            return;
        }

        if (numericNumber.length() == 11 && Pattern.matches("852[0123]\\d{7}", numericNumber)) {
            validationCode = "0005";
            formattedNumber = number;
            return;
        }

        if (numericNumber.length() != 11 && numericNumber.length() != 8 && !numericNumber.startsWith("852")) {
            validationCode = "0005";
            formattedNumber = number;
            return;
        }

        if (numericNumber.length() == 8) {
            formattedNumber = "852" + numericNumber;
        } else {
            formattedNumber = numericNumber;
        }

        validationCode = "0000";
    }

    public String getValidationCode() {
        return validationCode;
    }

    public String getFormattedNumber() {
        return formattedNumber;
    }
}
