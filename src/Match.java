
public class Match {
	Fighter f1;
	Fighter f2;
	int maxWeight;
	int minWeight;
	
	public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
	}
	
	public void run() {
		if (checkWeight()) {
			System.out.println("---------NEW ROUND------------");
			isFirstAttack();
			printScore();
			while (f1.weight > 0 && f2.weight > 0) {
				System.out.println("---------NEW ROUND-----------");
				f2.health = f1.hit(f2);
				if (isWin()) {
					printScore();
					break;
				}
				f1.health = f2.hit(f1);
				if (isWin()) {
					printScore();
					break;
				}
				printScore();
				
			}
		}
		else {
			System.out.println("Sporcularin sikletleri uymuyor.");
		}
		
	}
	public boolean checkWeight() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
		
	}
	public boolean isWin() {
		if (f1.health == 0) {
			System.out.println("---------The Winner Is "+f2.name+"-----------");
			return true;
		}
		else if (f2.health == 0) {
			System.out.println("---------The Winner Is "+f1.name+"------------");
			return true;
		}
		return false;
	}
	public void isFirstAttack() {
    	double randomValue = Math.random();

		if (randomValue > 0 && randomValue <= 50) {
			f2.health = f1.hit(f2);
		}
		else if(randomValue > 50 && randomValue <= 100) {
			f1.health = f2.hit(f1);
		}
		
	}
	public void printScore() {
		System.out.println("------------------------------");
		System.out.println(f1.name+" Kalan Can: "+f1.health);
		System.out.println(f2.name+" Kalan Can: "+f2.health);
	}

}
