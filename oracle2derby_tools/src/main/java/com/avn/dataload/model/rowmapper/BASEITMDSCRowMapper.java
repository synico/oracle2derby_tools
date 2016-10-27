package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BASEITMDSC;

public class BASEITMDSCRowMapper<T> implements RowMapper<BASEITMDSC> {

    private static final Logger log = Logger.getLogger(BASEITMDSCRowMapper.class);

	@Override
	public BASEITMDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		BASEITMDSC obj = new BASEITMDSC();
		
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSHORTDESCRIPTION(rs.getString("SHORTDESCRIPTION"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setBASEITEM_ID(rs.getBigDecimal("BASEITEM_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
