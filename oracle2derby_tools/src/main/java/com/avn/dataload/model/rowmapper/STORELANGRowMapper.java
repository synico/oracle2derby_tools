package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORELANG;

public class STORELANGRowMapper<T> implements RowMapper<STORELANG> {

	@Override
	public STORELANG mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORELANG obj = new STORELANG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		
		return obj;
	}

}
