package com.man.dm.action.command.detail;

/**
 * 播放命令
 * @author KE
 *
 */
public class PlayCommand implements Command{

	private AudioPlayer audioPlayer;
	
	
	public PlayCommand(AudioPlayer audioPlayer) {
		this.audioPlayer=audioPlayer;
	}
	
	@Override
	public void execute() {
		audioPlayer.play();
	}

}
