package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDIADJUST;

public class ORDIADJUSTRowMapper<T> implements RowMapper<ORDIADJUST> {

	@Override
	public ORDIADJUST mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDIADJUST obj = new ORDIADJUST();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAMOUNT(rs.getBigDecimal("AMOUNT"));
		obj.setORDIADJUST_ID(rs.getBigDecimal("ORDIADJUST_ID"));
		obj.setORDADJUST_ID(rs.getBigDecimal("ORDADJUST_ID"));
		obj.setORDERITEMS_ID(rs.getBigDecimal("ORDERITEMS_ID"));
		
		return obj;
	}

}
