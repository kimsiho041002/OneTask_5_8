package atarashi_project;
import java.util.*;
public class OneProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println( "숫자를 입력해주세요.(양수)" );
		int num = s.nextInt();
		int count = 0;
		
	if( num <= 0 ) {
		System.out.println("양수가 아닌 수를 입력했습니다. 프로그램을 종료합니다.");
	}
	else {
		for(int i = 2; i <= num ; i++ ) {
			
			if( i%2 == 0 && i < 3) {
				count += 1;
				System.out.println( i );
			}
			if( i % 2 == 1 ) {
				if( i%3 == 0 && i > 8 ) continue;
				if( i%5 == 0 && i > 10 ) continue;
				if( i%7 == 0 && i > 10 ) continue;
				
				System.out.println( i );
				count += 1;
			}
	}
		System.out.println("소수의 개수는 " + count + "개 입니다.");
	}
	}
	}


