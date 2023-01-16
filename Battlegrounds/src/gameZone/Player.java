package gameZone;

public class Player {
	
	private int xPos;
	private int yPos;
	private boolean alive;
	private int maxSpeed;
	private Pistol gun;
	private int direction;
	
	Player(){
		xPos = 50;
		yPos = 50;
		alive = true;
		maxSpeed = 4;
		gun = new Pistol();
		direction = 1;
	}
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
	public void addX(int n) {
		xPos += n;
	}
	
	public void addY(int n) {
		yPos += n;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void shoot() {
		gun.shoot(xPos, yPos, direction);
	}
	
	public void setDirection(int n) {
		direction = n;
	}
	
	public int getDirection(){
		return direction;
	}
	
	public int getFireRate() {
		return gun.getFireRate();
	}
}
