package by.epam.course.basic.main.task5;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * Task: ������������ ���������� ������� ������� n �� ��������� ������� (n - ������):
 */
public class Task5 {

	public static void main (String[] args){
		
		int n = 		6; // ������ �������, n - ������ �
		
		int[][] a = new int[n][n]; // �������
		// ��������� �������
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if (i % 2 == 0){
					a[i][j] = j+1;
				} else {
					a[i][j] = n-j;
				}
			}
		}
		
		// ����� �������
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
