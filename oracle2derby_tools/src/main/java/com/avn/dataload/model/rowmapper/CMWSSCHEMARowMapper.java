package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CMWSSCHEMA;

public class CMWSSCHEMARowMapper<T> implements RowMapper<CMWSSCHEMA> {

    private static final Logger log = Logger.getLogger(CMWSSCHEMARowMapper.class);

	@Override
	public CMWSSCHEMA mapRow(ResultSet rs, int rowNum) throws SQLException {
		CMWSSCHEMA obj = new CMWSSCHEMA();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setWORKSPACE(rs.getString("WORKSPACE"));
		obj.setCMWSSCHEMA_ID(rs.getBigDecimal("CMWSSCHEMA_ID"));
		obj.setWRITESCHEMA(rs.getString("WRITESCHEMA"));
		obj.setSYNCREQUIRED(rs.getBigDecimal("SYNCREQUIRED"));
		obj.setBASESCHEMA(rs.getString("BASESCHEMA"));
		obj.setREADSCHEMA(rs.getString("READSCHEMA"));
		obj.setALLOCATED(rs.getBigDecimal("ALLOCATED"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
