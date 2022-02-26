package kr.co.study.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.study.dto.LoginDto;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	// SqlSessionTemplate를 불러와서 DB의 접속과 sql문 실행을 담당하게 한다.
	SqlSessionTemplate sqlsession;

	@Override
	public int LoginCheck(LoginDto dto) {

		int result = sqlsession.selectOne("Login.selectLoginCount", dto);

		return result;
	}

}
