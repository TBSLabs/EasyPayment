package org.payeg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String landIndex(HttpServletRequest httpServletRequest,@RequestParam(name="from",required=false) String requestFrom){
		
		if(null == requestFrom){
			requestFrom = "fromWeb";
		}
		
		if(null != requestFrom && !requestFrom.equalsIgnoreCase("scheduler")){
			Integer count = (Integer) httpServletRequest.getServletContext().getAttribute("value");
			if(null == count){
				count = new Integer(1);
			}else{
				++count;
			}
			
			httpServletRequest.getServletContext().setAttribute("value", count);
			httpServletRequest.setAttribute("value", count);
		}
		return "index";
	}
}
