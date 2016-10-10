package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.TAGCLASS;

public class TAGCLASSRowMapper<T> implements RowMapper<TAGCLASS> {

	@Override
	public TAGCLASS mapRow(ResultSet rs, int rowNum) throws SQLException {
		TAGCLASS obj = new TAGCLASS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setTAGCLASSNAME(rs.getString("TAGCLASSNAME"));
		obj.setTAGNAME(rs.getString("TAGNAME"));
		
		return obj;
	}

}
