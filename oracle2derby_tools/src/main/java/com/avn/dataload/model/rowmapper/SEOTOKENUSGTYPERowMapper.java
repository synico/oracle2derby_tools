package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SEOTOKENUSGTYPE;

public class SEOTOKENUSGTYPERowMapper<T> implements RowMapper<SEOTOKENUSGTYPE> {

    private static final Logger log = Logger.getLogger(SEOTOKENUSGTYPERowMapper.class);

	@Override
	public SEOTOKENUSGTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		SEOTOKENUSGTYPE obj = new SEOTOKENUSGTYPE();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setISSTATIC(rs.getBigDecimal("ISSTATIC"));
		obj.setTOKENUSGTYPE_ID(rs.getBigDecimal("TOKENUSGTYPE_ID"));
		obj.setTOKENUSGTYPE(rs.getString("TOKENUSGTYPE"));
		obj.setPRIMARYTOKEN(rs.getString("PRIMARYTOKEN"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
