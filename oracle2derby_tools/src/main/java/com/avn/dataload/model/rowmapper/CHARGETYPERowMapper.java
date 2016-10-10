package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CHARGETYPE;

public class CHARGETYPERowMapper<T> implements RowMapper<CHARGETYPE> {

	@Override
	public CHARGETYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CHARGETYPE obj = new CHARGETYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setCODE(rs.getString("CODE"));
		obj.setCHARGETYPE_ID(rs.getBigDecimal("CHARGETYPE_ID"));
		obj.setDISPLAYAGGREGATED(rs.getString("DISPLAYAGGREGATED"));
		
		return obj;
	}

}
