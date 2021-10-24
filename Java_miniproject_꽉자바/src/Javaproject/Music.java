package Javaproject;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class Music {
	public void ASingularStrike() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File("C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/miniStrike.wav");
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public Clip BattleBrothers() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File("C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/BattleBrotherswav.wav");
		Clip clip = null;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.loop(10);
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
		return clip;
	}

	public void AirCut() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File("C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/AirCut.wav");
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void Bloody() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File("C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/Bloody.wav");
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void Fireball() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File("C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/fireBall.wav");
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void Determination() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File("C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/shrineofenirhs.wav");
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void gunshot1() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File("C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/gunshot.wav");
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void gunshot2() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File(
				"C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/524912__andrest2003__gunshot-pitch-a.wav");
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}
	public void fireball() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File(
				"C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/fireball.wav");
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}
	public void ice() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File(
				"C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/ice.wav");
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}
	public void warcry() {
		File bgm;
		AudioInputStream stream;
		AudioFormat format;
		DataLine.Info info;
		bgm = new File(
				"C:/Users/smhrd/Desktop/JAVAstudy/Javaminiproject1/Java_miniproject_²ËÀÚ¹Ù/music/warcry.wav");
		Clip clip;
		try {
			stream = AudioSystem.getAudioInputStream(bgm);
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}
}