package com.man.dm.action.command.detail;

/**
 * 停止命令
 * @author KE
 *
 */
public class StopCommand implements Command{

	private AudioPlayer audioPlayer;
	
	
	public StopCommand(AudioPlayer audioPlayer) {
		this.audioPlayer=audioPlayer;
	}
	
	@Override
	public void execute() {
		audioPlayer.stop();
	}

}
