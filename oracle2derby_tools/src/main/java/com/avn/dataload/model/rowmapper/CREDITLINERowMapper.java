package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CREDITLINE;

public class CREDITLINERowMapper<T> implements RowMapper<CREDITLINE> {

    private static final Logger log = Logger.getLogger(CREDITLINERowMapper.class);

	@Override
	public CREDITLINE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CREDITLINE obj = new CREDITLINE();
		
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACCOUNT_ID(rs.getBigDecimal("ACCOUNT_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setCREDITLINE_ID(rs.getBigDecimal("CREDITLINE_ID"));
		obj.setCREDITLIMIT(rs.getBigDecimal("CREDITLIMIT"));
		obj.setDECIMALFIELD1(rs.getBigDecimal("DECIMALFIELD1"));
		obj.setDECIMALFIELD2(rs.getBigDecimal("DECIMALFIELD2"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
