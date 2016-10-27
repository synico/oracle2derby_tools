package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATENTDESC;

public class CATENTDESCRowMapper<T> implements RowMapper<CATENTDESC> {

    private static final Logger log = Logger.getLogger(CATENTDESCRowMapper.class);

	@Override
	public CATENTDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATENTDESC obj = new CATENTDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setTHUMBNAIL(rs.getString("THUMBNAIL"));
		obj.setFULLIMAGE(rs.getString("FULLIMAGE"));
		obj.setXMLDETAIL(rs.getString("XMLDETAIL"));
		obj.setAVAILABLE(rs.getBigDecimal("AVAILABLE"));
		obj.setKEYWORD(rs.getString("KEYWORD"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSHORTDESCRIPTION(rs.getString("SHORTDESCRIPTION"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setPUBLISHED(rs.getBigDecimal("PUBLISHED"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setAUXDESCRIPTION1(rs.getString("AUXDESCRIPTION1"));
		obj.setAUXDESCRIPTION2(rs.getString("AUXDESCRIPTION2"));
		obj.setAVAILABILITYDATE(rs.getTimestamp("AVAILABILITYDATE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
