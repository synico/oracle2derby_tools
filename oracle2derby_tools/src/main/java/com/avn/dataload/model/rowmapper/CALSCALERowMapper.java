package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALSCALE;

public class CALSCALERowMapper<T> implements RowMapper<CALSCALE> {

	@Override
	public CALSCALE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALSCALE obj = new CALSCALE();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setCODE(rs.getString("CODE"));
		obj.setCALUSAGE_ID(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setCALMETHOD_ID(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setCALSCALE_ID(rs.getBigDecimal("CALSCALE_ID"));
		
		return obj;
	}

}
