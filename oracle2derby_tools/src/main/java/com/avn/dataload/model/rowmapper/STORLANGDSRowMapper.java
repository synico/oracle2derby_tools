package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STORLANGDS;

public class STORLANGDSRowMapper<T> implements RowMapper<STORLANGDS> {

    private static final Logger log = Logger.getLogger(STORLANGDSRowMapper.class);

	@Override
	public STORLANGDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		STORLANGDS obj = new STORLANGDS();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLANGUAGE_ID_DESC(rs.getBigDecimal("LANGUAGE_ID_DESC"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
