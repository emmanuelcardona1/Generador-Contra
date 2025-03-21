/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evidenciadesempeño1;

import java.security.SecureRandom;
/**
 *
 * @author emman
 */
public class Modelo {
    public  static class Generador {
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()_+";

    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword(int length, boolean useLetters, boolean useNumbers, boolean useSymbols) {
        if (length < 8 || length > 12 || (!useLetters && !useNumbers && !useSymbols)) {
            return "Error: Debes seleccionar al menos un tipo de carácter.";
        }

        StringBuilder characterSet = new StringBuilder();
        if (useLetters) characterSet.append(LETTERS);
        if (useNumbers) characterSet.append(NUMBERS);
        if (useSymbols) characterSet.append(SYMBOLS);

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }
        return password.toString();
    }
}
}
