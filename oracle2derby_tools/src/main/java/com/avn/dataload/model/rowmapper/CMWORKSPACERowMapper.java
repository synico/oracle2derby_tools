package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMWORKSPACE;

public class CMWORKSPACERowMapper<T> implements RowMapper<CMWORKSPACE> {

	@Override
	public CMWORKSPACE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMWORKSPACE obj = new CMWORKSPACE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setWORKSPACE(rs.getString("WORKSPACE"));
		obj.setLOCKING_POLICY(rs.getString("LOCKING_POLICY"));
		
		return obj;
	}

}
