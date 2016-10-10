package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.JURSTGROUP;

public class JURSTGROUPRowMapper<T> implements RowMapper<JURSTGROUP> {

	@Override
	public JURSTGROUP mapRow(ResultSet rs, int rowNum) throws SQLException {
		JURSTGROUP obj = new JURSTGROUP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setCODE(rs.getString("CODE"));
		obj.setSUBCLASS(rs.getBigDecimal("SUBCLASS"));
		obj.setJURSTGROUP_ID(rs.getBigDecimal("JURSTGROUP_ID"));
		
		return obj;
	}

}
