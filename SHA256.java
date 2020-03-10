package com.intrugence.blockchain;
import java.math.BigInteger; 
import java.nio.charset.StandardCharsets; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException; 

// Java program to calculate SHA hash value 

class SHA256 { 
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException 
	{ 
		// Call MessageDigest class and invoke getInstance method.
		MessageDigest md = MessageDigest.getInstance("SHA-256"); 

		// digest() method called and the return type is Bytes
		return md.digest(input.getBytes(StandardCharsets.UTF_8)); 
	} 
	
	public static String toHexString(byte[] hash) 
	{ 
		BigInteger number = new BigInteger(1, hash); 
		// Convert message digest into hex value 
		StringBuilder hexString = new StringBuilder(number.toString(16)); 

		return hexString.toString(); 
	} 

	
	public static void main(String args[]) 
	{ 
		try
		{ 
			System.out.println("HashCode is"); 

			String s1 = "Intrugence"; 
			System.out.println("\n" + s1 + " : " + toHexString(getSHA(s1))); 

		} 
		catch (NoSuchAlgorithmException e) { 
			System.out.println("Exception thrown" + e); 
		} 
	} 
} 
