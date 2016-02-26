package tm.textbasedgothic.main;

public class LivingBeing {
  protected final String name;
  protected final String description;
  protected int level;
  protected int health;
  protected int maxHealth;
  protected int strength;
  protected int agility;
//  private Inventory inventory;
//  private Skill skills;                 // maybe more like List<Skill> skills;
//  Attack Power and Resistances
  
  // Setters and Getters
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getLevel() {
    return level;
  }
  
  public void setLevel(String level) {
    this.level = level;
  }
  
  public String getHealth() {
    return health;
  }
  
  public void setHealth(String health) {
    this.health = health;
  }
  
  public String getMaxHealth() {
    return maxHealth;
  }
  
  public void setMaxHealth(String maxHealth) {
    this.maxHealth = maxHealth;
  }
  
  public String getStrength() {
    return strength;
  }
  
  public void setStrength(String strength) {
    this.strength = strength;
  }

  public String getAgility() {
    return agility;
  }
  
  public void setAgility(String agility) {
    this.agility = agility;
  }

}
