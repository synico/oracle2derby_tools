package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMEMSPOTORD;

public class DMEMSPOTORDRowMapper<T> implements RowMapper<DMEMSPOTORD> {

    private static final Logger log = Logger.getLogger(DMEMSPOTORDRowMapper.class);

	@Override
	public DMEMSPOTORD mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMEMSPOTORD obj = new DMEMSPOTORD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setINTERFACENAME(rs.getString("INTERFACENAME"));
		obj.setCONTENTTYPE(rs.getString("CONTENTTYPE"));
		obj.setDMEMSPOTORD_ID(rs.getBigDecimal("DMEMSPOTORD_ID"));
		obj.setORDERINGNAME(rs.getString("ORDERINGNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
