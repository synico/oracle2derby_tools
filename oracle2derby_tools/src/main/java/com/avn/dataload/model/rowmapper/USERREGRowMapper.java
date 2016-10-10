package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.USERREG;

public class USERREGRowMapper<T> implements RowMapper<USERREG> {

	@Override
	public USERREG mapRow(ResultSet rs, int rowNum) throws SQLException {
		USERREG obj = new USERREG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setUSERS_ID(rs.getBigDecimal("USERS_ID"));
		obj.setPASSWORDCREATION(rs.getTimestamp("PASSWORDCREATION"));
		obj.setLOGONPASSWORD(rs.getBytes("LOGONPASSWORD"));
		obj.setPASSWORDEXPIRED(rs.getBigDecimal("PASSWORDEXPIRED"));
		obj.setCHALLENGEQUESTION(rs.getString("CHALLENGEQUESTION"));
		obj.setCHALLENGEANSWER(rs.getString("CHALLENGEANSWER"));
		obj.setPASSWORDRETRIES(rs.getBigDecimal("PASSWORDRETRIES"));
		obj.setPASSWORDINVALID(rs.getTimestamp("PASSWORDINVALID"));
		obj.setTIMEOUT(rs.getBigDecimal("TIMEOUT"));
		obj.setSALT(rs.getString("SALT"));
		obj.setLOGONID(rs.getString("LOGONID"));
		obj.setPLCYACCT_ID(rs.getBigDecimal("PLCYACCT_ID"));
		
		return obj;
	}

}
