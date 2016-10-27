package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.QTYUNITDSC;

public class QTYUNITDSCRowMapper<T> implements RowMapper<QTYUNITDSC> {

    private static final Logger log = Logger.getLogger(QTYUNITDSCRowMapper.class);

	@Override
	public QTYUNITDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		QTYUNITDSC obj = new QTYUNITDSC();
		
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
