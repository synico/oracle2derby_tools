package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.LANGPAIR;

public class LANGPAIRRowMapper<T> implements RowMapper<LANGPAIR> {

	@Override
	public LANGPAIR mapRow(ResultSet rs, int rowNum) throws SQLException {
		LANGPAIR obj = new LANGPAIR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLANGUAGE_ID_ALT(rs.getBigDecimal("LANGUAGE_ID_ALT"));
		
		return obj;
	}

}
