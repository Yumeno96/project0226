package kr.co.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.study.dto.LoginDto;
import kr.co.study.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService service;


	@RequestMapping("login_check")
	public ModelAndView loginCheck(@ModelAttribute("home") LoginDto dto) {

		ModelAndView mv= service.loginCheck(dto);

		return mv;
	}



}
