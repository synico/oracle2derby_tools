package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CURLIST;

public class CURLISTRowMapper<T> implements RowMapper<CURLIST> {

	@Override
	public CURLIST mapRow(ResultSet rs, int rowNum) throws SQLException {
		CURLIST obj = new CURLIST();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setCURRSTR(rs.getString("CURRSTR"));
		
		return obj;
	}

}
