package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRSETCEREL;

public class PRSETCERELRowMapper<T> implements RowMapper<PRSETCEREL> {

    private static final Logger log = Logger.getLogger(PRSETCERELRowMapper.class);

	@Override
	public PRSETCEREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRSETCEREL obj = new PRSETCEREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setPRODUCTSET_ID(rs.getBigDecimal("PRODUCTSET_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
