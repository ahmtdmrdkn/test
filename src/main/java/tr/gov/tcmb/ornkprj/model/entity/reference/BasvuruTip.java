package tr.gov.tcmb.ornkprj.model.entity.reference;

public enum BasvuruTip {

  TIP_1(1), TIP_13(2);

  private int value;

  private BasvuruTip(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

}
