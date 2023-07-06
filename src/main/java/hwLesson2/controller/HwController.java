package hwLesson2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HwController {

  @RequestMapping("/myHomework")
//attribute RequestMapping guaranty that http request to the page /myHomework
// lead to execution of method myHomework()

  public String myHomework(
      @RequestParam(value = "name", required = false, defaultValue = "Alex")
// attribute RequestParam connected value "name" with parameter "name" in method myHomework()
// and parameter name added to the model object
      String name,
      Model model) {
    model.addAttribute("name", name);
    return "myHomework";
  }
}
