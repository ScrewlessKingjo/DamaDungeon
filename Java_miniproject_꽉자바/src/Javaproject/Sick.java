package Javaproject;

import java.util.Random;
import java.util.Scanner;

public class Sick {
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	
	DAMADAO dama = new DAMADAO();
	Face fa = new Face();
	DAMAVO st = new DAMAVO();
	
	public void Sick(String id){
		
		st=dama.vo_loding(id);
		st.VO_day(id, 1);
		
	}
	
}
