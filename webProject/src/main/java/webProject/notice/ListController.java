package webProject.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//2. handleRequest가 실행됨
		
		ModelAndView mv = new ModelAndView("notice/list");
		//mv.setViewName("/WEB-INF/view/notice/index.jsp");
		
		
		return mv;
	}


}
