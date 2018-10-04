package monsters;

public class Skeleton extends Monster {
	
	String name = "Skeleton";
	public Skeleton(int hp, int attack, int exp) {
		super(hp, attack, exp);
		hp = hp+45;
		exp = exp+25;
	}
	@Override
	public String getName() {
		return name;
	}

}
