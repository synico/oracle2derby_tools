package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BASEITMDSC;

public class BASEITMDSCRowMapper<T> implements RowMapper<BASEITMDSC> {

	@Override
	public BASEITMDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		BASEITMDSC obj = new BASEITMDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSHORTDESCRIPTION(rs.getString("SHORTDESCRIPTION"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setBASEITEM_ID(rs.getBigDecimal("BASEITEM_ID"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		
		return obj;
	}

}
