package miniproject;

import javazoom.jl.player.MP3Player;

public class BGM {

	public static void main(String[] args) {
		MP3Player mp3 = new MP3Player();
		
		mp3.play(".\\music\\playStart.mp3"); // 시작배경음ㅇ
		mp3.play(".\\music\\playCatch.mp3"); // 메인음악ㅇ
		mp3.play(".\\music\\playDay.mp3"); // Day 넘어갈때x
		mp3.play(".\\music\\playMinigame.mp3"); // 미니게임 배경음ㅇ
		mp3.play(".\\music\\playWow.mp3"); // 미니게임 성공!ㅇ
		mp3.play(".\\music\\playFail.mp3"); // 미니게임 실패!ㅇ
		mp3.play(".\\music\\playGun.mp3"); // 마피아 지목 ㅁ
		mp3.play(".\\music\\playX.mp3"); // 마피아가 아닐 때
		mp3.play(".\\music\\goodEnding.mp3"); // 사용자승리ㅇ
		mp3.play(".\\music\\badEnding.mp3"); // 마피아승리ㅇ
//		if(mp3.isPlaying()) {
//			mp3.stop();}
	}

}
