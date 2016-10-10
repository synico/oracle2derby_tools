package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_CDSPEC;

public class PX_CDSPECRowMapper<T> implements RowMapper<PX_CDSPEC> {

	@Override
	public PX_CDSPEC mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_CDSPEC obj = new PX_CDSPEC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPX_PROMOTION_ID(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setCODETYPE(rs.getBigDecimal("CODETYPE"));
		obj.setVALIDFROM(rs.getTimestamp("VALIDFROM"));
		obj.setVALIDUNTIL(rs.getTimestamp("VALIDUNTIL"));
		obj.setPATTERN(rs.getString("PATTERN"));
		obj.setCODESTATUS(rs.getBigDecimal("CODESTATUS"));
		obj.setCOUNT(rs.getBigDecimal("COUNT"));
		obj.setTRANSFERABLE(rs.getBigDecimal("TRANSFERABLE"));
		
		return obj;
	}

}
