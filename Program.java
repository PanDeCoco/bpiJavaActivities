public abstract class Program {
	
	private String name;
	private boolean isRunning = false;
	
	abstract void run();
	abstract void stop();

	 public void setName(String name) {
        this.name = name;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public String getName() {
        return name;
    }

    public boolean getIsRunning() {
        return isRunning;
    }
}
