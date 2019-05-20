package cipher;

import java.util.Arrays;

public class Ceaser2 {
	
	public static void main(String[] cipher) {
		
		byte x = 'a';
		byte y = 'z';
		String text = null;
		String text2 = null;
	//	qpqyvjtuwh
	//	rpvntnvxpw
		try {
		 text = cipher[0];
		 text2 = cipher[1];
		}
		catch (Exception e) {
			System.out.println("error recover no params entered");
			text = "qpqyvjtuwh";
			 text2= "rpvntnvxpw";
		}
			 
		
		
		Ceaser2.decrypt(text,text2);
		
for(int i = x; i <= y; i++ ) {
			
			byte chara = (byte) i;
			char charac = (char) chara;
			System.out.println(charac);
			
			
		}
		
		}
		
		
		
		
		
		
	
	
	public static void decrypt(String... cipher) {
		
		String text = cipher[0];
		String text2 = cipher[1];
		
		byte x = 'a';
		
		
		byte[] firstArray = text.getBytes();
		byte[] secArray = text2.getBytes();
		
		int size = (firstArray.length > secArray.length)? firstArray.length : secArray.length;
		
		char[] deciphertxt =  new char[size];
		
		for(int i =0; i < firstArray.length && i < secArray.length; i++) {
			
		byte one = firstArray[i];
		byte two = secArray[i];
		byte delta = (byte) ((one - x)+(two - x));
		byte convert = (byte)  ((delta)% 26);
		convert += x; 
		deciphertxt[i]= (char) convert;
		System.out.println(convert);
		}
		
		
		
		System.out.println(Arrays.toString(deciphertxt));
		System.out.println(13%5);
		System.out.println((char)(23+'a'));
		
		System.out.println((2F/10F));
		System.out.println((2%5));
	}

}
