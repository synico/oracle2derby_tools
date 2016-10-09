package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Userprof;

public class UserprofRowMapper<T> implements RowMapper<Userprof> {

	@Override
	public Userprof mapRow(ResultSet rs, int rowNum) throws SQLException {
		Userprof obj = new Userprof();
		
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setDisplayname(rs.getString("DISPLAYNAME"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setPreferreddelivery(rs.getString("PREFERREDDELIVERY"));
		obj.setPreferredcomm(rs.getString("PREFERREDCOMM"));
		obj.setPreferredmeasure(rs.getString("PREFERREDMEASURE"));
		obj.setRcvsmsnotification(rs.getBigDecimal("RCVSMSNOTIFICATION"));
		obj.setTaxpayerid(rs.getString("TAXPAYERID"));
		obj.setPhoto(rs.getString("PHOTO"));
		
		return obj;
	}

}
