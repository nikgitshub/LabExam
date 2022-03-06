package springMVCFirst.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController 
{
	@RequestMapping("/home")
	public ModelAndView home() 
	{
		return new ModelAndView("home","message","Welcome to Spring MVC Application");
	}
}
