/* Copyright 2019 objective partner AG, all rights reserved */
package sample_app.products.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mkawka
 *
 */
@RestController
public class ProductResources {
  @RequestMapping("/")
  public String init() {
      return "Greetings from Spring Boot!";
  }

}
