import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserInterfaceTest {

    @Test
    public void testCheckEmailIDEndsWithDigitec() {
        // Valid email ending with "digitec.com"
        String validEmail = "example@digitec.com";
        String emailPattern = "[a-z]{5,10}[@][a-z]{7}[.][a-z]{3}";
        boolean isValid = Pattern.matches(emailPattern, validEmail) &&
                validEmail.substring(validEmail.length() - 11).equalsIgnoreCase("digitec.com");
        assertTrue(isValid, "Email should be valid and end with 'digitec.com'");

        // Invalid email not ending with "digitec.com"
        String invalidEmail = "example@otherdomain.com";
        boolean isInvalid = Pattern.matches(emailPattern, invalidEmail) &&
                invalidEmail.substring(invalidEmail.length() - 11).equalsIgnoreCase("digitec.com");
        assertFalse(isInvalid, "Email should be invalid and not end with 'digitec.com'");
    }
}