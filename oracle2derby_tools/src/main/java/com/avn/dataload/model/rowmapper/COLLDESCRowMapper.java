package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.COLLDESC;

public class COLLDESCRowMapper<T> implements RowMapper<COLLDESC> {

	@Override
	public COLLDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		COLLDESC obj = new COLLDESC();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setLOCATION(rs.getString("LOCATION"));
		obj.setCOLLATERAL_ID(rs.getBigDecimal("COLLATERAL_ID"));
		obj.setMARKETINGTEXT(rs.getString("MARKETINGTEXT"));
		obj.setLONGMKTGTEXT(rs.getClob("LONGMKTGTEXT"));
		
		return obj;
	}

}
