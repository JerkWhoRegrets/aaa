// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String mobile = "45651234";
        MobileNumberValidator validator = new MobileNumberValidator(null);
        System.out.println(validator.getValidationCode() + "----" + validator.getFormattedNumber());

        validator = new MobileNumberValidator("+11234 456");
        System.out.println(validator.getValidationCode() + "----" + validator.getFormattedNumber());

        validator = new MobileNumberValidator("123456789123456");
        System.out.println(validator.getValidationCode() + "----" + validator.getFormattedNumber());

        validator = new MobileNumberValidator("1234567");
        System.out.println(validator.getValidationCode() + "----" + validator.getFormattedNumber());

        validator = new MobileNumberValidator("12345678");
        System.out.println(validator.getValidationCode() + "----" + validator.getFormattedNumber());

        validator = new MobileNumberValidator("85201234567");
        System.out.println(validator.getValidationCode() + "----" + validator.getFormattedNumber());

        validator = new MobileNumberValidator("85245678888");
        System.out.println(validator.getValidationCode() + "----" + validator.getFormattedNumber());

        validator = new MobileNumberValidator("85388888");
        System.out.println(validator.getValidationCode() + "----" + validator.getFormattedNumber());
    }
}