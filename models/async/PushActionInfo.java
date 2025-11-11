public class PushActionInfo {
  private Integer rowOrColIndex;
  private Direction direction;
  private Map<String, Object> additionalProperties;

  public Integer getRowOrColIndex() { return this.rowOrColIndex; }
  public void setRowOrColIndex(Integer rowOrColIndex) { this.rowOrColIndex = rowOrColIndex; }

  public Direction getDirection() { return this.direction; }
  public void setDirection(Direction direction) { this.direction = direction; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}