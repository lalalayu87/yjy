package webProject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//2. handleRequest가 실행됨
		System.out.println("index controller");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "Hello Spring MVC~");
		mv.setViewName("index.jsp");
		//ModelAndView를 data라는 이름으로 담아서 는 "index.jsp"에 전달
		
		return mv;
	}

}