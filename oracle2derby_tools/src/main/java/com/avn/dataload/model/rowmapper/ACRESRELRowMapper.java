package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESREL;

public class ACRESRELRowMapper<T> implements RowMapper<ACRESREL> {

    private static final Logger log = Logger.getLogger(ACRESRELRowMapper.class);

	@Override
	public ACRESREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESREL obj = new ACRESREL();
		
		obj.setRESRELCOL(rs.getString("RESRELCOL"));
		obj.setRESJOINCOL(rs.getString("RESJOINCOL"));
		obj.setACRELATION_ID(rs.getBigDecimal("ACRELATION_ID"));
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setRESRELTABLE(rs.getString("RESRELTABLE"));
		obj.setRESRELMEMCOL(rs.getString("RESRELMEMCOL"));
		obj.setRESRELKEYCOL(rs.getString("RESRELKEYCOL"));
		obj.setRESOURCETYPE(rs.getString("RESOURCETYPE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
