package Javaproject;

import java.util.Scanner;

public class testMain {
	static int coin;	// 게임 시작 여부 확인 변수
	public static void main(String[] args) {
		DAMADAO dama = new DAMADAO();
		DAMAVO st = new DAMAVO();
		Face fc = new Face();
	    Eat eat = new Eat();
		Scanner sc = new Scanner(System.in);
		Sleep sp = new Sleep();
		Training tr = new Training();
		Music mu = new Music();
		Adventure ad =new Adventure();			
		int title_menu = 0;			// 메인페이지 메뉴 변수
		int game_menu = -1;			// 기능페이지 메뉴 변수 (1.모험 2.훈련 3.음식 4.취침 5.종료)
		int select_menu = 0;		// 선택 메뉴 변수
		coin=0;
		String main_id = null;
		while (true) {
			if (title_menu == 0) {
				fc.face_main();
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
				dama.joinStators1(ID, NICK);
				dama.joinStators2(ID);
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
				dama.table3();
				title_menu = 0;
			} else if (title_menu == 6) {
				// 아이디 비번 확인하는 메소드
				dama.select();
				title_menu = 0;
			} else if (title_menu == 7) {
				// 아이디 비번 확인하는 메소드
				dama.all_delete();
				title_menu = 0;
			}else {
				title_menu = 0;
			}
		}
		
		 
		while (coin == 5) {
			
			if (game_menu == -1) {fc.Face_Normal(main_id);game_menu=0;}
			else if (game_menu == 0) {
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
				ad.select_Adven(main_id);
				st.VO_deadly(main_id);
				game_menu = 0;
				
				
			} else if (game_menu == 2) {
				System.out.println("훈련을 떠난다.");
				tr.training_base(main_id);
				game_menu = 0;
				
				
			} else if (game_menu == 3) {
				
				System.out.println("먹어보자!!");
				eat.Eat_menu(main_id);
				game_menu = 0;
				
				
				
				
			} else if (game_menu == 4) {
				System.out.println("취침을 한다.");
				fc.Face_Sleep(main_id);
				int cnt = sp.sleep(main_id);
				
				if(cnt > 0) {
					System.out.println("회복 성공");
				}else {
					System.out.println("회복 실패..");
				}
				
				game_menu = 0;
				
			} else if (game_menu == 5) {
				fc.Face_Escape(main_id);
				coin=0;
				System.out.println(" 게임 종료 ");
			}

		}
		
	}	
	public void setcoin(int set){
		coin = set;
	}
	

}
