package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.ChkarrangKey;

public class ChkarrangKeyRowMapper<T> implements RowMapper<ChkarrangKey> {

	@Override
	public ChkarrangKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		ChkarrangKey obj = new ChkarrangKey();
		
		obj.setChkcmdId(rs.getBigDecimal("CHKCMD_ID"));
		obj.setSchcmdId(rs.getBigDecimal("SCHCMD_ID"));
		
		return obj;
	}

}
