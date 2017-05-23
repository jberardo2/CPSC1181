package question03;

public class Door {
	private String name;
	private String state;
	
	Door (String newName, String newState) {
		name = newName;
		state = newState;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void open() {
		state = "open";
	}
	
	public void close() {
		state = "close";
	}
	
	public String getState() {
		return state;
	}
	
	public boolean isOpen() {
		return (this.state == "open");
	}
}