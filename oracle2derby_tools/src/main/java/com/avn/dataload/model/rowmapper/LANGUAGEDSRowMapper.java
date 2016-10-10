package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.LANGUAGEDS;

public class LANGUAGEDSRowMapper<T> implements RowMapper<LANGUAGEDS> {

	@Override
	public LANGUAGEDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		LANGUAGEDS obj = new LANGUAGEDS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLANGUAGE_ID_DESC(rs.getBigDecimal("LANGUAGE_ID_DESC"));
		
		return obj;
	}

}
