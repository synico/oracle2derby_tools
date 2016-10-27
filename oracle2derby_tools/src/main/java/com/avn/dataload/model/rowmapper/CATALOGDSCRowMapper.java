package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATALOGDSC;

public class CATALOGDSCRowMapper<T> implements RowMapper<CATALOGDSC> {

    private static final Logger log = Logger.getLogger(CATALOGDSCRowMapper.class);

	@Override
	public CATALOGDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATALOGDSC obj = new CATALOGDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setTHUMBNAIL(rs.getString("THUMBNAIL"));
		obj.setFULLIMAGE(rs.getString("FULLIMAGE"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSHORTDESCRIPTION(rs.getString("SHORTDESCRIPTION"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
