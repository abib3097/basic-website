package com.rest;

import com.api.Jeep;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for a Jeep endpoint
 */
@RestController("/buymyjeep")
public class JeepController {
  /**
   * Default Constructor.
   */
  public JeepController() {

  }

  /**
   * Find Jeeps.
   * @return List of Jeeps.
   */
  @GetMapping("/buymyjeep")
  public List<Jeep> getInventory() {
    Jeep jeep = new Jeep();
    jeep.setId("id");
    jeep.setMake("Jeep");
    jeep.setModel("Wrangler");
    jeep.setYear(2010);
    jeep.setColor("Black");
    jeep.setTransmission("Manual");
    jeep.setMiles(100000);
    ArrayList<Jeep> jeeps = new ArrayList<>();
    return jeeps;
  }
}
