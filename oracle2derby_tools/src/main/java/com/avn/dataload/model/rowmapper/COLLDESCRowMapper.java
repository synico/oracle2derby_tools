package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.COLLDESC;

public class COLLDESCRowMapper<T> implements RowMapper<COLLDESC> {

    private static final Logger log = Logger.getLogger(COLLDESCRowMapper.class);

	@Override
	public COLLDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		COLLDESC obj = new COLLDESC();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCOLLATERAL_ID(rs.getBigDecimal("COLLATERAL_ID"));
		obj.setMARKETINGTEXT(rs.getString("MARKETINGTEXT"));
		obj.setLONGMKTGTEXT(rs.getClob("LONGMKTGTEXT"));
		obj.setLOCATION(rs.getString("LOCATION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
