package miniproject;

import javazoom.jl.player.MP3Player;

public class BGM {

	public static void main(String[] args) {
		MP3Player mp3 = new MP3Player();
		
		mp3.play(".\\music\\playStart.mp3"); // ���۹������
		mp3.play(".\\music\\playCatch.mp3"); // �������Ǥ�
		mp3.play(".\\music\\playDay.mp3"); // Day �Ѿ��x
		mp3.play(".\\music\\playMinigame.mp3"); // �̴ϰ��� �������
		mp3.play(".\\music\\playWow.mp3"); // �̴ϰ��� ����!��
		mp3.play(".\\music\\playFail.mp3"); // �̴ϰ��� ����!��
		mp3.play(".\\music\\playGun.mp3"); // ���Ǿ� ���� ��
		mp3.play(".\\music\\playX.mp3"); // ���Ǿư� �ƴ� ��
		mp3.play(".\\music\\goodEnding.mp3"); // ����ڽ¸���
		mp3.play(".\\music\\badEnding.mp3"); // ���Ǿƽ¸���
//		if(mp3.isPlaying()) {
//			mp3.stop();}
	}

}
