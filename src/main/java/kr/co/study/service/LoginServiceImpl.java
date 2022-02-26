package kr.co.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import kr.co.study.dao.LoginDao;
import kr.co.study.dto.LoginDto;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao dao;

	@Override
	public ModelAndView loginCheck(LoginDto dto) {

		ModelAndView mv = new ModelAndView();

		int result = dao.LoginCheck(dto);

		if(result > 0) {
			if("0001".equals(dto.getStaff_number())) {
				mv.setViewName("admin");
			} else {
				mv.setViewName("working_hours_info");
			}
		} else {
			mv.setViewName("home");
			mv.addObject("msg", "사원번호 또는 비밀번호가 일치하지 않습니다.");
		}

		return mv;
	}

}
