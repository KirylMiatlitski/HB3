package by.epam.course.basic.main.task2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Kiryl_Miatlitski
 *
 * @date 19 February 2017
 * 
 * Task: � ������������� ������������������ ���� ������� ��������. ������� ������ �� ������� ���� ���������.
 */
public class Task2 {
	
	public static void main(String[] args) {
		
		int n = 	10; 	// ������ ������������� ������������������
		int count = 0;  	// ����������� �������� ��������� � ������������������
		int j = 	0; 		// �������������� ���������
		int[] mas = new int[n]; // �������� ������������������
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// ������ ������������ ������������������
		System.out.println("������� ������������������ ������� " + n);
		for (int i=0; i < n; i++){
			//mas[i]=sc.nextInt();
			mas[i]=rand.nextInt(50);
			if (mas[i] == 0){
				count++;
			}
		}
		
		// ������������ ������ �������
		int[] new_mas = new int[count];
		for (int i = 0; i < n; i++){
			if (mas[i]==0){
				new_mas[j]=i+1;
				j++;
			}
		}
		
		// ����� �������
		System.out.println("����� ������ �:");
		for (int i = 0; i < count; i++){
			System.out.println("a[" + (i+1) + "]= " + new_mas[i]);
		}
		
		
	}
}
