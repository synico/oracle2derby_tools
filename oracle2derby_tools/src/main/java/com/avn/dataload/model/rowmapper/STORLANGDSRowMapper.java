package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORLANGDS;

public class STORLANGDSRowMapper<T> implements RowMapper<STORLANGDS> {

	@Override
	public STORLANGDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORLANGDS obj = new STORLANGDS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLANGUAGE_ID_DESC(rs.getBigDecimal("LANGUAGE_ID_DESC"));
		
		return obj;
	}

}
