package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CTXDATA;

public class CTXDATARowMapper<T> implements RowMapper<CTXDATA> {

	@Override
	public CTXDATA mapRow(ResultSet rs, int rowNum) throws SQLException {
		CTXDATA obj = new CTXDATA();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSERVALUE(rs.getString("SERVALUE"));
		obj.setACTIVITY_ID(rs.getBigDecimal("ACTIVITY_ID"));
		
		return obj;
	}

}
