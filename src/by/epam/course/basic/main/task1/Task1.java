package by.epam.course.basic.main.task1;

import java.util.Random;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * Task: В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
 */
public class Task1 {

	public static void main(String[] args) {
		
		int n = 10; // размер массива
		int k = 3; // Число к
		int result = 0; // сумма
		int[] massiv = new int[n]; 
		Random rand = new Random();
		
		// наполнение массива
		for (int i = 0; i < n; i++){
			massiv[i] = rand.nextInt(30);
			System.out.println("Massiv["+ (i+1) +"]= "+ massiv[i]);
		}
		
		// поиск чисел кратных К
		for (int i = 0; i < n; i++){
			if (massiv[i] % k == 0) {
				result += massiv[i];
			}
		}
			
		// Вывод 
		System.out.println("Число К = " + k);
		
		System.out.println("Сумма чисел кратных К = " + result);
		
		
			
	}

}
