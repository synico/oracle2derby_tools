package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TERMCOND;

public class TERMCONDRowMapper<T> implements RowMapper<TERMCOND> {

    private static final Logger log = Logger.getLogger(TERMCONDRowMapper.class);

	@Override
	public TERMCOND mapRow(ResultSet rs, int rowNum) throws SQLException {
		TERMCOND obj = new TERMCOND();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setTIMECREATED(rs.getTimestamp("TIMECREATED"));
		obj.setTIMEUPDATED(rs.getTimestamp("TIMEUPDATED"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setINTEGERFIELD1(rs.getBigDecimal("INTEGERFIELD1"));
		obj.setINTEGERFIELD2(rs.getBigDecimal("INTEGERFIELD2"));
		obj.setINTEGERFIELD3(rs.getBigDecimal("INTEGERFIELD3"));
		obj.setBIGINTFIELD1(rs.getBigDecimal("BIGINTFIELD1"));
		obj.setBIGINTFIELD2(rs.getBigDecimal("BIGINTFIELD2"));
		obj.setBIGINTFIELD3(rs.getBigDecimal("BIGINTFIELD3"));
		obj.setFLOATFIELD1(rs.getBigDecimal("FLOATFIELD1"));
		obj.setFLOATFIELD2(rs.getBigDecimal("FLOATFIELD2"));
		obj.setFLOATFIELD3(rs.getBigDecimal("FLOATFIELD3"));
		obj.setDECIMALFIELD3(rs.getBigDecimal("DECIMALFIELD3"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setMANDATORY(rs.getBigDecimal("MANDATORY"));
		obj.setTERMCOND_ID(rs.getBigDecimal("TERMCOND_ID"));
		obj.setDECIMALFIELD1(rs.getBigDecimal("DECIMALFIELD1"));
		obj.setDECIMALFIELD2(rs.getBigDecimal("DECIMALFIELD2"));
		obj.setCHANGEABLE(rs.getBigDecimal("CHANGEABLE"));
		obj.setTIMEFIELD1(rs.getTimestamp("TIMEFIELD1"));
		obj.setTIMEFIELD2(rs.getTimestamp("TIMEFIELD2"));
		obj.setTIMEFIELD3(rs.getTimestamp("TIMEFIELD3"));
		obj.setTCSUBTYPE_ID(rs.getString("TCSUBTYPE_ID"));
		obj.setSTRINGFIELD1(rs.getString("STRINGFIELD1"));
		obj.setSTRINGFIELD2(rs.getString("STRINGFIELD2"));
		obj.setSTRINGFIELD3(rs.getString("STRINGFIELD3"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
