package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESATREL;

public class ACRESATRELRowMapper<T> implements RowMapper<ACRESATREL> {

	@Override
	public ACRESATREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESATREL obj = new ACRESATREL();
		
		obj.setATTRTBLNAME(rs.getString("ATTRTBLNAME"));
		obj.setATTRCOLNAME(rs.getString("ATTRCOLNAME"));
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setACATTR_ID(rs.getBigDecimal("ACATTR_ID"));
		obj.setRESKEYCOLNAME(rs.getString("RESKEYCOLNAME"));
		
		return obj;
	}

}
