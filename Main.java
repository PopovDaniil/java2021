import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

class Auto {
    String model;
    String nomer;
    int year;
    float probeg;
    float price;
    
    Auto(String m, String n, int y, float pb, float pc) {
        model = m;
        nomer = n;
        year = y;
        probeg = pb;
        price = pc;
    }
    // Преобразование в строку
    public String toString() {
        return "Модель: " + model + "\n" +
               "Номер: " + nomer + "\n" +
               "Год выпуска: " + year + "\n" +
               "Пробег: " + probeg + "\n" +
               "Цена: " + price + "\n";
    }
    
    Auto() {}
}

class AutoArray {
    Auto[] autos;
    
    AutoArray(Auto[] a) {
        autos = a;
    }
    // Преобразование в строку
    public String toString() {
        String out = "";
        for (Auto auto : autos) {
            out += auto;
            out += "==============\n";
        }
        return out;
    }
    // Возвращает автомобиль с минимальной ценой
    Auto getLowestPrice() {
        float minPrice = autos[0].price;
        Auto minAuto = new Auto();
        for (Auto auto : autos) {
            if (auto.price < minPrice) {
                minPrice = auto.price;
                minAuto = auto;
            }
        }
        return minAuto;
    }
    
    void sortByYear() {
        Arrays.sort(autos, new Comparator<Auto>() {
            public int compare(Auto o1, Auto o2) {
                return o2.year - o1.year;
            }
        });
    }
    
    Auto edit(String oldNom, String newNom) {
        Auto a = new Auto();
        for (Auto auto : autos) {
            if (auto.nomer.equals(oldNom)) {
                a = auto;
            }
        }
        a.nomer = newNom;
        return a;
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
		Auto[] autos = new Auto[] { 
		    new Auto("Лада Приора", "А666МР123",2012,150000,250000), 
		    new Auto("Лада Гранта", "Б001МВ161",2015,100000,200000),
		    new Auto("Audi", "У111УУ161",1997,200000,210000),
		    new Auto("Mercedes", "О777ОП777",2019,10000,4000000),
		    new Auto("Hammer", "Б001МВ161",2013,100000,2500000)
		   };
		
		AutoArray autoArr = new AutoArray(autos);
		System.out.println(autoArr);
		
		System.out.println("===Автомобиль с минимальной ценой===");
		System.out.println(autoArr.getLowestPrice());
		
		autoArr.sortByYear();
		System.out.println("\n===Массив, отсортированный по убыванию года выпуска===");
		System.out.println(autoArr);
		
		System.out.print("Введите текущий номер: ");
		String oldNom = in.next();
		System.out.print("Введите новый номер: ");
		String newNom = in.next();
		
        System.out.println(autoArr.edit(oldNom,newNom));
        
        in.close();
	}
}
