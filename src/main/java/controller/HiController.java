package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HiController {
	@RequestMapping("/yahoo")
	public ModelAndView a()
	{
		ModelAndView a=new ModelAndView();
		a.setViewName("HiPage");
		return a;
	}
	@RequestMapping("/google")
	public ModelAndView b()
	
	{
		ModelAndView b=new ModelAndView();
		b.addObject("msg","Not eligible get lost");
		b.setViewName("HiPage");;
		return b;
	}
}