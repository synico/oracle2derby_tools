package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOTOKENUSGTYPE;

public class SEOTOKENUSGTYPERowMapper<T> implements RowMapper<SEOTOKENUSGTYPE> {

	@Override
	public SEOTOKENUSGTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOTOKENUSGTYPE obj = new SEOTOKENUSGTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setISSTATIC(rs.getBigDecimal("ISSTATIC"));
		obj.setTOKENUSGTYPE_ID(rs.getBigDecimal("TOKENUSGTYPE_ID"));
		obj.setTOKENUSGTYPE(rs.getString("TOKENUSGTYPE"));
		obj.setPRIMARYTOKEN(rs.getString("PRIMARYTOKEN"));
		
		return obj;
	}

}
