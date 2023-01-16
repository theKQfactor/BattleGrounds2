

public class Pistol extends Weapon {
	
	private int fireRate;
	private int bulletSpeed;
	private int damage;
	

	Pistol(){
		fireRate = 6;
		bulletSpeed = 4;
		damage = 2;
	}
	
	public int getFireRate() {
		return fireRate;
	}
	
	public void shoot(int xPos, int yPos, int direction) {
		//Bullet bullet = new bullet(xPos, yPos, direction, bulletSpeed);
	}
	
}
