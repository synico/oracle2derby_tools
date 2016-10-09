package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Userreg;

public class UserregRowMapper<T> implements RowMapper<Userreg> {

	@Override
	public Userreg mapRow(ResultSet rs, int rowNum) throws SQLException {
		Userreg obj = new Userreg();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setPasswordcreation(rs.getDate("PASSWORDCREATION"));
		obj.setPasswordexpired(rs.getBigDecimal("PASSWORDEXPIRED"));
		obj.setChallengequestion(rs.getString("CHALLENGEQUESTION"));
		obj.setChallengeanswer(rs.getString("CHALLENGEANSWER"));
		obj.setPasswordretries(rs.getBigDecimal("PASSWORDRETRIES"));
		obj.setPasswordinvalid(rs.getDate("PASSWORDINVALID"));
		obj.setLogonpassword(rs.getbyte[]("LOGONPASSWORD"));
		obj.setPlcyacctId(rs.getBigDecimal("PLCYACCT_ID"));
		obj.setTimeout(rs.getBigDecimal("TIMEOUT"));
		obj.setSalt(rs.getString("SALT"));
		obj.setLogonid(rs.getString("LOGONID"));
		
		return obj;
	}

}
