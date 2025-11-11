public class UsePushFixedCommandPayload {
  private CommandType type;
  private int rowOrColIndex;
  private Direction direction;
  private Direction[] tileEntrances;
  private Map<String, Object> additionalProperties;

  public CommandType getType() { return this.type; }
  public void setType(CommandType type) { this.type = type; }

  public int getRowOrColIndex() { return this.rowOrColIndex; }
  public void setRowOrColIndex(int rowOrColIndex) { this.rowOrColIndex = rowOrColIndex; }

  public Direction getDirection() { return this.direction; }
  public void setDirection(Direction direction) { this.direction = direction; }

  public Direction[] getTileEntrances() { return this.tileEntrances; }
  public void setTileEntrances(Direction[] tileEntrances) { this.tileEntrances = tileEntrances; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}