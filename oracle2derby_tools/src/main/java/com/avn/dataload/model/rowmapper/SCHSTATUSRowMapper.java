package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SCHSTATUS;

public class SCHSTATUSRowMapper<T> implements RowMapper<SCHSTATUS> {

	@Override
	public SCHSTATUS mapRow(ResultSet rs, int rowNum) throws SQLException {
		SCHSTATUS obj = new SCHSTATUS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSCSINSTREFNUM(rs.getBigDecimal("SCSINSTREFNUM"));
		obj.setSCSACTLSTART(rs.getTimestamp("SCSACTLSTART"));
		obj.setSCSINSTRECOV(rs.getBigDecimal("SCSINSTRECOV"));
		obj.setSCSPREFSTART(rs.getTimestamp("SCSPREFSTART"));
		obj.setSCSSEQUENCE(rs.getBigDecimal("SCSSEQUENCE"));
		obj.setSCSJOBNBR(rs.getBigDecimal("SCSJOBNBR"));
		obj.setSCSATTLEFT(rs.getBigDecimal("SCSATTLEFT"));
		obj.setSCSEND(rs.getTimestamp("SCSEND"));
		obj.setSCSQUEUE(rs.getString("SCSQUEUE"));
		obj.setSCSRESULT(rs.getString("SCSRESULT"));
		obj.setSCSSTATE(rs.getString("SCSSTATE"));
		
		return obj;
	}

}
