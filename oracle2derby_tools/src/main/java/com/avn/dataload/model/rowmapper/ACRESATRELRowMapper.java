package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESATREL;

public class ACRESATRELRowMapper<T> implements RowMapper<ACRESATREL> {

    private static final Logger log = Logger.getLogger(ACRESATRELRowMapper.class);

	@Override
	public ACRESATREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESATREL obj = new ACRESATREL();
		
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setATTRTBLNAME(rs.getString("ATTRTBLNAME"));
		obj.setATTRCOLNAME(rs.getString("ATTRCOLNAME"));
		obj.setRESKEYCOLNAME(rs.getString("RESKEYCOLNAME"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setACATTR_ID(rs.getBigDecimal("ACATTR_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
