package monsters;

public class GiantWurm extends Monster {
	
	String name = "GiantWurm";
	public GiantWurm(int hp, int attack, int exp) {
		super(hp, attack, exp);
		exp = exp+(exp/2);
		hp = hp+(hp/2);
	}
	@Override
	public String getName() {
		return name;
	}
	
	

}
