package utils;
import java.security.SecureRandom;
import java.util.Random;
public class RandomDataForReg {
    public static void main(String[] args) {
        String randomEmail = generateRandomEmail();
        String randomPassword = generateRandomPassword();

        System.out.println("Random Email: " + randomEmail);
        System.out.println("Random Password: " + randomPassword);
    }
    public static String generateRandomEmail() {
        String[] emailProviders = {"gmail.com", "yahoo.com", "outlook.com", "example.com"};
        Random random = new Random();
        int providerIndex = random.nextInt(emailProviders.length);
        return "user" + random.nextInt(1000) + "@" + emailProviders[providerIndex];
    }
        public static String generateRandomPassword() {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "$";
        String allChars = upperCaseLetters + lowerCaseLetters + digits + specialChars;
        SecureRandom random = new SecureRandom();
        // Генерация минимум 8 и максимум 15 символов
        int passwordLength = random.nextInt(8) + 8;
        // Генерация минимум одной буквы верхнего регистра
        char randomUpperCase = upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length()));
        // Генерация минимум одной буквы нижнего регистра
        char randomLowerCase = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        // Генерация минимум одной цифры
        char randomDigit = digits.charAt(random.nextInt(digits.length()));
        // Генерация одного специального символа
        char randomSpecialChar = specialChars.charAt(random.nextInt(specialChars.length()));
        // Генерация оставшихся символов
        StringBuilder password = new StringBuilder();
        password.append(randomUpperCase).append(randomLowerCase).append(randomDigit).append(randomSpecialChar);
        for (int i = 4; i < passwordLength; i++) {
            char randomChar = allChars.charAt(random.nextInt(allChars.length()));
            password.append(randomChar);
        }
        // Перемешивание символов в пароле
        char[] passwordArray = password.toString().toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            int randomIndex = random.nextInt(passwordArray.length);
            char temp = passwordArray[i];
//            passwordArray[i] = passwordArray[randomIndex];
//            passwordArray[randomIndex] = temp;
        }
        return new String(passwordArray);
    }
}