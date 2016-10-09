package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Staddress;

public class StaddressRowMapper<T> implements RowMapper<Staddress> {

	@Override
	public Staddress mapRow(ResultSet rs, int rowNum) throws SQLException {
		Staddress obj = new Staddress();
		
		obj.setState(rs.getString("STATE"));
		obj.setPersontitle(rs.getString("PERSONTITLE"));
		obj.setBusinesstitle(rs.getString("BUSINESSTITLE"));
		obj.setShippinggeocode(rs.getString("SHIPPINGGEOCODE"));
		obj.setStaddressId(rs.getBigDecimal("STADDRESS_ID"));
		obj.setUrl(rs.getString("URL"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setLastname(rs.getString("LASTNAME"));
		obj.setFirstname(rs.getString("FIRSTNAME"));
		obj.setMiddlename(rs.getString("MIDDLENAME"));
		obj.setPhone1(rs.getString("PHONE1"));
		obj.setFax1(rs.getString("FAX1"));
		obj.setPhone2(rs.getString("PHONE2"));
		obj.setAddress1(rs.getString("ADDRESS1"));
		obj.setFax2(rs.getString("FAX2"));
		obj.setNickname(rs.getString("NICKNAME"));
		obj.setAddress2(rs.getString("ADDRESS2"));
		obj.setAddress3(rs.getString("ADDRESS3"));
		obj.setCity(rs.getString("CITY"));
		obj.setCountry(rs.getString("COUNTRY"));
		obj.setZipcode(rs.getString("ZIPCODE"));
		obj.setEmail1(rs.getString("EMAIL1"));
		obj.setEmail2(rs.getString("EMAIL2"));
		obj.setTaxgeocode(rs.getString("TAXGEOCODE"));
		
		return obj;
	}

}
