public class MSWord extends Program {
	
	public MSWord(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		String message = "Opening MS Word...";
		System.out.println(message);
	}
	
	@Override
	public void stop() {
		String message = "Stopping MS Word...";
	    System.out.println(message);
	}
}
