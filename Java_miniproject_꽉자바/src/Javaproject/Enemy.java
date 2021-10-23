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
	
	// Àû º¯¼ö ¼³Á¤
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

		eList.add(new Enemy("Åä³¢", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("»ç½¿", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°í¾çÀÌ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("±â¸°", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("´Ù¶÷Áã", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("»çÀÚ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¿ø¼þÀÌ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¿À¶û¿ìÅº", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°íÁú¶ó", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("È£¶ûÀÌ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°õ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¸ËµÅÁö", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹ì", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹«½º", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°í½¿µµÄ¡", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("Ä¡Å¸", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("Ç¥¹ü", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹Ý´Þ°¡½¿°õ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("³ª¹«´Ãº¸", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("Ä»°Å·ç", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("ÆÄÀÌ¸®", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));



		return eList.get(0);
		
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

		eList.add(new Enemy("¼Û¾î", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¼þ¾î", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°íµî¾î", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("ÂüÁö", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°¡´Ù¶û¾î", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("Ã¶°©»ó¾î", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹é»ó¾Æ¸®", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("Ã»»ó¾Æ¸®", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("ÇØ»ï", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¸»¹ÌÀß", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("µ¹°í·¡", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹ü°í·¡", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("½ÉÇØ¾î", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹Ù´Ù»çÀÚ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("È¤µî°í·¡", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹Ù´Ù°ÅºÏ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹Ù´Ù¾Ç¾î", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¸Þ°¥·Îµ·", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°¡¹°Ä¡", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹è½º", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("À×¾î", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));



		return eList.get(0);
		
	}

	public Enemy getEnemyAir(String id) {
		
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

		eList.add(new Enemy("Åä³¢", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("»ç½¿", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°í¾çÀÌ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("±â¸°", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("´Ù¶÷Áã", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("»çÀÚ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¿ø¼þÀÌ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¿À¶û¿ìÅº", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°íÁú¶ó", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("È£¶ûÀÌ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°õ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¸ËµÅÁö", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹ì", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹«½º", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("°í½¿µµÄ¡", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("Ä¡Å¸", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("Ç¥¹ü", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("¹Ý´Þ°¡½¿°õ", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("³ª¹«´Ãº¸", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("Ä»°Å·ç", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));
		eList.add(new Enemy("ÆÄÀÌ¸®", randomCal(st.getMaxhp(), a), randomCal(st.getAtk(), b), randomCal(st.getShd(), c), randomCal(st.getSpd(), d), randomCal(st.getStr(), e), randomCal(st.getDex(), f), randomCal(st.getWis(), g), randomCal(st.getLuk(), 1)));



		return eList.get(0);
		
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
		int t=rd.nextInt(1);
		int result;
		if (t==0) {
			result = a+b;
		} else {
			result = a-b;
		}
		return result;
		
	}

}