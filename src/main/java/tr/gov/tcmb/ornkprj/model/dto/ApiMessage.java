package tr.gov.tcmb.ornkprj.model.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiMessage {

  private List<String> message = new ArrayList<>();

  public ApiMessage() {
    //
  }

  public ApiMessage(List<String> message) {
    this.message = message;
  }

  public ApiMessage(String... messages) {

    for (int i = 0; i < messages.length; i++) {
      this.message.add(messages[i]);
    }

  }


}
