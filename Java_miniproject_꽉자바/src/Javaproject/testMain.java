package Javaproject;

import java.util.Scanner;

public class testMain {
	public static void main(String[] args) {
		Enemy en = new Enemy();
		DAMADAO dama = new DAMADAO();
		Face fc = new Face();
	
		Scanner sc = new Scanner(System.in);
		Battle bt = new Battle();
		int coin = 0;				// 게임 시작 여부 확인 변수
		int title_menu = 0;			// 메인페이지 메뉴 변수
		int game_menu = 0;			// 기능페이지 메뉴 변수 (1.모험 2.훈련 3.음식 4.취침 5.종료)
		int select_menu = 0;		// 선택 메뉴 변수
		
		String main_id = null;
		while (true) {
			if (title_menu == 0) {
				System.out.print("1. 로그인 2. 회원가입 3. 랭킹확인 4. 종료 >> ");
				title_menu = sc.nextInt();
			} else if (title_menu == 1) {
				System.out.print("아이디를 입력하세요 >> ");
				String ID = sc.next();
				System.out.print("비밀번호 입력하세요 >> ");
				String PW = sc.next();
				coin = dama.login(ID, PW);
				title_menu = 0;
				if (coin == 5) {
					main_id = ID;
					break;
				}else {
					System.out.println("아이디와 비밀번호를 확인해주세요.");
				}
			} else if (title_menu == 2) {
				System.out.print("회원가입 아이디를 입력하세요 >> ");
				String ID = sc.next();
				System.out.print("회원가입 비밀번호 입력하세요 >> ");
				String PW = sc.next();
				System.out.print("설정하실 닉네임을 입력하세요 >> ");
				String NICK = sc.next();
				coin = dama.join(ID, PW);
				dama.joinStators(ID, NICK);
				title_menu = 0;
				if (coin == 5) {
					main_id = ID;
					break;
				}else {
					System.out.println("회원가입 실패.. 다시 시도해주세요");
				}
			} else if (title_menu == 3) {
				dama.ranksys();
				title_menu = 0;
			} else if (title_menu == 4) {
				System.out.println("프로그램을 종료합니다. 다마고치이이이이이이이잇!!!!!!");
				break;
			} else if (title_menu == 5) {
				// 테이블 생성 메소드
				dama.table1();
				dama.table2();
				title_menu = 0;
			} else if (title_menu == 6) {
				// 아이디 비번 확인하는 메소드
				dama.select();
				title_menu = 0;
			} else {
				title_menu = 0;
			}
		}
		
		 
		while (coin == 5) {
			if (game_menu == 0) {
				fc.Face_Normal(main_id);
				System.out.println("1.모험 2.훈련 3.먹기 4.취침 5.종료 ");
				select_menu = sc.nextInt();
				if (select_menu == 1) {
					game_menu = 1;
				} else if (select_menu == 2) {
					game_menu = 2;
				} else if (select_menu == 3) {
					game_menu = 3;
				} else if (select_menu == 4) {
					game_menu = 4;
				} else if (select_menu == 5) {
					game_menu = 5;
				} else {
					game_menu = 0;
				}

			} else if (game_menu == 1) {
				System.out.println("모험을 떠난다.");
				game_menu = 0;
				
				
			} else if (game_menu == 2) {
				System.out.println("훈련을 떠난다.");
				game_menu = 0;
				
				
			} else if (game_menu == 3) {
				System.out.println("먹어보자!!");
				game_menu = 0;
					
				
				
			} else if (game_menu == 4) {
				System.out.println("취침을 한다.");
				
				game_menu = 0;
				
				
			} else if (game_menu == 5) {
				System.out.println(" 게임 종료 ");
				break;
			}

		}
	}
}
