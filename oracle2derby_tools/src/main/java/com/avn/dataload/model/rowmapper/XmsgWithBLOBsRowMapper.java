package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XmsgWithBLOBs;

public class XmsgWithBLOBsRowMapper<T> implements RowMapper<XmsgWithBLOBs> {

	@Override
	public XmsgWithBLOBs mapRow(ResultSet rs, int rowNum) throws SQLException {
		XmsgWithBLOBs obj = new XmsgWithBLOBs();
		
		obj.setField4(rs.getbyte[]("FIELD4"));
		obj.setRequest(rs.getbyte[]("REQUEST"));
		obj.setResponse(rs.getbyte[]("RESPONSE"));
		
		return obj;
	}

}
