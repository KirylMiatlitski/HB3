package by.epam.course.basic.main.task3;

import java.util.Scanner;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 *  @Task: ƒана последовательность действительных чисел а1 а2 ,..., аn . ¬ы€снить, будет ли
она возрастающей.
 */
public class Task3 {
	
	public static void main(String[] args) {
		
		int n 			=	6; // длина массива
		boolean check 	=	true; // €вл€тес€ ли последовательность возврастающей
			
		Scanner sc 		=	new Scanner(System.in);
		
		
		
		// создание последовательности + вывод последовательности на косноль
		/*double[] mas	= 	new double[n];
		System.out.print("ѕоследовательность: ");
		for (int i=0; i < n; i++){
			mas[i]=sc.nextDouble();
			System.out.print(mas[i] + " ");
		}*/
		// или
		double[] mas = {1.0, 3.0, 5.0, 7.0, 12.5, 80.5}; // последовательность хардкорна€
		
		for (int i=0; i < n; i++){
			if (i > 0){
				if (mas[i] < mas[i-1]) {
					check = false;
					break;
				}
			}
		}
		
		// ¬ывод результата
		if (check) {
			System.out.println("ѕоследовательность €вл€етс€ возрастающей");			
		} else {
			System.out.println("ѕоследовательность не €вл€етс€ возрастающей");
		}
	}
}
