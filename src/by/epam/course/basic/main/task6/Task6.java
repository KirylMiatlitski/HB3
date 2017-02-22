package by.epam.course.basic.main.task6;

/**
 * @author Kiryl_Miatlitski
 * 
 * @date 19 February 2017
 * 
 * @Task Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *
 */
public class Task6 {

	public static void main(String[] args) {
		
		int n = 		14; // размер матрицы
		int[][] a = new int[n][n];
		
		// генерация матрицы
		for (int i=0; i < n; i++){
			for (int j=0; j < n; j++){
				if ((i == 0) | (j == 0) | (i == n-1) | (j == n-1)){
					a[i][j] = 1;
				} else {
					a[i][j] =0;
				}
			}
		}
		
		// вывод матрицы
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				System.out.print(a[i][j]);
			}
			System.out.println();;
		}
	}
}
