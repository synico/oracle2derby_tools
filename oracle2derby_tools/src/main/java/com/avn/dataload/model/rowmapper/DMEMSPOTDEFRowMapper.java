package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMEMSPOTDEF;

public class DMEMSPOTDEFRowMapper<T> implements RowMapper<DMEMSPOTDEF> {

    private static final Logger log = Logger.getLogger(DMEMSPOTDEFRowMapper.class);

	@Override
	public DMEMSPOTDEF mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMEMSPOTDEF obj = new DMEMSPOTDEF();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDMEMSPOTDEF_ID(rs.getBigDecimal("DMEMSPOTDEF_ID"));
		obj.setCONTENTTYPE(rs.getString("CONTENTTYPE"));
		obj.setCONTENT(rs.getString("CONTENT"));
		obj.setEMSPOT_ID(rs.getBigDecimal("EMSPOT_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
