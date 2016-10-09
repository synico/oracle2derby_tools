package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xpcatentdesc;

public class XpcatentdescRowMapper<T> implements RowMapper<Xpcatentdesc> {

	@Override
	public Xpcatentdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xpcatentdesc obj = new Xpcatentdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setKitinclude(rs.getString("KITINCLUDE"));
		obj.setProductapplications(rs.getString("PRODUCTAPPLICATIONS"));
		
		return obj;
	}

}
