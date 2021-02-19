package Pract7;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task4
{
    public static double f(double x) {
        return Math.pow(x,3) - 4*Math.pow(x,2) + x + 6;
    }
    public static double f1(double x) {
        return 3*Math.pow(x,2) - 8*x + 1;
    }
    
    public static double x_newton(double a, double e) {
        double x = a;
        double razn;
        
        do {
            double xn = x - f(x)/f1(x);
            razn = Math.abs(xn - x);
            x = xn;
        } while (razn > e);
        
        return x - f(x)/f1(x);
    }

	public static double x_div2(double a, double b, double e) {
		while (b - a > e) {
			double c = (a + b) / 2;
			if (f(a) * f(c) < 0) {
				b = c;
			} else {
				if (f(a) * f(c) > 0) {
					a = c;
				} else {
					return c;
				}
			}
		}
		return (a + b) / 2;
	}
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите начальные значения интервала и погрешность:");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double e = in.nextDouble();
		
		System.out.print("Введите количество корней: ");
		int kol = in.nextInt()+1;
		double xArray[] = new double[kol-1];
		int find;
		double x, y1, y2;
		double h = (b - a) / kol;
		
		do {
		    find = 0;
		    x = a;
		    
		    while (x < b) {
    		    y1 = f(x);
    		    y2 = f(x + h);
    		    
    		    if (y1 * y2 <= 0) {
    		        //x = x_newton(x,e);
					x = x_div2(x, x + h, e);
    		        xArray[find] = x;
    		        find++;
    		    }
    		    x += h;
    		}
    		h /= 2;
	    } while ((kol > find) && (2*h > e));
	    
	    System.out.println("Корни уравнения:");
	    for (int i = 0; i < xArray.length; i++) {
	        System.out.println(new BigDecimal(xArray[i]).setScale(3, BigDecimal.ROUND_UP));
	    }
	}
}
