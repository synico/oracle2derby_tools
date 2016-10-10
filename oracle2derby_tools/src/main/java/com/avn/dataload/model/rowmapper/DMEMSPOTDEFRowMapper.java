package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMEMSPOTDEF;

public class DMEMSPOTDEFRowMapper<T> implements RowMapper<DMEMSPOTDEF> {

	@Override
	public DMEMSPOTDEF mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMEMSPOTDEF obj = new DMEMSPOTDEF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setEMSPOT_ID(rs.getBigDecimal("EMSPOT_ID"));
		obj.setCONTENT(rs.getString("CONTENT"));
		obj.setDMEMSPOTDEF_ID(rs.getBigDecimal("DMEMSPOTDEF_ID"));
		obj.setCONTENTTYPE(rs.getString("CONTENTTYPE"));
		
		return obj;
	}

}
