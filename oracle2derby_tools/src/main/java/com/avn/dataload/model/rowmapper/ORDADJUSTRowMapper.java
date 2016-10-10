package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDADJUST;

public class ORDADJUSTRowMapper<T> implements RowMapper<ORDADJUST> {

	@Override
	public ORDADJUST mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDADJUST obj = new ORDADJUST();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAMOUNT(rs.getBigDecimal("AMOUNT"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		obj.setCALUSAGE_ID(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setDISPLAYLEVEL(rs.getBigDecimal("DISPLAYLEVEL"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setORDADJUST_ID(rs.getBigDecimal("ORDADJUST_ID"));
		
		return obj;
	}

}
