package by.epam.course.basic.main.task3;

import java.util.Scanner;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 *  @Task: ���� ������������������ �������������� ����� �1 �2 ,..., �n . ��������, ����� ��
��� ������������.
 */
public class Task3 {
	
	public static void main(String[] args) {
		
		int n 			=	6; // ����� �������
		boolean check 	=	true; // �������� �� ������������������ �������������
			
		Scanner sc 		=	new Scanner(System.in);
		
		
		
		// �������� ������������������ + ����� ������������������ �� �������
		/*double[] mas	= 	new double[n];
		System.out.print("������������������: ");
		for (int i=0; i < n; i++){
			mas[i]=sc.nextDouble();
			System.out.print(mas[i] + " ");
		}*/
		// ���
		double[] mas = {1.0, 3.0, 5.0, 7.0, 12.5, 80.5}; // ������������������ ����������
		
		for (int i=0; i < n; i++){
			if (i > 0){
				if (mas[i] < mas[i-1]) {
					check = false;
					break;
				}
			}
		}
		
		// ����� ����������
		if (check) {
			System.out.println("������������������ �������� ������������");			
		} else {
			System.out.println("������������������ �� �������� ������������");
		}
	}
}
