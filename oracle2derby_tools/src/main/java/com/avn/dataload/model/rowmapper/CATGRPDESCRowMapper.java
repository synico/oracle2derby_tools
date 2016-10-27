package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATGRPDESC;

public class CATGRPDESCRowMapper<T> implements RowMapper<CATGRPDESC> {

    private static final Logger log = Logger.getLogger(CATGRPDESCRowMapper.class);

	@Override
	public CATGRPDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATGRPDESC obj = new CATGRPDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setTHUMBNAIL(rs.getString("THUMBNAIL"));
		obj.setFULLIMAGE(rs.getString("FULLIMAGE"));
		obj.setKEYWORD(rs.getString("KEYWORD"));
		obj.setDISPLAY(rs.getString("DISPLAY"));
		obj.setNOTE(rs.getString("NOTE"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSHORTDESCRIPTION(rs.getString("SHORTDESCRIPTION"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setPUBLISHED(rs.getBigDecimal("PUBLISHED"));
		obj.setCATGROUP_ID(rs.getBigDecimal("CATGROUP_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
