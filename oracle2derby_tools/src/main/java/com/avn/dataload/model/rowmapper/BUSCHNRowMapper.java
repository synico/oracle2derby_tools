package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.BUSCHN;

public class BUSCHNRowMapper<T> implements RowMapper<BUSCHN> {

	@Override
	public BUSCHN mapRow(ResultSet rs, int rowNum) throws SQLException {
		BUSCHN obj = new BUSCHN();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTATE(rs.getString("STATE"));
		obj.setBUSCHN_ID(rs.getBigDecimal("BUSCHN_ID"));
		
		return obj;
	}

}
