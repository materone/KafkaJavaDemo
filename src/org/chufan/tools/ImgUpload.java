/**
 * 
 */
package org.chufan.tools;

import java.util.Random;

/**
 * @author Tony
 *
 */
public class ImgUpload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Less than less");
		Random r = new Random();
		int x = r.nextInt(1000);
		System.out.println(x);
		System.out.println("quit");

		byte[] ib=new byte[]{(byte) 0xff,(byte) 0xfe};
		 long i = ((ib[0]&0xFF)<<8)+(ib[1]&0xFF);
		System.out.println("i:"+i);
		System.out.printf("%X\n",i);
		System.out.printf("%X - %X\n",(ib[0]&0xFF)<<8,ib[1]&0xFF);
		System.out.printf("%X\n",0x2<<8);
		
	}
	
	private int btoi(byte[] ib){
		int i = 0;
		i = ((ib[0]&0xFF)<<8)+(ib[1]&0xFF);
		return i;
	}

}
