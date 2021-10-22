package Javaproject;

import java.util.ArrayList;

public class DAMAVO {
	
	
	private String id;
	private String nick;
	private int lv;
	private int expe;
	private int hp;
	private int ene;
	private int max_hp;
	private int max_ene;
	private int atk;
	private int def;
	private int spd;
	private int food;
	private int hurbs;
	private int startday;
	private int sickday;
	private ArrayList<Integer> lvtable = new ArrayList<>();
	
	public void lvtableset() {
		}
	
	public void experience(int exe) {
		this.expe+=exe;
		VOdate();
	}
	  
	public String getId() {
		return id;
	}

	public String getNick() {
		return nick;
	}

	public int getLv() {
		return lv;
	}

	public int getExpe() {
		return expe;
	}

	public int getHp() {
		return hp;
	}

	public int getEne() {
		return ene;
	}

	public int getMax_hp() {
		return max_hp;
	}

	public int getMax_ene() {
		return max_ene;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}

	public int getSpd() {
		return spd;
	}

	public int getFood() {
		return food;
	}

	public int getHurbs() {
		return hurbs;
	}

	public int getStartday() {
		return startday;
	}

	public int getSickday() {
		return sickday;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public void setExpe(int expe) {
		this.expe = expe;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setEne(int ene) {
		this.ene = ene;
	}

	public void setMax_hp(int max_hp) {
		this.max_hp = max_hp;
	}

	public void setMax_ene(int max_ene) {
		this.max_ene = max_ene;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public void setHurbs(int hurbs) {
		this.hurbs = hurbs;
	}

	public void setStartday(int startday) {
		this.startday = startday;
	}

	public void setSickday(int sickday) {
		this.sickday = sickday;
	}

	public DAMAVO() {}

	public DAMAVO(String id, String nick, int lv, int expe, int hp, int ene, int max_hp, int max_ene, int atk, int def,
			int spd, int food, int hurbs, int startday, int sickday) {
		super();
		this.id = id;
		this.nick = nick;
		this.lv = lv;
		this.expe = expe;
		this.hp = hp;
		this.ene = ene;
		this.max_hp = max_hp;
		this.max_ene = max_ene;
		this.atk = atk;
		this.def = def;
		this.spd = spd;
		this.food = food;
		this.hurbs = hurbs;
		this.startday = startday;
		this.sickday = sickday;
	}
	public void VOdate(){
		DAMADAO dama = new DAMADAO();
		dama.update(id, nick, lv, expe, hp, ene, max_hp, max_ene, atk, def, spd, food, hurbs, startday, sickday);
	}

}
