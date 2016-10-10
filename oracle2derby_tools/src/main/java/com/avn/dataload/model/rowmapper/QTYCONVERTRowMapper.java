package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.QTYCONVERT;

public class QTYCONVERTRowMapper<T> implements RowMapper<QTYCONVERT> {

	@Override
	public QTYCONVERT mapRow(ResultSet rs, int rowNum) throws SQLException {
		QTYCONVERT obj = new QTYCONVERT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFACTOR(rs.getBigDecimal("FACTOR"));
		obj.setUPDATABLE(rs.getString("UPDATABLE"));
		obj.setMULTIPLYORDIVIDE(rs.getString("MULTIPLYORDIVIDE"));
		obj.setQTYUNIT_ID_TO(rs.getString("QTYUNIT_ID_TO"));
		obj.setQTYCONVERT_ID(rs.getBigDecimal("QTYCONVERT_ID"));
		obj.setQTYUNIT_ID_FROM(rs.getString("QTYUNIT_ID_FROM"));
		
		return obj;
	}

}
