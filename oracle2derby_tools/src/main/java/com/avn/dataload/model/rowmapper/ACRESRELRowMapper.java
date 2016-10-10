package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESREL;

public class ACRESRELRowMapper<T> implements RowMapper<ACRESREL> {

	@Override
	public ACRESREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESREL obj = new ACRESREL();
		
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setRESRELCOL(rs.getString("RESRELCOL"));
		obj.setRESJOINCOL(rs.getString("RESJOINCOL"));
		obj.setRESRELTABLE(rs.getString("RESRELTABLE"));
		obj.setRESRELMEMCOL(rs.getString("RESRELMEMCOL"));
		obj.setRESRELKEYCOL(rs.getString("RESRELKEYCOL"));
		obj.setRESOURCETYPE(rs.getString("RESOURCETYPE"));
		obj.setACRELATION_ID(rs.getBigDecimal("ACRELATION_ID"));
		
		return obj;
	}

}
