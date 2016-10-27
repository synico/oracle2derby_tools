package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_USAGE;

public class PX_USAGERowMapper<T> implements RowMapper<PX_USAGE> {

    private static final Logger log = Logger.getLogger(PX_USAGERowMapper.class);

	@Override
	public PX_USAGE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_USAGE obj = new PX_USAGE();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setGUESTID(rs.getString("GUESTID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setVERSION(rs.getBigDecimal("VERSION"));
		obj.setPX_USAGE_ID(rs.getBigDecimal("PX_USAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
