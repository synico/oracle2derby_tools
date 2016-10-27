package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMFTSKMBREL;

public class CMFTSKMBRELRowMapper<T> implements RowMapper<CMFTSKMBREL> {

    private static final Logger log = Logger.getLogger(CMFTSKMBRELRowMapper.class);

	@Override
	public CMFTSKMBREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMFTSKMBREL obj = new CMFTSKMBREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setCMFTASK_ID(rs.getBigDecimal("CMFTASK_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
