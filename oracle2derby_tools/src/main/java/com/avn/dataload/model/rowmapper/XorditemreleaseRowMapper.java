package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xorditemrelease;

public class XorditemreleaseRowMapper<T> implements RowMapper<Xorditemrelease> {

	@Override
	public Xorditemrelease mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xorditemrelease obj = new Xorditemrelease();
		
		obj.setOrdreleasenum(rs.getLong("ORDRELEASENUM"));
		obj.setOrderitemsId(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setQuantity(rs.getBigDecimal("QUANTITY"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setXorditemreleaseId(rs.getBigDecimal("XORDITEMRELEASE_ID"));
		
		return obj;
	}

}
