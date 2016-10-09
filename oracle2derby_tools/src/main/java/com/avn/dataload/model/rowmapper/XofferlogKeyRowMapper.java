package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XofferlogKey;

public class XofferlogKeyRowMapper<T> implements RowMapper<XofferlogKey> {

	@Override
	public XofferlogKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XofferlogKey obj = new XofferlogKey();
		
		obj.setCustomerid(rs.getString("CUSTOMERID"));
		obj.setMinquantity(rs.getString("MINQUANTITY"));
		obj.setCatentrypartnumber(rs.getString("CATENTRYPARTNUMBER"));
		
		return obj;
	}

}
