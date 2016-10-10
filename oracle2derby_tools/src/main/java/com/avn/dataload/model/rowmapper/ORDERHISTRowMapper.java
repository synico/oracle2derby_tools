package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDERHIST;

public class ORDERHISTRowMapper<T> implements RowMapper<ORDERHIST> {

	@Override
	public ORDERHIST mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDERHIST obj = new ORDERHIST();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getTimestamp("FIELD3"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setORDXML(rs.getClob("ORDXML"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setORDERVERSION(rs.getBigDecimal("ORDERVERSION"));
		
		return obj;
	}

}
