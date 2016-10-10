package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMELESTATS;

public class DMELESTATSRowMapper<T> implements RowMapper<DMELESTATS> {

	@Override
	public DMELESTATS mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMELESTATS obj = new DMELESTATS();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setCOUNTER(rs.getBigDecimal("COUNTER"));
		obj.setDMELEMENT_ID(rs.getBigDecimal("DMELEMENT_ID"));
		
		return obj;
	}

}
