// Solution to AP CSA FRQ #2 2025
public class SignedText {
    private String firstName;
    private String lastName;

    public SignedText(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getSignature() {
        if (firstName.equals("")) {
            return lastName;
        }
        else {
            return firstName.substring(0, 1) + "-" + lastName;
        }
    }

    public String addSignature(String text) {
        if (text.length() >= getSignature().length() && text.substring(text.length() - getSignature().length()).equals(getSignature())) { // check boundary cases
            return text;
        }
        else if (text.length() >= getSignature().length() && text.substring(0, getSignature().length()).equals(getSignature())) {
            return text.substring(getSignature().length()) + getSignature();
        }
        else {
            return text + getSignature();
        }
    }
}