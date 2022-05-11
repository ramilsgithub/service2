package service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @GetMapping("/")
  public Greeting handle(@RequestParam("name") String name) {
    return new Greeting(String.format("2 Hello, %s!", name));
  }

}
