package akhouse.spring.basic.home;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home/*")
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	@RequestMapping(value="test")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		ModelAndView vi = new ModelAndView("home");
		
		vi.addObject("boardList", homeService.getBoard());
		
		System.out.println("boardlist gogogo ##############################");
		
		return vi;
		
	}
}
