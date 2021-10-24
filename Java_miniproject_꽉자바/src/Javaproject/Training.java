package Javaproject;

import java.util.Random;
import java.util.Scanner;

//훈련을 하는 클레스입니다.
public class Training {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();
	int menu ;		
	
	public void tr_Select(String id) {
		System.out.println("1. 다마스터디(+wis) 2. 3대운동(+str) 3. 맷집(+shd) 4. 달리기(+spd)");
		menu = sc.nextInt();
		if(menu == 1) {
			System.out.println("문제를 풀어보아용!");
			fa.Face_Talk(id);
			Quiz(id);
		}else if(menu == 2) {
			Health(id);
		}else {
			System.out.println("아직 준비중 입니다.");
		}
	}
	
	public void training_base(String id) {
			st=dama.vo_loding(id);
			st.VO_experience(50,id);
			st.VO_day(id, 1);
			st.Alldate(id);
			fa.Face_Normal(id);
	}
	
	public void Quiz(String id) {
		int num1 = rd.nextInt(99)+1;
		int num2 = rd.nextInt(99)+1;
		int rdnum = rd.nextInt(4);
		int ans;
		if(rdnum == 0) {
			System.out.print(num1 + " + " + num2 + " = ");
			ans = sc.nextInt();
			if(ans == num1 + num2) {
				System.out.println("정답입니다! wis + 1!");
				st.VO_trStudy(1, id);
			}else {
				System.out.println("틀렸습니다.. 다시 도전해보세요");
			}
		}else if(rdnum == 1) {
			System.out.print(num1 + " - " + num2 + " = ");
			ans = sc.nextInt();
			if(ans == num1 - num2) {
				System.out.println("정답입니다! wis + 1!");
				st.VO_trStudy(1, id);
			}else {
			System.out.println("틀렸습니다.. 다시 도전해보세요");
				}
		}else if (rdnum == 2) {
			System.out.print(num1 + " * " + num2 + " = ");
			ans = sc.nextInt();
			if(ans == num1 * num2) {
				System.out.println("정답입니다! wis + 1!");
				st.VO_trStudy(1, id);
			}else {
				System.out.println("틀렸습니다.. 다시 도전해보세요");
				}
		}else if (rdnum == 3) {
			if(num1 < num2) {
				int temp = num2;
				num2 = num1;
				num1 = temp;}
			System.out.println("몫을 구하세요");
			System.out.print(num1 + " / " + num2 + " = ");
			ans = sc.nextInt();
				if(ans == num1 / num2) {
					System.out.println("정답입니다! wis + 1!");
					st.VO_trStudy(1, id);
				}else {
					System.out.println("틀렸습니다.. 다시 도전해보세요");
			}
		}
	}
	
	public void Health(String id) {
		st=dama.vo_loding(id);
		System.out.println(st.getNick() + "(이)가 들 무게를 입력하세요. 현재 Str : " + st.getStr());
		int kg = sc.nextInt();
		
		if(kg > st.getStr()+10) {
			System.out.println("끙...");
			System.out.println("너무 무거워서 들 수 없어용 T^T");
		}else if(kg >= st.getStr()-10 && kg <= st.getStr()+10) {
			fa.Face_HealthTwo(id);
			System.out.println("으랏차!!");
			System.out.println("str + 1!");
			System.out.println();
			st.VO_trHealth(1, id);
			st.Alldate(id);
		}else if(kg < st.getStr()-10) {
			fa.Face_HealthTwo(id);
			System.out.println("이게 뭐야 ... 너무 가볍다 ...");
			System.out.println("운동한 효과가 없네.. str + 0..");
		}
	}
	
	public void Shield(String id) {
		System.out.println();
	}
		
	
	
	
	
}
