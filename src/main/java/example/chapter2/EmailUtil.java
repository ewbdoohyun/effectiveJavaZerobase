package example.chapter2;

import java.util.regex.Pattern;

public class EmailUtil {

    private static final Pattern EMAIL = Pattern.compile(
            "[a-zA-Z0-9.-]\\\\.[a-zA-Z]{2,6}$");

    static boolean isEmailVaild(String s){
        return EMAIL.matcher(s).matches();
    }

    @Override
    public void finalize(){

    }
}


