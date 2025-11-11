public class NextTreasureCardEventPayload implements SlashGame {
  private EventType type;
  private Treasure treasure;
  private Map<String, Object> additionalProperties;

  public EventType getType() { return this.type; }
  public void setType(EventType type) { this.type = type; }

  public Treasure getTreasure() { return this.treasure; }
  public void setTreasure(Treasure treasure) { this.treasure = treasure; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}