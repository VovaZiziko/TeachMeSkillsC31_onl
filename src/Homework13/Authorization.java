package Homework13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authorization {
    public static final String P_REGEX = "^(?=.*[0-9])\\S{1,19}$";
    public static final String L_REGEX = "^\\S{1,19}$";

    public static void authorize(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        boolean flag = true;
        Pattern pPas = Pattern.compile(P_REGEX);
        Pattern pLog = Pattern.compile(L_REGEX);
        Matcher mLog = pLog.matcher(login);
        if(!mLog.matches()) {
            flag = false;
            System.out.println(flag);
            throw new WrongLoginException("Логин не соответствует требованиям");}
        Matcher mPas = pPas.matcher(password);
        if(!mPas.matches() || !password.equals(confirmPassword) ) {
            flag = false;
            System.out.println(flag);
            throw new WrongPasswordException("Пароль не соответствует требованиям или не совпадает " +
                    "с подтверждением пароля");}
        System.out.println(flag);


    }
}