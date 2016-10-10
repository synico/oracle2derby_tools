package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_USAGE;

public class PX_USAGERowMapper<T> implements RowMapper<PX_USAGE> {

	@Override
	public PX_USAGE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_USAGE obj = new PX_USAGE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setVERSION(rs.getBigDecimal("VERSION"));
		obj.setGUESTID(rs.getString("GUESTID"));
		obj.setPX_USAGE_ID(rs.getBigDecimal("PX_USAGE_ID"));
		
		return obj;
	}

}
