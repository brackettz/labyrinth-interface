public class GameStateUpdateEventPayload implements SlashGame {
  private EventType type;
  private GameBoard board;
  private PlayerState[] players;
  private String currentPlayerId;
  private TurnState currentTurnState;
  private Map<String, Object> additionalProperties;

  public EventType getType() { return this.type; }
  public void setType(EventType type) { this.type = type; }

  public GameBoard getBoard() { return this.board; }
  public void setBoard(GameBoard board) { this.board = board; }

  public PlayerState[] getPlayers() { return this.players; }
  public void setPlayers(PlayerState[] players) { this.players = players; }

  public String getCurrentPlayerId() { return this.currentPlayerId; }
  public void setCurrentPlayerId(String currentPlayerId) { this.currentPlayerId = currentPlayerId; }

  public TurnState getCurrentTurnState() { return this.currentTurnState; }
  public void setCurrentTurnState(TurnState currentTurnState) { this.currentTurnState = currentTurnState; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}