public class Player {
	private String name;
	private char opt;
	
	public Player() {
	
	}

	public Player(String name, char opt) {
		this.name = name;
		this.opt = opt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getOpt() {
		return opt;
	}

	public void setOpt(char opt) {
		this.opt = opt;
	}
	

}
