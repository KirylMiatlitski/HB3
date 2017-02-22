package by.epam.course.basic.main.task2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * Task: В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */
public class Task2 {
	
	public static void main(String[] args) {
		
		int n = 	10; 	// размер целочисленной последовательности
		int count = 0;  	// колличество нуллевых элементов в последовательности
		int j = 	0; 		// дополнительный указатель
		int[] mas = new int[n]; // исходная последовательность
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// Вводим целочисленую последовательность
		System.out.println("Введите последовательность длинной " + n);
		for (int i=0; i < n; i++){
			//mas[i]=sc.nextInt();
			mas[i]=rand.nextInt(50);
			if (mas[i] == 0){
				count++;
			}
		}
		
		// формирование нового массива
		int[] new_mas = new int[count];
		for (int i = 0; i < n; i++){
			if (mas[i]==0){
				new_mas[j]=i+1;
				j++;
			}
		}
		
		// вывод массива
		System.out.println("Новый массив а:");
		for (int i = 0; i < count; i++){
			System.out.println("a[" + (i+1) + "]= " + new_mas[i]);
		}
		
		
	}
}
