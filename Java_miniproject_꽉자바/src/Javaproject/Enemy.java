package Javaproject;

import java.util.ArrayList;
import java.util.Random;

public class Enemy {

	// 적 변수 설정
	private String En_name;
	int En_hp;
	int En_atk;
	int En_def;
	int En_spd;
	Random rd = new Random();

	public Enemy() {
	}

	public Enemy getEnemy() {
		int i = rd.nextInt(17);
		ArrayList<Enemy> eList = new ArrayList<>();

		eList.add(new Enemy("피카츄", 100, 100, 100, 100));
		eList.add(new Enemy("라이츄", 100, 100, 100, 100));
		eList.add(new Enemy("파이리", 100, 100, 100, 100));
		eList.add(new Enemy("꼬부기", 100, 100, 100, 100));
		eList.add(new Enemy("버터플", 100, 100, 100, 100));
		eList.add(new Enemy("야도란", 100, 100, 100, 100));
		eList.add(new Enemy("피죤투", 100, 100, 100, 100));
		eList.add(new Enemy("또가스", 100, 100, 100, 100));
		eList.add(new Enemy("잠만보", 100, 100, 100, 100));
		eList.add(new Enemy("야돈", 100, 100, 100, 100));
		eList.add(new Enemy("푸린", 100, 100, 100, 100));
		eList.add(new Enemy("알통몬", 100, 100, 100, 100));
		eList.add(new Enemy("스라소니", 100, 100, 100, 100));
		eList.add(new Enemy("또도가스", 100, 100, 100, 100));
		eList.add(new Enemy("야옹이", 100, 100, 100, 100));
		eList.add(new Enemy("마자용", 100, 100, 100, 100));
		eList.add(new Enemy("그래용", 100, 100, 100, 100));

		return eList.get(i);
	}

	public Enemy(String en_name, int en_hp, int en_atk, int en_def, int en_spd) {
		En_name = en_name;
		En_hp = en_hp;
		En_atk = en_atk;
		En_def = en_def;
		En_spd = en_spd;
	}

}