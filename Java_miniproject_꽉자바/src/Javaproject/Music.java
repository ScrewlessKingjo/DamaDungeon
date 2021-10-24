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
              bgm = new File("C:\\Users\\sang0\\git\\Javaminiproject1\\Java_miniproject_꽉자바\\music\\miniStrike.wav"); // 사용시에는 개별 폴더로 변경할 것
              Clip clip;
              try {
                     stream = AudioSystem.getAudioInputStream(bgm);
                     format = stream.getFormat();
                     info = new DataLine.Info(Clip.class, format);
                     clip = (Clip)AudioSystem.getLine(info);
                     clip.open(stream);
                     clip.start();     
              } catch (Exception e) {
                     System.out.println("err : " + e);
                     }    
       }
       public void BattleBrothers() {
           File bgm;
           AudioInputStream stream;
           AudioFormat format;
           DataLine.Info info;
           bgm = new File("C:\\Users\\sang0\\git\\Javaminiproject1\\Java_miniproject_꽉자바\\music\\BattleBrotherswav.wav"); // 사용시에는 개별 폴더로 변경할 것
           Clip clip;
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
                  clip.open(stream);
                  clip.start();      
           } catch (Exception e) {
                  System.out.println("err : " + e);
                  }    
    }
       public void AirCut() {
           File bgm;
           AudioInputStream stream;
           AudioFormat format;
           DataLine.Info info;
           bgm = new File("C:\\Users\\sang0\\git\\Javaminiproject1\\Java_miniproject_꽉자바\\music\\AirCut.wav"); // 사용시에는 개별 폴더로 변경할 것
           Clip clip;
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
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
           bgm = new File("C:\\Users\\sang0\\git\\Javaminiproject1\\Java_miniproject_꽉자바\\music\\Bloody.wav"); // 사용시에는 개별 폴더로 변경할 것
           Clip clip;
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
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
           bgm = new File("C:\\Users\\sang0\\git\\Javaminiproject1\\Java_miniproject_꽉자바\\music\\fireBall.wav"); // 사용시에는 개별 폴더로 변경할 것
           Clip clip;
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
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
           bgm = new File("C:\\Users\\sang0\\git\\Javaminiproject1\\Java_miniproject_꽉자바\\music\\shrineofenirhs.wav"); // 사용시에는 개별 폴더로 변경할 것
           Clip clip;
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
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
           bgm = new File("C:\\Users\\sang0\\git\\Javaminiproject1\\Java_miniproject_꽉자바\\music\\gunshot.wav"); // 사용시에는 개별 폴더로 변경할 것
           Clip clip;
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
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
           bgm = new File("C:\\Users\\sang0\\git\\Javaminiproject1\\Java_miniproject_꽉자바\\music\\524912__andrest2003__gunshot-pitch-a.wav"); // 사용시에는 개별 폴더로 변경할 것
           Clip clip;
           try {
                  stream = AudioSystem.getAudioInputStream(bgm);
                  format = stream.getFormat();
                  info = new DataLine.Info(Clip.class, format);
                  clip = (Clip)AudioSystem.getLine(info);
                  clip.open(stream);
                  clip.start();      
           } catch (Exception e) {
                  System.out.println("err : " + e);
                  }    
    }
}