package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ACRESCGRY;

public class ACRESCGRYRowMapper<T> implements RowMapper<ACRESCGRY> {

    private static final Logger log = Logger.getLogger(ACRESCGRYRowMapper.class);

	@Override
	public ACRESCGRY mapRow(ResultSet rs, int rowNum) throws SQLException {
		ACRESCGRY obj = new ACRESCGRY();
		
		obj.setRESJOINKEY(rs.getString("RESJOINKEY"));
		obj.setACRESCGRY_ID(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setRESPRIMARYTABLE(rs.getString("RESPRIMARYTABLE"));
		obj.setRESOWNERTABLE(rs.getString("RESOWNERTABLE"));
		obj.setRESOWNERCOL(rs.getString("RESOWNERCOL"));
		obj.setRESKEYOWNCOL(rs.getString("RESKEYOWNCOL"));
		obj.setRESCLASSNAME(rs.getString("RESCLASSNAME"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
