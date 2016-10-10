package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CREDITLINE;

public class CREDITLINERowMapper<T> implements RowMapper<CREDITLINE> {

	@Override
	public CREDITLINE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CREDITLINE obj = new CREDITLINE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACCOUNT_ID(rs.getBigDecimal("ACCOUNT_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setCREDITLINE_ID(rs.getBigDecimal("CREDITLINE_ID"));
		obj.setCREDITLIMIT(rs.getBigDecimal("CREDITLIMIT"));
		obj.setDECIMALFIELD1(rs.getBigDecimal("DECIMALFIELD1"));
		obj.setDECIMALFIELD2(rs.getBigDecimal("DECIMALFIELD2"));
		
		return obj;
	}

}
