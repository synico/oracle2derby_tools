package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.USERPWDHST;

public class USERPWDHSTRowMapper<T> implements RowMapper<USERPWDHST> {

	@Override
	public USERPWDHST mapRow(ResultSet rs, int rowNum) throws SQLException {
		USERPWDHST obj = new USERPWDHST();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setUSERPWDHST_ID(rs.getBigDecimal("USERPWDHST_ID"));
		obj.setPREVLOGONPASSWORD(rs.getBytes("PREVLOGONPASSWORD"));
		obj.setPASSWORDCREATION(rs.getTimestamp("PASSWORDCREATION"));
		obj.setSALT(rs.getString("SALT"));
		
		return obj;
	}

}
