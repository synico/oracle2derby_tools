package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_CDSPEC;

public class PX_CDSPECRowMapper<T> implements RowMapper<PX_CDSPEC> {

    private static final Logger log = Logger.getLogger(PX_CDSPECRowMapper.class);

	@Override
	public PX_CDSPEC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_CDSPEC obj = new PX_CDSPEC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTRANSFERABLE(rs.getBigDecimal("TRANSFERABLE"));
		obj.setPX_PROMOTION_ID(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setCOUNT(rs.getBigDecimal("COUNT"));
		obj.setCODETYPE(rs.getBigDecimal("CODETYPE"));
		obj.setVALIDFROM(rs.getTimestamp("VALIDFROM"));
		obj.setVALIDUNTIL(rs.getTimestamp("VALIDUNTIL"));
		obj.setPATTERN(rs.getString("PATTERN"));
		obj.setCODESTATUS(rs.getBigDecimal("CODESTATUS"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
