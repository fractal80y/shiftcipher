package cipher;

import java.util.Arrays;

public class Ceaser {
	
	
	String ciphertxt, decipher;
	
	static random num = () -> {
		
		return (int)((double)Math.random()*25);
		
	};
	
	 interface random {
		
		int gen();
		
	}
	 
	 public void encrypt(String input) throws Exception {
		 
		 this.ciphertxt =  Arrays.toString(Ceaser.encryptString(input));
		 
	 }
	
	public Ceaser(String input ) throws Exception {
		input = input.toLowerCase();
		this.encrypt(input);
		System.out.println(this.ciphertxt);
		
		String[] values = this.stringArraySplit();
		System.out.println(this.ciphertxt + " "+ Ceaser.decrypt(values));
	}
	
	public String formatStringArray() {
		
		 return this.ciphertxt.substring(1, this.ciphertxt.length() - 1);
		
	}
	
	public String[] stringArraySplit() {
		
		String format = this.formatStringArray();
		return  format.split(", ");
	}
	
	public String toDecipherTxt() {
		
		
		return Ceaser.decrypt(this.stringArraySplit());
	}
	
	public void decipher() {
		
		this.decipher = this.toDecipherTxt();
	}

	private static String decrypt(String[] cipher) {
		
		String text = cipher[0];
		String text2 = cipher[1];
		
		
		
		byte x = 'a';
		byte y = 'z';
		
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
		//System.out.println(convert);
		}
		
		return new String(deciphertxt) ;
		
		
		
	}
	
	private static	String[] encryptString(String answer) throws Exception {
		
		
		char[] string1 = new char[answer.length()];
		char[] string2 = new char[answer.length()];
		
		for (int i = 0; i < answer.length(); i++) {
			
			char[] chars = locate(answer.charAt(i));
			
			string1[i]= chars[0];
			string2[i]= chars[1];
			
			
		}
		
		String[] keys = {new String(string1),new String(string2)};
		
		return keys;
	}
	
	
	
	
	
	private static char[] locate(char x) throws Exception {
		
		
		if((byte)x <97 ||(byte)x > 122) throw new Exception();
			
			char[] keychar = new char[2];
			char randomChar = (char) (97+(double)num.gen());
			byte offset = (byte)(randomChar - 'a');
			byte delta = (byte)( x-97-offset);
			
			
			keychar[0] = randomChar;
			if(delta < 0) keychar[1] = (char)(123+delta);
			else
			keychar[1] = (char) (97+delta);
			
				
				
				
						
				 return keychar;		
	}
	
	
	
}
