package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.QTYUNIT;

public class QTYUNITRowMapper<T> implements RowMapper<QTYUNIT> {

    private static final Logger log = Logger.getLogger(QTYUNITRowMapper.class);

	@Override
	public QTYUNIT mapRow(ResultSet rs, int rowNum) throws SQLException {
		QTYUNIT obj = new QTYUNIT();
		
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
