package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_COUPON;

public class PX_COUPONRowMapper<T> implements RowMapper<PX_COUPON> {

    private static final Logger log = Logger.getLogger(PX_COUPONRowMapper.class);

	@Override
	public PX_COUPON mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_COUPON obj = new PX_COUPON();
		
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setPX_COUPON_ID(rs.getBigDecimal("PX_COUPON_ID"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setCODE(rs.getString("CODE"));
		obj.setEFFECTIVE(rs.getTimestamp("EFFECTIVE"));
		obj.setEXPIRE(rs.getTimestamp("EXPIRE"));
		obj.setGUESTID(rs.getString("GUESTID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setVERSION(rs.getBigDecimal("VERSION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
