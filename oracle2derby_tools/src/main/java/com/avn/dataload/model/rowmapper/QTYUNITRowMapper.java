package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.QTYUNIT;

public class QTYUNITRowMapper<T> implements RowMapper<QTYUNIT> {

	@Override
	public QTYUNIT mapRow(ResultSet rs, int rowNum) throws SQLException {
		QTYUNIT obj = new QTYUNIT();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		
		return obj;
	}

}
