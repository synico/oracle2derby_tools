package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_CDPOOL;

public class PX_CDPOOLRowMapper<T> implements RowMapper<PX_CDPOOL> {

    private static final Logger log = Logger.getLogger(PX_CDPOOLRowMapper.class);

	@Override
	public PX_CDPOOL mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_CDPOOL obj = new PX_CDPOOL();
		
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setREFERENCE_ID(rs.getBigDecimal("REFERENCE_ID"));
		obj.setPX_CDPOOL_ID(rs.getBigDecimal("PX_CDPOOL_ID"));
		obj.setTRANSFERABLE(rs.getBigDecimal("TRANSFERABLE"));
		obj.setINTERNAL_ID(rs.getBigDecimal("INTERNAL_ID"));
		obj.setWORKSPACE(rs.getString("WORKSPACE"));
		obj.setCODE(rs.getString("CODE"));
		obj.setUSAGETYPE(rs.getBigDecimal("USAGETYPE"));
		obj.setVALIDFROM(rs.getTimestamp("VALIDFROM"));
		obj.setVALIDUNTIL(rs.getTimestamp("VALIDUNTIL"));
		obj.setTASKGROUP(rs.getString("TASKGROUP"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
