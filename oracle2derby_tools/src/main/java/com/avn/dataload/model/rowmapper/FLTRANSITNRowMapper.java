package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FLTRANSITN;

public class FLTRANSITNRowMapper<T> implements RowMapper<FLTRANSITN> {

	@Override
	public FLTRANSITN mapRow(ResultSet rs, int rowNum) throws SQLException {
		FLTRANSITN obj = new FLTRANSITN();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPRIORITY(rs.getBigDecimal("PRIORITY"));
		obj.setFLOW_ID(rs.getBigDecimal("FLOW_ID"));
		obj.setAPPROVAL(rs.getBigDecimal("APPROVAL"));
		obj.setSPAWNTYPE(rs.getBigDecimal("SPAWNTYPE"));
		obj.setRESPONSEVIEWNAME(rs.getString("RESPONSEVIEWNAME"));
		obj.setFLTRANSITN_ID(rs.getBigDecimal("FLTRANSITN_ID"));
		obj.setSOURCESTATE_ID(rs.getBigDecimal("SOURCESTATE_ID"));
		obj.setTARGETSTATE_ID(rs.getBigDecimal("TARGETSTATE_ID"));
		obj.setEVENTIDENTIFIER(rs.getString("EVENTIDENTIFIER"));
		obj.setACTIONINTERFACE(rs.getString("ACTIONINTERFACE"));
		obj.setACCESSCTRLGUARD(rs.getString("ACCESSCTRLGUARD"));
		obj.setBUSINESSLOGICGUARD(rs.getString("BUSINESSLOGICGUARD"));
		obj.setSPAWNFLWTYPE_ID(rs.getBigDecimal("SPAWNFLWTYPE_ID"));
		
		return obj;
	}

}
