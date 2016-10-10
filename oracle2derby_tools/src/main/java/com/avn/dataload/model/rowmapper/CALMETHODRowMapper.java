package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALMETHOD;

public class CALMETHODRowMapper<T> implements RowMapper<CALMETHOD> {

	@Override
	public CALMETHOD mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALMETHOD obj = new CALMETHOD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setTASKNAME(rs.getString("TASKNAME"));
		obj.setSUBCLASS(rs.getBigDecimal("SUBCLASS"));
		obj.setCALUSAGE_ID(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setCALMETHOD_ID(rs.getBigDecimal("CALMETHOD_ID"));
		
		return obj;
	}

}
