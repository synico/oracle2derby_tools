package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDCHGRSNDS;

public class ORDCHGRSNDSRowMapper<T> implements RowMapper<ORDCHGRSNDS> {

    private static final Logger log = Logger.getLogger(ORDCHGRSNDSRowMapper.class);

	@Override
	public ORDCHGRSNDS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDCHGRSNDS obj = new ORDCHGRSNDS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setORDCHGRSN_ID(rs.getBigDecimal("ORDCHGRSN_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
