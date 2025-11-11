public class GameStartedEventPayload implements SlashGame {
  private EventType type;
  private GameBoard initialBoard;
  private PlayerState[] players;
  private Map<String, Object> additionalProperties;

  public EventType getType() { return this.type; }
  public void setType(EventType type) { this.type = type; }

  public GameBoard getInitialBoard() { return this.initialBoard; }
  public void setInitialBoard(GameBoard initialBoard) { this.initialBoard = initialBoard; }

  public PlayerState[] getPlayers() { return this.players; }
  public void setPlayers(PlayerState[] players) { this.players = players; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}