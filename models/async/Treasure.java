public class Treasure {
  private int id;
  private String name;
  private Map<String, Object> additionalProperties;

  public int getId() { return this.id; }
  public void setId(int id) { this.id = id; }

  public String getName() { return this.name; }
  public void setName(String name) { this.name = name; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}