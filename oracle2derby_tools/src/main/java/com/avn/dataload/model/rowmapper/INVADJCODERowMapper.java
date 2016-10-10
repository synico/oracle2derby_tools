package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.INVADJCODE;

public class INVADJCODERowMapper<T> implements RowMapper<INVADJCODE> {

	@Override
	public INVADJCODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		INVADJCODE obj = new INVADJCODE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setADJUSTCODE(rs.getString("ADJUSTCODE"));
		obj.setINVADJCODE_ID(rs.getBigDecimal("INVADJCODE_ID"));
		
		return obj;
	}

}
