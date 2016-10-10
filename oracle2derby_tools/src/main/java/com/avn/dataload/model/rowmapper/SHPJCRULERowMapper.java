package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SHPJCRULE;

public class SHPJCRULERowMapper<T> implements RowMapper<SHPJCRULE> {

	@Override
	public SHPJCRULE mapRow(ResultSet rs, int rowNum) throws SQLException {
		SHPJCRULE obj = new SHPJCRULE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPRECEDENCE(rs.getBigDecimal("PRECEDENCE"));
		obj.setCALRULE_ID(rs.getBigDecimal("CALRULE_ID"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setJURSTGROUP_ID(rs.getBigDecimal("JURSTGROUP_ID"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setSHPJCRULE_ID(rs.getBigDecimal("SHPJCRULE_ID"));
		
		return obj;
	}

}
