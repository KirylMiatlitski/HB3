package by.epam.course.basic.main.task4;


/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * @Task: ���� ������������������ ����������� ����� �1 , �2 ,..., ��. ������� ������ ��
������ ����� ���� ������������������. ���� ����� ����� ���, �� �������
��������� �� ���� �����.
 */
public class Task4 {

	public static void main(String[] args) {
		int n 	=	6; // ���������� ����� � ������������������
		int count =	0;	// ���������� ������ �����
		int j = 	0; // ���������
		// case 1
		int[] mas = { 1, 4, 7, 8, 12, 20}; // ������������������ ������ n
		
		// case 2
		//int[] mas = { 1, 3, 7, 9, 13, 21}; // ������������������ ������ n
		// ����� ������������������ �� �����
		System.out.print("������ ������������������ �: ");
		for (int i=0; i < mas.length; i++){
			System.out.print(mas[i] + " ");
			if (mas[i] % 2 == 0){
				count++;
			}
		}
		System.out.println();
		// �������� ������ �������
		int[] newMas = new int[count];
		for (int i=0; i < n; i++){
			if (mas[i] % 2 == 0){
				newMas[j] = mas[i];
				j++;
			}
		}
		// ����� ������ �������
		if (j == 0) {
			System.out.println("� ��������� ������������������ ��� ������ �����");
		} else {
			System.out.println("������ ����� ����� b: ");
			for (int i=0; i< newMas.length; i++){
				System.out.print(newMas[i]+ " ");
			}
		}
	}

}
