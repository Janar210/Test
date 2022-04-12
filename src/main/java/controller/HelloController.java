package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping("/yahoo")
	public ModelAndView a()
	{

		ModelAndView a=new ModelAndView();
		a.addObject("msg","How are you ?");
		a.setViewName("HelloPage");
		return a;
	}
	@RequestMapping("/google")
	public ModelAndView b()
	
	{
		ModelAndView b=new ModelAndView();
		b.addObject("msg","I'm fine, what about you ?");
		b.setViewName("HelloPage");;
		return b;
	}
}