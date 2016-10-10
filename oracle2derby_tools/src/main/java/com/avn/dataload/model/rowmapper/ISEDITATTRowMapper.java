package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ISEDITATT;

public class ISEDITATTRowMapper<T> implements RowMapper<ISEDITATT> {

	@Override
	public ISEDITATT mapRow(ResultSet rs, int rowNum) throws SQLException {
		ISEDITATT obj = new ISEDITATT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPROFILE_ID(rs.getBigDecimal("PROFILE_ID"));
		obj.setCUSTOMIZABLE(rs.getBigDecimal("CUSTOMIZABLE"));
		obj.setISEDITATT_ID(rs.getBigDecimal("ISEDITATT_ID"));
		obj.setINTERSPECATTNAME(rs.getString("INTERSPECATTNAME"));
		obj.setINTERSPECATTVALUE(rs.getString("INTERSPECATTVALUE"));
		
		return obj;
	}

}
