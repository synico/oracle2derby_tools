package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CSEDITATT;

public class CSEDITATTRowMapper<T> implements RowMapper<CSEDITATT> {

	@Override
	public CSEDITATT mapRow(ResultSet rs, int rowNum) throws SQLException {
		CSEDITATT obj = new CSEDITATT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setPROFILE_ID(rs.getBigDecimal("PROFILE_ID"));
		obj.setCSEDITATT_ID(rs.getBigDecimal("CSEDITATT_ID"));
		obj.setTRANSPORT_ID(rs.getBigDecimal("TRANSPORT_ID"));
		obj.setINSTANCE_NUM(rs.getBigDecimal("INSTANCE_NUM"));
		obj.setCUSTOMIZABLE(rs.getBigDecimal("CUSTOMIZABLE"));
		obj.setCONNSPECATTNAME(rs.getString("CONNSPECATTNAME"));
		obj.setCONNSPECATTVALUE(rs.getString("CONNSPECATTVALUE"));
		
		return obj;
	}

}
