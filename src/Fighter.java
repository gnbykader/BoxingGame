
public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	double dodge;
	int firstAttack;
	
	public Fighter(String name, int damage, int health,int weight,double dodge) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.dodge = dodge;
	}
	
	public int hit(Fighter foe) {
		System.out.println(this.name+" => "+foe.name+" "+this.damage+" hasar aldi.");
		if (isDodge()) {
			System.out.println(foe.name+" gelen hasari savurdu.");
			return foe.health;
		}
		if (foe.health - this.damage < 0) {
			return 0;
		}
		return foe.health - this.damage;
		
	}
	public boolean isDodge() {
		double randomValue = Math.random() * 100;
		return randomValue <= this.dodge;
		
	}

	
	
	
}

