package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRODUCTSET;

public class PRODUCTSETRowMapper<T> implements RowMapper<PRODUCTSET> {

    private static final Logger log = Logger.getLogger(PRODUCTSETRowMapper.class);

	@Override
	public PRODUCTSET mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRODUCTSET obj = new PRODUCTSET();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setXMLDEFINITION(rs.getClob("XMLDEFINITION"));
		obj.setPUBLISHTIME(rs.getTimestamp("PUBLISHTIME"));
		obj.setPRODUCTSET_ID(rs.getBigDecimal("PRODUCTSET_ID"));
		obj.setSTATIC(rs.getString("STATIC"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
