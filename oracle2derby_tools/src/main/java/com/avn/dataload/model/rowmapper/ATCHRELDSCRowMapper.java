package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHRELDSC;

public class ATCHRELDSCRowMapper<T> implements RowMapper<ATCHRELDSC> {

	@Override
	public ATCHRELDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHRELDSC obj = new ATCHRELDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setATCHRELDSC_ID(rs.getBigDecimal("ATCHRELDSC_ID"));
		obj.setSHORTDESCRIPTION(rs.getString("SHORTDESCRIPTION"));
		obj.setLONGDESCRIPTION(rs.getString("LONGDESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setATCHREL_ID(rs.getBigDecimal("ATCHREL_ID"));
		
		return obj;
	}

}
