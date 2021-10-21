package Javaproject;

import java.util.Scanner;

public class testMain {
	public static void main(String[] args) {
		DAMADAO dama = new DAMADAO();
		Scanner sc = new Scanner(System.in);
		int coin = 0;
		int menu = 0;
		while (true) {
			if (menu == 0) {
				System.out.print("1. 로그인 2. 회원가입 3. 환경설정 4. 종료 >> ");
				menu = sc.nextInt();
			} else if (menu == 1) {
				System.out.print("아이디를 입력하세요 >> ");
				String ID = sc.next();
				System.out.print("비밀번호 입력하세요 >> ");
				String PW = sc.next();
				coin = dama.login(ID, PW);
				menu = 0;
				if (coin == 5) {
					break;
				}
			} else if (menu == 2) {
				System.out.print("회원가입 아이디를 입력하세요 >> ");
				String ID = sc.next();
				System.out.print("회원가입 비밀번호 입력하세요 >> ");
				String PW = sc.next();
				coin = dama.join(ID, PW);
				menu = 0;
				if (coin == 5) {
					break;
				}
			} else if (menu == 3) {
				System.out.println("현재 데모 버전으로 환경설정 기능이 구현되지 않았습니다.");
				menu = 0;
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다. 다마고치이이이이이이이잇!!!!!!");
				break;
			} else if (menu == 5) {
				// 테이블 생성 메소드
				dama.table1();
				dama.table2();
				menu = 0;
			} else if (menu == 6) {
				// 아이디 비번 확인하는 메소드
				dama.select();
				menu = 0;
			} else {
				menu = 0;
			}
		}
		while (coin == 5) {
		}
	}
}
