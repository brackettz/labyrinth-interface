public class GameBoard {
  private Integer rows;
  private Integer cols;
  private Tile[][] tiles;
  private PushActionInfo lastPush;
  private Map<String, Object> additionalProperties;

  public Integer getRows() { return this.rows; }
  public void setRows(Integer rows) { this.rows = rows; }

  public Integer getCols() { return this.cols; }
  public void setCols(Integer cols) { this.cols = cols; }

  public Tile[][] getTiles() { return this.tiles; }
  public void setTiles(Tile[][] tiles) { this.tiles = tiles; }

  public PushActionInfo getLastPush() { return this.lastPush; }
  public void setLastPush(PushActionInfo lastPush) { this.lastPush = lastPush; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}