package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PATTRVALUE;

public class PATTRVALUERowMapper<T> implements RowMapper<PATTRVALUE> {

	@Override
	public PATTRVALUE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PATTRVALUE obj = new PATTRVALUE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setSTRINGVALUE(rs.getString("STRINGVALUE"));
		obj.setINTEGERVALUE(rs.getBigDecimal("INTEGERVALUE"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setFLOATVALUE(rs.getBigDecimal("FLOATVALUE"));
		obj.setMANDATORY(rs.getBigDecimal("MANDATORY"));
		obj.setPATTRIBUTE_ID(rs.getBigDecimal("PATTRIBUTE_ID"));
		obj.setENCRYPTFLAG(rs.getBigDecimal("ENCRYPTFLAG"));
		obj.setPATTRVALUE_ID(rs.getBigDecimal("PATTRVALUE_ID"));
		obj.setBIGINTVALUE(rs.getBigDecimal("BIGINTVALUE"));
		obj.setATTACHMENT_ID(rs.getBigDecimal("ATTACHMENT_ID"));
		obj.setRFQRSPPROD_ID(rs.getBigDecimal("RFQRSPPROD_ID"));
		obj.setDATEVALUE(rs.getTimestamp("DATEVALUE"));
		obj.setCHANGEABLE(rs.getBigDecimal("CHANGEABLE"));
		obj.setRFQPROD_ID(rs.getBigDecimal("RFQPROD_ID"));
		obj.setOPERATOR_ID(rs.getBigDecimal("OPERATOR_ID"));
		obj.setORDERITEMS_ID(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setTERMCOND_ID(rs.getBigDecimal("TERMCOND_ID"));
		obj.setCORRELATIONGROUP(rs.getBigDecimal("CORRELATIONGROUP"));
		
		return obj;
	}

}
