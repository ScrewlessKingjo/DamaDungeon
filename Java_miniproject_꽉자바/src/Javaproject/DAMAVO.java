package Javaproject;

public class DAMAVO {
	
	
	String id;
	String nick;
	int lv;
	int exp;
	int hp;
	int ene;
	int max_hp;
	int max_ene;
	int atk;
	int def;
	int spd;
	int food;
	int hurbs;
	int startday;
	int sickday;
	  
	public DAMAVO() {}

	public DAMAVO(String id, String nick, int lv, int exp, int hp, int ene, int max_hp, int max_ene, int atk, int def,
			int spd, int food, int hurbs, int startday, int sickday) {
		super();
		this.id = id;
		this.nick = nick;
		this.lv = lv;
		this.exp = exp;
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

}
