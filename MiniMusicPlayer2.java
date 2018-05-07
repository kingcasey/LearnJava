import javax.sound.midi.*;

public class MiniMusicPlayer2 implements ControllerEventListener {//listen for Controller Events so implement the listener interface
	
	public static void main (String[] args) {
		
		MiniMusicPlayer2 mini = new MiniMusicPlayer2();
		mini.go();
	}//close main
	
	public void go(){
		
		try {
			
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			//make and open a sequencer
			
			int[] eventsIWant = {127};
			sequencer.addControllerEventListener(this,  eventsIWant);
			//register for events with the sequencer. The event registration method takes the listener and an int array representing the list of ControllerEvents you want. We want event #127.
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			//make a sequence and a track
			
			for (int i=5; i<61;i+=4){ //make a bunch of events to make the notes keep going up (from piano note 5 to piano note 61)
				
				track.add(makeEvent(144,1,i,100,i));
				
				track.add(makeEvent(176,1,127,0,i));
				
				track.add(makeEvent(128,1,i,100,i + 2));
				
			} //end loop
			//call our new makeEvent() method to make the message and event, add the result to the track
			
			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
			//start it running
			
		} catch (Exception ex) {ex.printStackTrace();}
	}// close go
	
	public void controlChange(ShortMessage event) {
		System.out.println("la");
	}
	
	public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick){
		MidiEvent event = null;
		try{
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent (a, tick);
		} catch (Exception e) {}
		return event;
	}

}// close class
