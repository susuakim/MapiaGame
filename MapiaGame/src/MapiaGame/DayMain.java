package miniproject;

import java.util.Scanner;

public class DayMain {
//	Day day = new Day();

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//마피아 지목 때 일반 시민골라서 틀리면 지목 당한 사람이 죽음
		//그 다음날 되면 지목당한 사람이 죽었다는 정보가 출력 되게끔 만들었음

		Day2 day = new Day2();
		System.out.print("지목하세요>>");

		day.select(sc.next());

	}
}
