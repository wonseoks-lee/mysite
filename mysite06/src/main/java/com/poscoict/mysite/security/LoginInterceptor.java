package com.poscoict.mysite.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.poscoict.mysite.service.UserService;
import com.poscoict.mysite.vo.UserVo;

@SuppressWarnings("deprecation")
public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	private UserService userService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserVo authUser = userService.getUser(email, password);
		if(authUser==null) {
			request.setAttribute("result", "fail");
			request.setAttribute("email", email);
			//viewResolver가 작동하는 공간이 아니므로 직접 경로설정해준다 
			request.getRequestDispatcher("/WEB-INF/views/user/login.jsp").forward(request, response);
			return false;
		}
		
		//session 
		HttpSession session = request.getSession(true);
		session.setAttribute("authUser", authUser);
		response.sendRedirect(request.getContextPath());
		return false;
	}
	
}
