package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALMETHOD;

public class CALMETHODRowMapper<T> implements RowMapper<CALMETHOD> {

    private static final Logger log = Logger.getLogger(CALMETHODRowMapper.class);

	@Override
	public CALMETHOD mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALMETHOD obj = new CALMETHOD();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCALUSAGE_ID(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setTASKNAME(rs.getString("TASKNAME"));
		obj.setSUBCLASS(rs.getBigDecimal("SUBCLASS"));
		obj.setCALMETHOD_ID(rs.getBigDecimal("CALMETHOD_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
