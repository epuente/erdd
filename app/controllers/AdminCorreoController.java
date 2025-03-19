package controllers;

import classes.Encriptacion;
import classes.Encriptacion2;
import org.apache.commons.codec.binary.Base64;
import play.mvc.Result;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import static play.mvc.Results.ok;

public class AdminCorreoController {
	//private static final String key = "aesEncryptionKey";
	//private static final String initVector = "encryptionIntVec";

    private static final String key = "estaEsLaClave151";
    private static final String initVector = "encriptacionInit";

	public static String encrypt(String value) {
		try {
            System.out.println("longitud key: "+key.length());
            System.out.println("longitud initVector: "+initVector.length());
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

			byte[] encrypted = cipher.doFinal(value.getBytes());
			return Base64.encodeBase64String(encrypted);
		} catch (Exception ex) {
            System.out.println("Ocurrió un error en AdminCorreoController.encrypt. "+ex.getCause());
			ex.printStackTrace();
		}
		return null;
	}



	public static String decrypt(String encrypted) {
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));

			return new String(original);
		} catch (Exception ex) {
            System.out.println("Ocurrió un error en AdminCorreoController dencrypt. "+ex.getCause());
			ex.printStackTrace();
		}

		return null;
	}



    public static Result pruebaEncrypt2(){
        Encriptacion2 e2 = new Encriptacion2("Doce");

        System.out.println("Original String to encrypt - " + e2.cadena);
        String encryptedString = e2.encrypt();
        System.out.println("Encrypted String - " + encryptedString);

        String decryptedString = e2.decrypt();
        System.out.println("After decryption - " + decryptedString);





        return ok("ok2");
    }
	
}

