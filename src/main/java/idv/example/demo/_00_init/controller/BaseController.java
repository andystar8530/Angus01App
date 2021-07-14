package idv.example.demo._00_init.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@SessionAttributes({"LoginOK"}) 
public class BaseController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
