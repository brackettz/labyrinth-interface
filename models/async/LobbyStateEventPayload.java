public class LobbyStateEventPayload implements SlashGame {
  private EventType type;
  private PlayerInfo[] players;
  private Map<String, Object> additionalProperties;

  public EventType getType() { return this.type; }
  public void setType(EventType type) { this.type = type; }

  public PlayerInfo[] getPlayers() { return this.players; }
  public void setPlayers(PlayerInfo[] players) { this.players = players; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}