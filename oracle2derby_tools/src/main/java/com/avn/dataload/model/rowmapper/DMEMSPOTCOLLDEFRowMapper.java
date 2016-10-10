package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMEMSPOTCOLLDEF;

public class DMEMSPOTCOLLDEFRowMapper<T> implements RowMapper<DMEMSPOTCOLLDEF> {

	@Override
	public DMEMSPOTCOLLDEF mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMEMSPOTCOLLDEF obj = new DMEMSPOTCOLLDEF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setEMSPOT_ID(rs.getBigDecimal("EMSPOT_ID"));
		obj.setCOLLATERAL_ID(rs.getBigDecimal("COLLATERAL_ID"));
		obj.setDMEMSPOTCOLLDEF_ID(rs.getBigDecimal("DMEMSPOTCOLLDEF_ID"));
		
		return obj;
	}

}
