package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMEMSPOTORD;

public class DMEMSPOTORDRowMapper<T> implements RowMapper<DMEMSPOTORD> {

	@Override
	public DMEMSPOTORD mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMEMSPOTORD obj = new DMEMSPOTORD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setINTERFACENAME(rs.getString("INTERFACENAME"));
		obj.setCONTENTTYPE(rs.getString("CONTENTTYPE"));
		obj.setDMEMSPOTORD_ID(rs.getBigDecimal("DMEMSPOTORD_ID"));
		obj.setORDERINGNAME(rs.getString("ORDERINGNAME"));
		
		return obj;
	}

}
