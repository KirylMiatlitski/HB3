package by.epam.course.basic.main.task4;


/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * @Task: ƒана последовательность натуральных чисел а1 , а2 ,..., ап. —оздать массив из
четных чисел этой последовательности. ≈сли таких чисел нет, то вывести
сообщение об этом факте.
 */
public class Task4 {

	public static void main(String[] args) {
		int n 	=	6; //  оличество чисел в последовательности
		int count =	0;	//  оличество четных чисел
		int j = 	0; // указатель
		// case 1
		int[] mas = { 1, 4, 7, 8, 12, 20}; // последовательность длинны n
		
		// case 2
		//int[] mas = { 1, 3, 7, 9, 13, 21}; // последовательность длинны n
		// ¬ывод последовательности на экран
		System.out.print("«адана последовательность а: ");
		for (int i=0; i < mas.length; i++){
			System.out.print(mas[i] + " ");
			if (mas[i] % 2 == 0){
				count++;
			}
		}
		System.out.println();
		// создание нового массива
		int[] newMas = new int[count];
		for (int i=0; i < n; i++){
			if (mas[i] % 2 == 0){
				newMas[j] = mas[i];
				j++;
			}
		}
		// вывод нового массива
		if (j == 0) {
			System.out.println("¬ указанной последовательности нет чЄтных чисел");
		} else {
			System.out.println("ћассив целых чисел b: ");
			for (int i=0; i< newMas.length; i++){
				System.out.print(newMas[i]+ " ");
			}
		}
	}

}
