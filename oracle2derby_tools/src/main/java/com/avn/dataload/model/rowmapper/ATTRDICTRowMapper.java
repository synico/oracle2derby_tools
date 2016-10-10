package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATTRDICT;

public class ATTRDICTRowMapper<T> implements RowMapper<ATTRDICT> {

	@Override
	public ATTRDICT mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATTRDICT obj = new ATTRDICT();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setATTRDICT_ID(rs.getBigDecimal("ATTRDICT_ID"));
		
		return obj;
	}

}
