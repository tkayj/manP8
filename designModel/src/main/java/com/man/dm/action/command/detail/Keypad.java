package com.man.dm.action.command.detail;

//命令模式
//请求者角色，由键盘类扮演
public class Keypad {

	private Command playCommand;
	private Command stopCommand;
	private Command rewindCommand;
	
	public void setPlayCommand(Command playCommand) {
		this.playCommand=playCommand;
	}
	
	public void setStopCommand(Command stopCommand) {
		this.stopCommand=stopCommand;
	}
	
	public void setRewindCommand(Command rewindCommand) {
		this.rewindCommand=rewindCommand;
	}
	
	//执行播放
	public void play() {
		playCommand.execute();
	}
	
	//执行倒带
	public void rewind() {
		rewindCommand.execute();
	}
	
	//执行停止
	public void stop() {
		stopCommand.execute();
	}
	
	
}
