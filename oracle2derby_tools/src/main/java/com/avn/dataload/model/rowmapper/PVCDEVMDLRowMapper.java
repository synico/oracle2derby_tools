package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PVCDEVMDL;

public class PVCDEVMDLRowMapper<T> implements RowMapper<PVCDEVMDL> {

	@Override
	public PVCDEVMDL mapRow(ResultSet rs, int rowNum) throws SQLException {
		PVCDEVMDL obj = new PVCDEVMDL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setSESSIONTYPE(rs.getString("SESSIONTYPE"));
		obj.setVENDOR(rs.getString("VENDOR"));
		obj.setMODEL_ID(rs.getBigDecimal("MODEL_ID"));
		obj.setMODELNAME(rs.getString("MODELNAME"));
		obj.setDEVMDLNAME(rs.getString("DEVMDLNAME"));
		
		return obj;
	}

}
