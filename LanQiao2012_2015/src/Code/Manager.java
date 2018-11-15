package Code;

public class Manager extends Employee {

	
	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString()
				+ "]";
	}
	

}
