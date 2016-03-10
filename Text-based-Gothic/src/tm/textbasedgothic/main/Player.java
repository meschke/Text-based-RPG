package tm.textbasedgothic.main;

public class Player extends LivingBeing {
	// Starting stats for Hero
	final private String INIT_HERO_NAME = "Nameless";	// name
	final private int INIT_HERO_LEVEL = 1;			// level
	final private int INIT_HERO_EXP = 0;			// exp
	final private int INIT_HERO_MAXEXP = 1;			// exp to reach level 2
	final private int INIT_HERO_HP = 50;			// health
	final private int INIT_HERO_STR = 10;			// strength
	final private int INIT_HERO_AGI = 10;			// agility
	final private int INIT_HERO_LP = 0;			// learning points
	
	// Additional attributes
	private int exp;
	private int maxExp;		// to reach new level
	private int lp;			// good old Gothic-tradition: Learning Points!
	
	// Hero when starting new game
	private Player() {
		// inherited attributes
		name = INIT_HERO_NAME;
		level = INIT_HERO_LEVEL;
		health = INIT_HERO_HP;
		amxHealth = INIT_HERO_HP;
		strength = INIT_HERO_STR;
		agility = INIT_HERO_AGI;
		currentLocation = new Location(startingLocation);
		// own attributes
		exp = INIT_HERO_EXP;
		maxExp = INIT_HERO_MAXEXP;
		lp = INIT_HERO_LP;
	}
	
	// Getters / setters
	private void setExp(int exp) {
		this.exp = exp;
	}
	
	private int getExp() {
		return this.exp;
	}
	
	private void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}
	
	private int getMaxExp() {
		return this.maxExp;
	}
	
	private void setLP(int lp) {
		this.lp = lp;
	}
	
	private int getLP() {
		return this.lp;
	}
	
	
}
