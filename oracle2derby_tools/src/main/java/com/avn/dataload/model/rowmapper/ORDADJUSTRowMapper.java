package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDADJUST;

public class ORDADJUSTRowMapper<T> implements RowMapper<ORDADJUST> {

    private static final Logger log = Logger.getLogger(ORDADJUSTRowMapper.class);

	@Override
	public ORDADJUST mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDADJUST obj = new ORDADJUST();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setORDADJUST_ID(rs.getBigDecimal("ORDADJUST_ID"));
		obj.setCALUSAGE_ID(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setAMOUNT(rs.getBigDecimal("AMOUNT"));
		obj.setCALCODE_ID(rs.getBigDecimal("CALCODE_ID"));
		obj.setDISPLAYLEVEL(rs.getBigDecimal("DISPLAYLEVEL"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
