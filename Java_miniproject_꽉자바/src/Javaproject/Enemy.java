package Javaproject;

import java.util.ArrayList;
import java.util.Random;

public class Enemy {

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

	
	public Enemy getEnemy() {
		int i = rd.nextInt(17);
		ArrayList<Enemy> eList = new ArrayList<>();

		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));
		eList.add(new Enemy("ÇÇÄ«Ãò", 150, 10, 25, 10, 10, 10, 10, 10));


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

}