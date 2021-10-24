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
		fc.face_main();
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
					st=dama.vo_loding(main_id);
					if (st.getHp()==0) {
						coin = 0;
						System.out.println("이미 죽은 캐릭터 입니다.");
					}
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
				System.out.print(NICK+"의 직업을 선택해주세요.");
				System.out.print("[1] 전사 [2] 도적 [3] 마법사 [4] 거지");
				int job_choice = sc.nextInt();
				if (job_choice == 1) {
					System.out.println("전사는 전선에서 직접 적과 검을 맞대는, 두려움을 모르는 싸움꾼입니다.");
					System.out.println("근력에 많은 보너스를 받은 채로 시작하며, 이를 기반으로 적을 직접적으로 공격하는 기술들을 가지고 있습니다.");
				} else if (job_choice ==2 ) {
					System.out.println("도적은 야비하고, 무자비한 무법자입니다.");
					System.out.println("민첩에 많은 보너스를 받은 채로 시작하며, 자신의 운에 모든걸 맡기는 술책을 사용합니다.");
				}  else if (job_choice ==3 ) {
					System.out.println("마법사는 세상의 이치를 찾아 돌아다니는 방랑자입니다.");
					System.out.println("지혜는 마법사의 최대 장점이며, 마법사는 자신의 지혜를 가지고 여러가지 마법을 사용합니다.");
				}  else if (job_choice ==4 ) {
					System.out.println("거지는 이곳에 있어서는 안되는 불우한 자입니다.");
					System.out.println("다른 직업에 비해서 빼어난 특기는 없지만, 아무것도 가지지 않은 자는 다른 사람보다 무서운 법입니다....");
				} 
				coin = dama.join(ID, PW);
				title_menu = 0;
				if (coin == 5) {
					dama.joinStators1(ID, NICK);
					dama.joinStators2(ID);
					main_id = ID;
					break;
				}else {
					System.out.println("회원가입 실패.. 다시 시도해주세요//");
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
				st=dama.vo_loding(main_id);
				st.VO_deadly(main_id);
				st.Alldate(main_id);
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
				st=dama.vo_loding(main_id);
				st.VO_sleeptry(main_id, 80, 80);
				st.Alldate(main_id);
				fc.Face_Sleep(main_id);
				game_menu = 0;
				
			} else if (game_menu == 5) {
				st=dama.vo_loding(main_id);
				fc.Face_Escape(main_id);
				coin=0;
				System.out.println(" 게임 종료 ");
				
				st.Alldate(main_id);
			}

		}
		
	}	
	public void setcoin(int set){
		coin = set;
	}
	

}
