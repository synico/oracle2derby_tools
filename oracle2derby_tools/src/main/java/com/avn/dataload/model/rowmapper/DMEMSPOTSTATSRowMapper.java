package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMEMSPOTSTATS;

public class DMEMSPOTSTATSRowMapper<T> implements RowMapper<DMEMSPOTSTATS> {

    private static final Logger log = Logger.getLogger(DMEMSPOTSTATSRowMapper.class);

	@Override
	public DMEMSPOTSTATS mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMEMSPOTSTATS obj = new DMEMSPOTSTATS();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDMACTIVITY_ID(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setVIEWS(rs.getBigDecimal("VIEWS"));
		obj.setCLICKS(rs.getBigDecimal("CLICKS"));
		obj.setEMSPOT_ID(rs.getBigDecimal("EMSPOT_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
