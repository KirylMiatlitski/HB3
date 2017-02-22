package by.epam.course.basic.main.task1;

import java.util.Random;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * Task: � ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �
 */
public class Task1 {

	public static void main(String[] args) {
		
		int n = 10; // ������ �������
		int k = 3; // ����� �
		int result = 0; // �����
		int[] massiv = new int[n]; 
		Random rand = new Random();
		
		// ���������� �������
		for (int i = 0; i < n; i++){
			massiv[i] = rand.nextInt(30);
			System.out.println("Massiv["+ (i+1) +"]= "+ massiv[i]);
		}
		
		// ����� ����� ������� �
		for (int i = 0; i < n; i++){
			if (massiv[i] % k == 0) {
				result += massiv[i];
			}
		}
			
		// ����� 
		System.out.println("����� � = " + k);
		
		System.out.println("����� ����� ������� � = " + result);
		
		
			
	}

}
