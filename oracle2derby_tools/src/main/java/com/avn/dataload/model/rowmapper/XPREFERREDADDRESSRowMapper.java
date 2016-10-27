package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XPREFERREDADDRESS;

public class XPREFERREDADDRESSRowMapper<T> implements RowMapper<XPREFERREDADDRESS> {

    private static final Logger log = Logger.getLogger(XPREFERREDADDRESSRowMapper.class);

	@Override
	public XPREFERREDADDRESS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XPREFERREDADDRESS obj = new XPREFERREDADDRESS();
		
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setORGANIZATION_ID(rs.getBigDecimal("ORGANIZATION_ID"));
		obj.setFLAG(rs.getString("FLAG"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
