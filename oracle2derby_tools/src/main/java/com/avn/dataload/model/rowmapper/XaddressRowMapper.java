package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xaddress;

public class XaddressRowMapper<T> implements RowMapper<Xaddress> {

	@Override
	public Xaddress mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xaddress obj = new Xaddress();
		
		obj.setState(rs.getString("STATE"));
		obj.setAddresstype(rs.getString("ADDRESSTYPE"));
		obj.setSelfaddress(rs.getBigDecimal("SELFADDRESS"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setStatus(rs.getString("STATUS"));
		obj.setLastname(rs.getString("LASTNAME"));
		obj.setFirstname(rs.getString("FIRSTNAME"));
		obj.setAddress1(rs.getString("ADDRESS1"));
		obj.setAddress2(rs.getString("ADDRESS2"));
		obj.setAddress3(rs.getString("ADDRESS3"));
		obj.setCity(rs.getString("CITY"));
		obj.setCountry(rs.getString("COUNTRY"));
		obj.setZipcode(rs.getString("ZIPCODE"));
		
		return obj;
	}

}
