package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Qtyconvert;

public class QtyconvertRowMapper<T> implements RowMapper<Qtyconvert> {

	@Override
	public Qtyconvert mapRow(ResultSet rs, int rowNum) throws SQLException {
		Qtyconvert obj = new Qtyconvert();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setQtyconvertId(rs.getBigDecimal("QTYCONVERT_ID"));
		obj.setQtyunitIdTo(rs.getString("QTYUNIT_ID_TO"));
		obj.setQtyunitIdFrom(rs.getString("QTYUNIT_ID_FROM"));
		obj.setFactor(rs.getBigDecimal("FACTOR"));
		obj.setUpdatable(rs.getString("UPDATABLE"));
		obj.setMultiplyordivide(rs.getString("MULTIPLYORDIVIDE"));
		
		return obj;
	}

}
