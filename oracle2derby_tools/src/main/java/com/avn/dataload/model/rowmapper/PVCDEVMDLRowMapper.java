package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PVCDEVMDL;

public class PVCDEVMDLRowMapper<T> implements RowMapper<PVCDEVMDL> {

    private static final Logger log = Logger.getLogger(PVCDEVMDLRowMapper.class);

	@Override
	public PVCDEVMDL mapRow(ResultSet rs, int rowNum) throws SQLException {
		PVCDEVMDL obj = new PVCDEVMDL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSESSIONTYPE(rs.getString("SESSIONTYPE"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setVENDOR(rs.getString("VENDOR"));
		obj.setMODEL_ID(rs.getBigDecimal("MODEL_ID"));
		obj.setMODELNAME(rs.getString("MODELNAME"));
		obj.setDEVMDLNAME(rs.getString("DEVMDLNAME"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
