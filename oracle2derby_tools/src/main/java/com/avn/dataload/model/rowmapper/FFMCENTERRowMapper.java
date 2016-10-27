package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.FFMCENTER;

public class FFMCENTERRowMapper<T> implements RowMapper<FFMCENTER> {

    private static final Logger log = Logger.getLogger(FFMCENTERRowMapper.class);

	@Override
	public FFMCENTER mapRow(ResultSet rs, int rowNum) throws SQLException {
		FFMCENTER obj = new FFMCENTER();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setDEFAULTSHIPOFFSET(rs.getBigDecimal("DEFAULTSHIPOFFSET"));
		obj.setEXTFFMSTORENUM(rs.getString("EXTFFMSTORENUM"));
		obj.setINVENTORYOPFLAGS(rs.getBigDecimal("INVENTORYOPFLAGS"));
		obj.setPICKDELAYINMIN(rs.getBigDecimal("PICKDELAYINMIN"));
		obj.setMAXNUMPICK(rs.getBigDecimal("MAXNUMPICK"));
		obj.setDROPSHIP(rs.getString("DROPSHIP"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
