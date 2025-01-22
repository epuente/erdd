package classes;

import org.mindrot.jbcrypt.BCrypt;

// Esta clase se usa para aplicar hash a password y poder guardarlos en la DB
public class Encriptacion {

    public static String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }

}


