package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.JURSTGPREL;

public class JURSTGPRELRowMapper<T> implements RowMapper<JURSTGPREL> {

	@Override
	public JURSTGPREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		JURSTGPREL obj = new JURSTGPREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSUBCLASS(rs.getBigDecimal("SUBCLASS"));
		obj.setJURST_ID(rs.getBigDecimal("JURST_ID"));
		obj.setJURSTGROUP_ID(rs.getBigDecimal("JURSTGROUP_ID"));
		
		return obj;
	}

}
