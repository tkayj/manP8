package com.man.dm.action.command.detail;

/**
 * 倒带命令
 * @author KE
 *
 */
public class RewindCommand implements Command{

	private AudioPlayer audioPlayer;
	
	
	public RewindCommand(AudioPlayer audioPlayer) {
		this.audioPlayer=audioPlayer;
	}
	
	@Override
	public void execute() {
		audioPlayer.rewind();
	}

}
