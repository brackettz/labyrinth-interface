public class PlayerState {
  private String id;
  private String name;
  private PlayerColor color;
  private Boolean isAdmin;
  private Boolean isReady;
  private Coordinates currentPosition;
  private Coordinates homePosition;
  private Treasure[] treasuresFound;
  private Treasure currentTreasure;
  private Integer remainingTreasureCount;
  private AchievementType[] achievements;
  private BonusType[] availableBonuses;
  private Map<String, Object> additionalProperties;

  public String getId() { return this.id; }
  public void setId(String id) { this.id = id; }

  public String getName() { return this.name; }
  public void setName(String name) { this.name = name; }

  public PlayerColor getColor() { return this.color; }
  public void setColor(PlayerColor color) { this.color = color; }

  public Boolean getIsAdmin() { return this.isAdmin; }
  public void setIsAdmin(Boolean isAdmin) { this.isAdmin = isAdmin; }

  public Boolean getIsReady() { return this.isReady; }
  public void setIsReady(Boolean isReady) { this.isReady = isReady; }

  public Coordinates getCurrentPosition() { return this.currentPosition; }
  public void setCurrentPosition(Coordinates currentPosition) { this.currentPosition = currentPosition; }

  public Coordinates getHomePosition() { return this.homePosition; }
  public void setHomePosition(Coordinates homePosition) { this.homePosition = homePosition; }

  public Treasure[] getTreasuresFound() { return this.treasuresFound; }
  public void setTreasuresFound(Treasure[] treasuresFound) { this.treasuresFound = treasuresFound; }

  public Treasure getCurrentTreasure() { return this.currentTreasure; }
  public void setCurrentTreasure(Treasure currentTreasure) { this.currentTreasure = currentTreasure; }

  public Integer getRemainingTreasureCount() { return this.remainingTreasureCount; }
  public void setRemainingTreasureCount(Integer remainingTreasureCount) { this.remainingTreasureCount = remainingTreasureCount; }

  public AchievementType[] getAchievements() { return this.achievements; }
  public void setAchievements(AchievementType[] achievements) { this.achievements = achievements; }

  public BonusType[] getAvailableBonuses() { return this.availableBonuses; }
  public void setAvailableBonuses(BonusType[] availableBonuses) { this.availableBonuses = availableBonuses; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}