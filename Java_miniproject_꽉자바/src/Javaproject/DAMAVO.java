package Javaproject;

import java.util.ArrayList;

public class DAMAVO {
	
	
	private String id;
	private String nick;
	private int lv;
	private int expe;
	private int hp;
	private int ene;
	private int maxhp;
	private int maxene;
	private int atk;
	private int spd;
	private int food;
	private int hurbs;
	private int startday;
	private int sickday;
	private int shd;
	private int str;
	private int dex;
	private int wis;
	private int luk;
	private int dummi;
	private int jobid;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getExpe() {
		return expe;
	}

	public void setExpe(int expe) {
		this.expe = expe;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getEne() {
		return ene;
	}

	public void setEne(int ene) {
		this.ene = ene;
	}

	public int getMaxhp() {
		return maxhp;
	}

	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}

	public int getMaxene() {
		return maxene;
	}

	public void setMaxene(int maxene) {
		this.maxene = maxene;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getHurbs() {
		return hurbs;
	}

	public void setHurbs(int hurbs) {
		this.hurbs = hurbs;
	}

	public int getStartday() {
		return startday;
	}

	public void setStartday(int startday) {
		this.startday = startday;
	}

	public int getSickday() {
		return sickday;
	}

	public void setSickday(int sickday) {
		this.sickday = sickday;
	}

	public int getShd() {
		return shd;
	}

	public void setShd(int shd) {
		this.shd = shd;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getLuk() {
		return luk;
	}

	public void setLuk(int luk) {
		this.luk = luk;
	}

	public int getDummi() {
		return dummi;
	}

	public void setDummi(int dummi) {
		this.dummi = dummi;
	}

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public DAMAVO() {
		// TODO Auto-generated constructor stub
	}
	 
	public DAMAVO(String getId, String getNick, int getExper, int getLv, int getEne, int getMaxene, int getFood, int getHerbs, int getStart, int getSick,int job) {
		this.id = getId;
		this.nick = getNick;
		this.lv = getLv;
		this.expe = getExper;
		this.ene = getEne;
		this.maxene = getMaxene;
		this.food = getFood;
		this.hurbs = getHerbs;
		this.startday = getStart;
		this.sickday = getSick;
		this.jobid = job;
	}


	public DAMAVO(String getId, int gethp, int getmaxhp, int getatk, int getshd, int getspd, int getstr, int getdex,
			int getwis, int getluk, int getdummi) {
		this.id = getId;
		this.hp = gethp;
		this.maxhp = getmaxhp;
		this.atk = getatk;
		this.shd = getshd;
		this.spd = getspd;
		this.str = getstr;
		this.dex = getdex;
		this.wis = getwis;
		this.luk = getluk;
		this.dummi = getdummi;
		// TODO Auto-generated constructor stub
	}

	public void VOdate(){
		DAMADAO dama = new DAMADAO();
		
	}

}
