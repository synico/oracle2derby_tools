package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.SrchattrpropKey;

public class SrchattrpropKeyRowMapper<T> implements RowMapper<SrchattrpropKey> {

	@Override
	public SrchattrpropKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		SrchattrpropKey obj = new SrchattrpropKey();
		
		obj.setPropertyname(rs.getString("PROPERTYNAME"));
		obj.setSrchattrId(rs.getBigDecimal("SRCHATTR_ID"));
		
		return obj;
	}

}
