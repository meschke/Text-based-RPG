package tm.textbasedgothic.main;

public class Player extends LivingBeing {
	// Additional attributes
	private int exp;
	private int maxExp;			// to reach new level
	private int lp;				// good old Gothic-tradition: Learning Points!
	private List<Action> actions;		// change Location, talk to NPC, attack etc.
	
	// Starting stats for Hero
	final private String INIT_HERO_NAME = "Nameless";	// name
	final private int INIT_HERO_LEVEL = 1;			// level
	final private int INIT_HERO_EXP = 0;			// exp
	final private int INIT_HERO_MAXEXP = 1;			// exp to reach level 2
	final private int INIT_HERO_HP = 50;			// health
	final private int INIT_HERO_STR = 10;			// strength
	final private int INIT_HERO_AGI = 10;			// agility
	final private int INIT_HERO_LP = 0;			// learning points
	
	
}
