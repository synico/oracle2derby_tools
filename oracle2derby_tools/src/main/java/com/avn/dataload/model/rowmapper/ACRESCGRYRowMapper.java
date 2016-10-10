package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESCGRY;

public class ACRESCGRYRowMapper<T> implements RowMapper<ACRESCGRY> {

	@Override
	public ACRESCGRY mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESCGRY obj = new ACRESCGRY();
		
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setRESJOINKEY(rs.getString("RESJOINKEY"));
		obj.setRESPRIMARYTABLE(rs.getString("RESPRIMARYTABLE"));
		obj.setRESOWNERTABLE(rs.getString("RESOWNERTABLE"));
		obj.setRESOWNERCOL(rs.getString("RESOWNERCOL"));
		obj.setRESKEYOWNCOL(rs.getString("RESKEYOWNCOL"));
		obj.setRESCLASSNAME(rs.getString("RESCLASSNAME"));
		
		return obj;
	}

}
