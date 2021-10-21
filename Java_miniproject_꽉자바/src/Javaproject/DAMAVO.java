package Javaproject;

public class DAMAVO {
	
	String ID;
	String nick;
	int exp;
	int lv;
	int hp;
	int atk;
	int dep;
	int spd;
	int ene;
	int hurb;
	int food;
	int startday;
	int deadday;
	int sickday;
	
	public DAMAVO() {}
	
	public DAMAVO(String iD, String nick, int exp, int lv, int hp, int atk, int dep, int spd, int ene, int hurb,
			int food, int startday, int deadday, int sickday) {
		super();
		ID = iD;
		this.nick = nick;
		this.exp = exp;
		this.lv = lv;
		this.hp = hp;
		this.atk = atk;
		this.dep = dep;
		this.spd = spd;
		this.ene = ene;
		this.hurb = hurb;
		this.food = food;
		this.startday = startday;
		this.deadday = deadday;
		this.sickday = sickday;
	}

	public String getID() {
		return ID;
	}

	public String getNick() {
		return nick;
	}

	public int getExp() {
		return exp;
	}

	public int getLv() {
		return lv;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public int getDep() {
		return dep;
	}

	public int getSpd() {
		return spd;
	}

	public int getEne() {
		return ene;
	}

	public int getHurb() {
		return hurb;
	}

	public int getFood() {
		return food;
	}

	public int getStartday() {
		return startday;
	}

	public int getDeadday() {
		return deadday;
	}

	public int getSickday() {
		return sickday;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}

	public void setEne(int ene) {
		this.ene = ene;
	}

	public void setHurb(int hurb) {
		this.hurb = hurb;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public void setStartday(int startday) {
		this.startday = startday;
	}

	public void setDeadday(int deadday) {
		this.deadday = deadday;
	}

	public void setSickday(int sickday) {
		this.sickday = sickday;
	}
	

	
}
