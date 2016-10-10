package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SHPARRANGE;

public class SHPARRANGERowMapper<T> implements RowMapper<SHPARRANGE> {

	@Override
	public SHPARRANGE mapRow(ResultSet rs, int rowNum) throws SQLException {
		SHPARRANGE obj = new SHPARRANGE();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setFLAGS(rs.getBigDecimal("FLAGS"));
		obj.setPRECEDENCE(rs.getBigDecimal("PRECEDENCE"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setSHPARRANGE_ID(rs.getBigDecimal("SHPARRANGE_ID"));
		obj.setTRACKINGNUMBER(rs.getString("TRACKINGNUMBER"));
		
		return obj;
	}

}
