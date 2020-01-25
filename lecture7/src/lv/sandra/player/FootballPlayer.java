package lv.sandra.player;

public class FootballPlayer {

	String name;
	String position;
	int shirtNumber;
	boolean build;
	long heigth;
	int weigth;

	public FootballPlayer(String name, String position, int shirtNumber, boolean build, long heigth, int weigth) { // constructor
		this.name = name;
		this.position = position;
		this.shirtNumber = shirtNumber;
		this.build = build;
		this.heigth = heigth;
		this.weigth = weigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public boolean isBuild() {
		return build;
	}

	public void setBuild(boolean build) {
		this.build = build;
	}

	public long getHeigth() {
		return heigth;
	}

	public void setHeigth(long heigth) {
		this.heigth = heigth;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

}
