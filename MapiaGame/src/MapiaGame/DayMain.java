package miniproject;

import java.util.Scanner;

public class DayMain {
//	Day day = new Day();

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//���Ǿ� ���� �� �Ϲ� �ùΰ�� Ʋ���� ���� ���� ����� ����
		//�� ������ �Ǹ� ������� ����� �׾��ٴ� ������ ��� �ǰԲ� �������

		Day2 day = new Day2();
		System.out.print("�����ϼ���>>");

		day.select(sc.next());

	}
}
