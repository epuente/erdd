package controllers;


import com.avaje.ebean.Page;
import com.fasterxml.jackson.databind.JsonNode;
import models.Ctacorreo;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import play.data.Form;
import play.mvc.Result;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.List;

import static play.data.Form.form;
import static play.mvc.Results.ok;


public class AdminCorreoController {
	

	

	

    
    

    
    





	private static final String key = "aesEncryptionKey";
	private static final String initVector = "encryptionIntVec";
	public static String encrypt(String value) {
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

			byte[] encrypted = cipher.doFinal(value.getBytes());
			return Base64.encodeBase64String(encrypted);
		} catch (Exception ex) {
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
			ex.printStackTrace();
		}

		return null;
	}



	public static Result pruebaEncrypt(){
		String originalString = "password";
		System.out.println("Original String to encrypt - " + originalString);
		String encryptedString = encrypt(originalString);
		System.out.println("Encrypted String - " + encryptedString);
		String decryptedString = decrypt(encryptedString);
		System.out.println("After decryption - " + decryptedString);
		return ok("OK");
	}
	
}

