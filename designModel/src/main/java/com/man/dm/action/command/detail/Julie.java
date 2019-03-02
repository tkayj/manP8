package com.man.dm.action.command.detail;


//客户端角色，由茱丽小女孩扮演
public class Julie {

	public static void main(String[] args) {
		//创建接收者对象
		AudioPlayer audioPlayer=new AudioPlayer();
		
		//创建命令对象
		Command playCommand=new PlayCommand(audioPlayer);
		Command stopCommand=new StopCommand(audioPlayer);
		Command rewindCommand=new RewindCommand(audioPlayer);
		
		//创建请求者对象
		Keypad keypad=new Keypad();
		keypad.setPlayCommand(playCommand);
		keypad.setStopCommand(stopCommand);
		keypad.setRewindCommand(rewindCommand);
		
		//测试
		keypad.play();		
		keypad.rewind();		
		keypad.stop();
		
	}
}
