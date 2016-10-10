package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMEMSPOTSTATS;

public class DMEMSPOTSTATSRowMapper<T> implements RowMapper<DMEMSPOTSTATS> {

	@Override
	public DMEMSPOTSTATS mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMEMSPOTSTATS obj = new DMEMSPOTSTATS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setEMSPOT_ID(rs.getBigDecimal("EMSPOT_ID"));
		obj.setVIEWS(rs.getBigDecimal("VIEWS"));
		obj.setCLICKS(rs.getBigDecimal("CLICKS"));
		obj.setDMACTIVITY_ID(rs.getBigDecimal("DMACTIVITY_ID"));
		
		return obj;
	}

}
