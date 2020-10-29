import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONENUMMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONENUMMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}
