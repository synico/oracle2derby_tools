package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMEMSPOTCOLLDEF;

public class DMEMSPOTCOLLDEFRowMapper<T> implements RowMapper<DMEMSPOTCOLLDEF> {

    private static final Logger log = Logger.getLogger(DMEMSPOTCOLLDEFRowMapper.class);

	@Override
	public DMEMSPOTCOLLDEF mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMEMSPOTCOLLDEF obj = new DMEMSPOTCOLLDEF();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCOLLATERAL_ID(rs.getBigDecimal("COLLATERAL_ID"));
		obj.setDMEMSPOTCOLLDEF_ID(rs.getBigDecimal("DMEMSPOTCOLLDEF_ID"));
		obj.setEMSPOT_ID(rs.getBigDecimal("EMSPOT_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
