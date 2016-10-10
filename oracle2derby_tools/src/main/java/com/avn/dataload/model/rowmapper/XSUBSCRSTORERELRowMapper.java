package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XSUBSCRSTOREREL;

public class XSUBSCRSTORERELRowMapper<T> implements RowMapper<XSUBSCRSTOREREL> {

	@Override
	public XSUBSCRSTOREREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSUBSCRSTOREREL obj = new XSUBSCRSTOREREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setSUBSCRIPTION_ID(rs.getBigDecimal("SUBSCRIPTION_ID"));
		
		return obj;
	}

}
