package lecture_14.middle.Computer;

public class Computer {
	
	private Keyboard keyboard;
	private Mouse mouse;
	private Monitor monitor;
	
	public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.monitor = monitor;
	}
	
	public Keyboard getKeyboard() {
		return this.keyboard;
	}
	
	public Mouse getMouse() {
		return this.mouse;
	}
	
	public Monitor getMonitor() {
		return this.monitor;
	}
}
