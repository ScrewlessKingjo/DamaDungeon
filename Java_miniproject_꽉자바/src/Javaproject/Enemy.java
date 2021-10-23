package Javaproject;

import java.util.ArrayList;
import java.util.Random;

public class Enemy {
	
	DAMADAO dama = new DAMADAO();
	DAMAVO st = new DAMAVO();
	

	private String id;
	private int maxhp;
	private int atk;
	private int spd;
	private int shd;
	private int str;
	private int dex;
	private int wis;
	private int luk;
	
	// 적 변수 설정
	private String En_name;
	private int En_hp;
	private int En_atk;
	private int En_def;
	private int En_spd;
	private int En_str;
	private int En_dex;
	private int En_wis;
	private int En_luk;
	
	Random rd = new Random();

	public Enemy() {
	}

	public String getEn_name() {
		return En_name;
	}

	public int getEn_hp() {
		return En_hp;
	}

	public int getEn_atk() {
		return En_atk;
	}

	public int getEn_def() {
		return En_def;
	}

	public int getEn_spd() {
		return En_spd;
	}

	public void setEn_name(String en_name) {
		En_name = en_name;
	}

	public void setEn_hp(int en_hp) {
		En_hp = en_hp;
	}

	public void setEn_atk(int en_atk) {
		En_atk = en_atk;
	}

	public void setEn_def(int en_def) {
		En_def = en_def;
	}

	public void setEn_spd(int en_spd) {
		En_spd = en_spd;
	}
	

	public int getEn_str() {
		return En_str;
	}

	public void setEn_str(int en_str) {
		En_str = en_str;
	}

	public int getEn_dex() {
		return En_dex;
	}

	public void setEn_dex(int en_dex) {
		En_dex = en_dex;
	}

	public int getEn_wis() {
		return En_wis;
	}

	public void setEn_wis(int en_wis) {
		En_wis = en_wis;
	}

	public int getEn_luk() {
		return En_luk;
	}

	public void setEn_luk(int en_luk) {
		En_luk = en_luk;
	}

	
	public Enemy getEnemyLand(String id) {
		
		st = dama.vo_loding(id);
		int i = rd.nextInt(21);
		int a = (rd.nextInt(8)*10);
		int b = rd.nextInt(8);
		int c = rd.nextInt(8);
		int d = rd.nextInt(8);
		int e = rd.nextInt(8);
		int f = rd.nextInt(8);
		int g = rd.nextInt(8);
		int h = rd.nextInt(8);
		
		UserInfo();
		
		ArrayList<Enemy> eList = new ArrayList<>();

		eList.add(new Enemy("토끼", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("사슴", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("고양이", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("기린", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("다람쥐", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("사자", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("원숭이", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("오랑우탄", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("고질라", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("호랑이", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("곰", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("맷돼지", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("뱀", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("무스", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("고슴도치", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("치타", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("표범", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("반달가슴곰", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("나무늘보", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("캥거루", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("파이리", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));



		return eList.get(i);
		
	}
	
	public Enemy getEnemySea(String id) {
		
		st = dama.vo_loding(id);
		int i = rd.nextInt(21);
		int a = (rd.nextInt(8)*10);
		int b = rd.nextInt(8);
		int c = rd.nextInt(8);
		int d = rd.nextInt(8);
		int e = rd.nextInt(8);
		int f = rd.nextInt(8);
		int g = rd.nextInt(8);
		int h = rd.nextInt(8);
		
		UserInfo();
		
		ArrayList<Enemy> eList = new ArrayList<>();

		eList.add(new Enemy("송어", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("숭어", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("고등어", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("참지", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("가다랑어", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("철갑상어", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("백상아리", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("청상아리", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("해삼", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("말미잘", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("돌고래", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("범고래", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("심해어", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("바다사자", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("혹등고래", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("바다거북", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("바다악어", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("메갈로돈", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("가물치", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("배스", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("잉어", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));



		return eList.get(i);
		
	}

	public Enemy getEnemyAir(String id) {
		
		st = dama.vo_loding(id);
		int i = rd.nextInt(20);
		int a = (rd.nextInt(8)*10);
		int b = rd.nextInt(8);
		int c = rd.nextInt(8);
		int d = rd.nextInt(8);
		int e = rd.nextInt(8);
		int f = rd.nextInt(8);
		int g = rd.nextInt(8);
		int h = rd.nextInt(8);
		
		UserInfo();
		
		ArrayList<Enemy> eList = new ArrayList<>();

		eList.add(new Enemy("왕독수리", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("대머리독수리", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("까마귀", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("뱁새", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("장수말벌", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("꿩", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("학", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("타조", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("하늘거북이", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("스카이퍼피", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("파리", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("잠자리", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("딱따구리", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("벌새", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("호랑나비", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("소쩍새", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("두루미", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("직박구리", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("황조롱이", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("따오기", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));


		return eList.get(i);
		
	}
	
	public Enemy(String en_name, int en_hp, int en_atk, int en_def, int en_spd, int en_str, int en_dex, int en_wis, int en_luk) {
		En_name = en_name;
		En_hp = en_hp;
		En_atk = en_atk;
		En_def = en_def;
		En_spd = en_spd;
		 En_str = en_str;
		 En_dex = en_dex;
		 En_wis = en_wis;
		 En_luk = en_luk;
	}
	public void UserInfo() {
		id = st.getId();
		maxhp = st.getMaxhp();
		atk = st.getAtk();
		shd = st.getShd();
		spd = st.getSpd();
		str = st.getStr();
		dex = st.getDex();
		wis = st.getWis();
		luk = st.getLuk();

	}
	
	public int randomCal (int a, int b) {
		int t=rd.nextInt(2);
		int result;
		if (t==0) {
			result = a+b;
		} else {
			result = a-b;
		}
		return result;
		
	}

}