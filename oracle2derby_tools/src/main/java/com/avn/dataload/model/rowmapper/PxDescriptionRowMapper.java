package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxDescription;

public class PxDescriptionRowMapper<T> implements RowMapper<PxDescription> {

	@Override
	public PxDescription mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxDescription obj = new PxDescription();
		
		obj.setField4(rs.getString("FIELD4"));
		obj.setField5(rs.getString("FIELD5"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setAdmindesc(rs.getString("ADMINDESC"));
		obj.setShortdesc(rs.getString("SHORTDESC"));
		obj.setLongdesc(rs.getString("LONGDESC"));
		
		return obj;
	}

}
