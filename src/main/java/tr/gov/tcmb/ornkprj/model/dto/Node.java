package tr.gov.tcmb.ornkprj.model.dto;

import java.util.ArrayList;
import java.util.List;

public class Node {

  private Integer id;
  private String name;
  private List<Node> nodes = new ArrayList<>();

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Node> getNodes() {
    return nodes;
  }

  public void setNodes(List<Node> nodes) {
    this.nodes = nodes;
  }

}
