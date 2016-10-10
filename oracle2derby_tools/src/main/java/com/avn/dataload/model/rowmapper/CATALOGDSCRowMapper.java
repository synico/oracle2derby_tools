package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CATALOGDSC;

public class CATALOGDSCRowMapper<T> implements RowMapper<CATALOGDSC> {

	@Override
	public CATALOGDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CATALOGDSC obj = new CATALOGDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSHORTDESCRIPTION(rs.getString("SHORTDESCRIPTION"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCATALOG_ID(rs.getBigDecimal("CATALOG_ID"));
		obj.setTHUMBNAIL(rs.getString("THUMBNAIL"));
		obj.setFULLIMAGE(rs.getString("FULLIMAGE"));
		
		return obj;
	}

}
