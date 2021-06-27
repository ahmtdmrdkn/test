package tr.gov.tcmb.ornkprj.model.entity.reference;

public enum BirimOnayDurum {

  ONAY_BEKLIYOR(1, "Onay Bekliyor"), ONAYLANDI(2, "Onaylandı"), REDDEDILDI(3, "Reddedildi");

  private int id;
  private String label;

  private BirimOnayDurum(int id, String label) {
    this.id = id;
    this.label = label;
  }

  public int getId() {
    return id;
  }

  public String getLabel() {
    return label;
  }

}
