package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CPENDORDER;

public class CPENDORDERRowMapper<T> implements RowMapper<CPENDORDER> {

	@Override
	public CPENDORDER mapRow(ResultSet rs, int rowNum) throws SQLException {
		CPENDORDER obj = new CPENDORDER();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		return obj;
	}

}
