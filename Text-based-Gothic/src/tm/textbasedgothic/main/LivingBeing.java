package tm.textbasedgothic.main;

public class LivingBeing {
  protected final String name;
  protected final String description;
  protected int level;
  protected int health;
  protected int maxHealth;
  protected int strength;
  protected int agility;
  protected Location currentLocation;
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
  
  public int getLevel() {
    return level;
  }
  
  public void setLevel(int level) {
    this.level = level;
  }
  
  public int getHealth() {
    return health;
  }
  
  public void setHealth(int health) {
    this.health = health;
  }
  
  public int getMaxHealth() {
    return maxHealth;
  }
  
  public void setMaxHealth(int maxHealth) {
    this.maxHealth = maxHealth;
  }
  
  public int getStrength() {
    return strength;
  }
  
  public void setStrength(int strength) {
    this.strength = strength;
  }

  public int getAgility() {
    return agility;
  }
  
  public void setAgility(int agility) {
    this.agility = agility;
  }
  
  public Location getCurrentLocation() {
    return currentLocation;
  }
  
  public void setCurrentLocation(Location currentLocation) {
    this.currentLocation = currentLocation;
  }

}
