package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALSCALE;

public class CALSCALERowMapper<T> implements RowMapper<CALSCALE> {

    private static final Logger log = Logger.getLogger(CALSCALERowMapper.class);

	@Override
	public CALSCALE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALSCALE obj = new CALSCALE();
		
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCALUSAGE_ID(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setCODE(rs.getString("CODE"));
		obj.setCALMETHOD_ID(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setCALSCALE_ID(rs.getBigDecimal("CALSCALE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
