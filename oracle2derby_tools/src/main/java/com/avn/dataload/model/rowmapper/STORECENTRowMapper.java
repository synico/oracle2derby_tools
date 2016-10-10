package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORECENT;

public class STORECENTRowMapper<T> implements RowMapper<STORECENT> {

	@Override
	public STORECENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORECENT obj = new STORECENT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		
		return obj;
	}

}
