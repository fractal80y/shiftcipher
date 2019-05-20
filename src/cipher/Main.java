package cipher;

import java.util.Arrays;

public class Main {
	
public static void main(String[] cipher) throws Exception {
		Ceaser txt = new Ceaser("JIVE");
		txt.decipher();
		String myString = txt.decipher;
		
		if(cipher.length <= 1) cipher = txt.stringArraySplit();
		txt.ciphertxt = Arrays.toString(cipher);
		txt.decipher();
		System.out.println(txt.ciphertxt + "Alert");
		String deciphertxt = txt.decipher;
		
		
		
		
	
		
		System.out.println(deciphertxt + " deciphered txt ");
		txt.encrypt(deciphertxt);
		System.out.println(txt.ciphertxt + " " + myString + " encrytpted");
//		System.out.println(13%5);
//		System.out.println((char)(23+'a'));
//		System.out.println((char)(97 +'z' - 'a'));//end up at z
		
/*for(int i=0; i <= 255; i++) {
			
			System.out.print((char)(97+(i%26)));
			
		}
	*/	
	//	char ch = 'a';
//		System.out.println((char) (97+(('a'-ch)+104%26))); //recursive wraps back a-z<<<<<<<<<<<<<
		
	//	System.out.println(Arrays.toString(encryptString("tinkerbell")));
		
/*for(int i = x; i <= y; i++ ) {
			
			byte chara = (byte) i;
			char charac = (char) chara;
			System.out.println(charac);
			
		} */
		
		
		Ceaser word = new Ceaser("MATTHEWphilip");
		word.decipher();
		System.out.println(word.decipher);
		System.out.println(word.decipher);
		word.encrypt("hollymolly");
		word.decipher();
		System.out.println(word.ciphertxt + word.decipher);
		
	}

}
