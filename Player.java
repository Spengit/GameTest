
public class Player {
private String name;
private double score;
private Command command;

public Player() {
	this.name = "no-name";
	this.score = 0;
	
}
public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}

public double getScore() {
	return this.score;
}

public void setScore(double score) {
	this.score = score;
}

}
