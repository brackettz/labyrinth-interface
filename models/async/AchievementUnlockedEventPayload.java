public class AchievementUnlockedEventPayload implements SlashGame {
  private EventType type;
  private String playerId;
  private AchievementType achievement;
  private Map<String, Object> additionalProperties;

  public EventType getType() { return this.type; }
  public void setType(EventType type) { this.type = type; }

  public String getPlayerId() { return this.playerId; }
  public void setPlayerId(String playerId) { this.playerId = playerId; }

  public AchievementType getAchievement() { return this.achievement; }
  public void setAchievement(AchievementType achievement) { this.achievement = achievement; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}