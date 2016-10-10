package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.QTYUNITDSC;

public class QTYUNITDSCRowMapper<T> implements RowMapper<QTYUNITDSC> {

	@Override
	public QTYUNITDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		QTYUNITDSC obj = new QTYUNITDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		
		return obj;
	}

}
