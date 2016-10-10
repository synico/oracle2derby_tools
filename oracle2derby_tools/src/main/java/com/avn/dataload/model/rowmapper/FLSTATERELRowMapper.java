package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLSTATEREL;

public class FLSTATERELRowMapper<T> implements RowMapper<FLSTATEREL> {

	@Override
	public FLSTATEREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLSTATEREL obj = new FLSTATEREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFLSTATEDCT_ID(rs.getBigDecimal("FLSTATEDCT_ID"));
		obj.setFLOW_ID(rs.getBigDecimal("FLOW_ID"));
		obj.setENTRYACTNINTERFACE(rs.getString("ENTRYACTNINTERFACE"));
		obj.setEXITACTNINTERFACE(rs.getString("EXITACTNINTERFACE"));
		obj.setRESPONSEVIEWNAME(rs.getString("RESPONSEVIEWNAME"));
		
		return obj;
	}

}
