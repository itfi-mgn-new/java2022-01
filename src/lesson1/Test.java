package lesson1;

import	java.lang.System;

/*import java.lang.* */
/*import lesson1.* */

public class Test /*extends java.lang.Object*/ {
	
	public static int	x = 10;
	private	double 		y = 100;
	

	public static void main(String[] args) {
		/*java.lang.*/System.err.println("Hello world!");
		
		byte	b1 = 10, b2 = 20, b3 = (byte)(b1 + b2);
		
		System.err.println("b1+b2="+(b1+b2));
		System.err.println("b1-b2="+(b1-b2));
		System.err.println("b1*b2="+(b1*b2));
		System.err.println("b1/b2="+(b1/b2));
		System.err.println("b1%b2="+(b1%b2));
		
		System.err.println("b1|b2="+(b1|b2));
		System.err.println("b1&b2="+(b1&b2));
		System.err.println("b1^b2="+(b1^b2));
		System.err.println("~b1="+(~b1));
		
		System.err.println("b1<<1="+(b1<<1));
		System.err.println("b1>>1="+((-b1)>>1));
		System.err.println("b1>>>1="+((-b1)>>>1));
	
		System.err.println("b1>b2="+(b1>b2));
		System.err.println("b1>=b2="+(b1>=b2));
		System.err.println("b1<b2="+(b1<b2));
		System.err.println("b1>=b2="+(b1<=b2));
		System.err.println("b1==b2="+(b1==b2));
		System.err.println("b1!=b2="+(b1!=b2));

		float	f1 = 10, f2 = 20, f3 = f1 + f2;
		
		System.err.println("---------------------------");
		
		System.err.println("f1+f2="+(f1+f2));
		System.err.println("f1-f2="+(f1-f2));
		System.err.println("f1*f2="+(f1*f2));
		System.err.println("f1/f2="+(f1/f2));
		System.err.println("f1%f2="+(f1%f2));
		
		System.err.println("f1>f2="+(f1>f2));
		System.err.println("f1>=f2="+(f1>=f2));
		System.err.println("f1<f2="+(f1<f2));
		System.err.println("f1>=f2="+(f1<=f2));
		System.err.println("f1==f2="+(f1==f2));
		System.err.println("f1!=f2="+(f1!=f2));
		
		int		c1 = 10, c2 = 0b0010, c3 = 0xFED0, c4 = 077, c5 = ' ';
		long	l1 = 1234567801234567L;
		float	ff = 12.3f;
		char	a1 = 10, a2 = '\013', a3 ='\r', a4 = '\u23FE';
		
		boolean	z1 = true, z2 = false;
		
		System.err.println("=================");
		
		System.err.println("z1 && z2"+(z1 && z2));
		System.err.println("z1 || z2"+(z1 || z2));
		System.err.println("!z1"+(!z1));

		System.err.println("z1 & z2"+(z1 & z2));
		System.err.println("z1 | z2"+(z1 | z2));
		
		
		b2 = (byte)((b1 = 125) + 2);
		
		b3 += 10;
		
		if (b1 == 10) {
			if (b2 == 4) {
				
			}
			else {
				
			}
		}		
		
		while (b1 > 0) {
			
		}

		do {
			x = 0;
		} while (b1 > 0);
	
		for (int index = 0; index < 10; index++) {
			x = 0;
		}
		
		/*int index = 0
		 * while (index < 10) {
		 * 		x = 0;
		 * 		index++;
		 *  }
		 */
		
		while (x < 0) {
			if (x % 2 == 0) {
				break;
			}
			if (x % 3 == 0) {
				continue;
			}
			x = 0;
		}
		
label:	while (x > 0) {
			while (b3 > 0) {
				break label;
			}
		}
		x = 100;
		
		switch (b1) {
			case 0 :
			case 10 :
				x = 0;
				break;
			case 24 :
				x = 40;
				break;
			default:
				x = 60;
		}
		
		return;
	}
}
