package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMWORKSPACE;

public class CMWORKSPACERowMapper<T> implements RowMapper<CMWORKSPACE> {

    private static final Logger log = Logger.getLogger(CMWORKSPACERowMapper.class);

	@Override
	public CMWORKSPACE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMWORKSPACE obj = new CMWORKSPACE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setWORKSPACE(rs.getString("WORKSPACE"));
		obj.setLOCKING_POLICY(rs.getString("LOCKING_POLICY"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
