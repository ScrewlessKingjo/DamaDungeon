package Javaproject;

public class DAMAVO {
	
	String ID;
	int exp;
	int lv;
	int hp;
	int atk;
	int def;
	int spd;
	int ene;
	int hurb;
	int food;
	int startday;
	int deadday;
	int sickday;
	String nick;

	
	public DAMAVO() {}

	public DAMAVO(String ID, int exp, int lv, int hp, int atk, int def, int spd, int ene, int hurb, int food,
			int startday, int deadday, int sickday, String nick) {
		super();
		this.ID = ID;
		this.exp = exp;
		this.lv = lv;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.spd = spd;
		this.ene = ene;
		this.hurb = hurb;
		this.food = food;
		this.startday = startday;
		this.deadday = deadday;
		this.sickday = sickday;
		this.nick = nick;
	}

}
