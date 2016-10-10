package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XPREFERREDADDRESS;

public class XPREFERREDADDRESSRowMapper<T> implements RowMapper<XPREFERREDADDRESS> {

	@Override
	public XPREFERREDADDRESS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XPREFERREDADDRESS obj = new XPREFERREDADDRESS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setORGANIZATION_ID(rs.getBigDecimal("ORGANIZATION_ID"));
		obj.setFLAG(rs.getString("FLAG"));
		
		return obj;
	}

}
