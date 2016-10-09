package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Qtyunit;

public class QtyunitRowMapper<T> implements RowMapper<Qtyunit> {

	@Override
	public Qtyunit mapRow(ResultSet rs, int rowNum) throws SQLException {
		Qtyunit obj = new Qtyunit();
		
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		
		return obj;
	}

}
