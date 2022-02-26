package kr.co.study.service;

import org.springframework.web.servlet.ModelAndView;

import kr.co.study.dto.LoginDto;

public interface LoginService {

	ModelAndView loginCheck(LoginDto dto);

}
