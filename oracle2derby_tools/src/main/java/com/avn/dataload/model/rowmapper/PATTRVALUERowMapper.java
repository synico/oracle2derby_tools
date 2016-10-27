package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PATTRVALUE;

public class PATTRVALUERowMapper<T> implements RowMapper<PATTRVALUE> {

    private static final Logger log = Logger.getLogger(PATTRVALUERowMapper.class);

	@Override
	public PATTRVALUE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PATTRVALUE obj = new PATTRVALUE();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setOPERATOR_ID(rs.getBigDecimal("OPERATOR_ID"));
		obj.setPATTRIBUTE_ID(rs.getBigDecimal("PATTRIBUTE_ID"));
		obj.setENCRYPTFLAG(rs.getBigDecimal("ENCRYPTFLAG"));
		obj.setPATTRVALUE_ID(rs.getBigDecimal("PATTRVALUE_ID"));
		obj.setBIGINTVALUE(rs.getBigDecimal("BIGINTVALUE"));
		obj.setATTACHMENT_ID(rs.getBigDecimal("ATTACHMENT_ID"));
		obj.setRFQRSPPROD_ID(rs.getBigDecimal("RFQRSPPROD_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCORRELATIONGROUP(rs.getBigDecimal("CORRELATIONGROUP"));
		obj.setORDERITEMS_ID(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setMANDATORY(rs.getBigDecimal("MANDATORY"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setSTRINGVALUE(rs.getString("STRINGVALUE"));
		obj.setINTEGERVALUE(rs.getBigDecimal("INTEGERVALUE"));
		obj.setFLOATVALUE(rs.getBigDecimal("FLOATVALUE"));
		obj.setTERMCOND_ID(rs.getBigDecimal("TERMCOND_ID"));
		obj.setDATEVALUE(rs.getTimestamp("DATEVALUE"));
		obj.setCHANGEABLE(rs.getBigDecimal("CHANGEABLE"));
		obj.setRFQPROD_ID(rs.getBigDecimal("RFQPROD_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
