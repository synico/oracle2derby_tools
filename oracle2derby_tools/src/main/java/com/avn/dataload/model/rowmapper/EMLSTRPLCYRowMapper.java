package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EMLSTRPLCY;

public class EMLSTRPLCYRowMapper<T> implements RowMapper<EMLSTRPLCY> {

	@Override
	public EMLSTRPLCY mapRow(ResultSet rs, int rowNum) throws SQLException {
		EMLSTRPLCY obj = new EMLSTRPLCY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setEMLPOLICY_ID(rs.getBigDecimal("EMLPOLICY_ID"));
		
		return obj;
	}

}
