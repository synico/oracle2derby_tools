package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLSTATEREL;

public class FLSTATERELRowMapper<T> implements RowMapper<FLSTATEREL> {

    private static final Logger log = Logger.getLogger(FLSTATERELRowMapper.class);

	@Override
	public FLSTATEREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLSTATEREL obj = new FLSTATEREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLSTATEDCT_ID(rs.getBigDecimal("FLSTATEDCT_ID"));
		obj.setENTRYACTNINTERFACE(rs.getString("ENTRYACTNINTERFACE"));
		obj.setEXITACTNINTERFACE(rs.getString("EXITACTNINTERFACE"));
		obj.setRESPONSEVIEWNAME(rs.getString("RESPONSEVIEWNAME"));
		obj.setFLOW_ID(rs.getBigDecimal("FLOW_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
