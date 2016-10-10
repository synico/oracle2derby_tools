package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SCHCMD;

public class SCHCMDRowMapper<T> implements RowMapper<SCHCMD> {

	@Override
	public SCHCMD mapRow(ResultSet rs, int rowNum) throws SQLException {
		SCHCMD obj = new SCHCMD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setSCHCMD_ID(rs.getBigDecimal("SCHCMD_ID"));
		obj.setPATHINFO(rs.getString("PATHINFO"));
		
		return obj;
	}

}
