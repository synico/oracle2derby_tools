package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Userdemo;

public class UserdemoRowMapper<T> implements RowMapper<Userdemo> {

	@Override
	public Userdemo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Userdemo obj = new Userdemo();
		
		obj.setField4(rs.getString("FIELD4"));
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setField5(rs.getString("FIELD5"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setMaritalstatus(rs.getString("MARITALSTATUS"));
		obj.setIncomecurrency(rs.getString("INCOMECURRENCY"));
		obj.setCompanyname(rs.getString("COMPANYNAME"));
		obj.setOrderbefore(rs.getString("ORDERBEFORE"));
		obj.setDateofbirth(rs.getDate("DATEOFBIRTH"));
		obj.setField6(rs.getBigDecimal("FIELD6"));
		obj.setGender(rs.getString("GENDER"));
		obj.setAge(rs.getBigDecimal("AGE"));
		obj.setIncome(rs.getBigDecimal("INCOME"));
		obj.setChildren(rs.getBigDecimal("CHILDREN"));
		obj.setHousehold(rs.getBigDecimal("HOUSEHOLD"));
		obj.setHobbies(rs.getString("HOBBIES"));
		obj.setTimezone(rs.getString("TIMEZONE"));
		obj.setField7(rs.getString("FIELD7"));
		
		return obj;
	}

}
