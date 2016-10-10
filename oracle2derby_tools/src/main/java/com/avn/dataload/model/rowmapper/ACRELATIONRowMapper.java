package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRELATION;

public class ACRELATIONRowMapper<T> implements RowMapper<ACRELATION> {

	@Override
	public ACRELATION mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRELATION obj = new ACRELATION();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACRELATION_ID(rs.getBigDecimal("ACRELATION_ID"));
		obj.setRELATIONNAME(rs.getString("RELATIONNAME"));
		
		return obj;
	}

}
