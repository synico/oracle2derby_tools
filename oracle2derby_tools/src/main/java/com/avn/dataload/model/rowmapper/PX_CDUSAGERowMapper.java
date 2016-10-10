package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_CDUSAGE;

public class PX_CDUSAGERowMapper<T> implements RowMapper<PX_CDUSAGE> {

	@Override
	public PX_CDUSAGE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_CDUSAGE obj = new PX_CDUSAGE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATUS(rs.getBigDecimal("STATUS"));
		obj.setOWNER_ID(rs.getBigDecimal("OWNER_ID"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setVALIDFROM(rs.getTimestamp("VALIDFROM"));
		obj.setVALIDUNTIL(rs.getTimestamp("VALIDUNTIL"));
		obj.setPX_CDPOOL_ID(rs.getBigDecimal("PX_CDPOOL_ID"));
		obj.setPX_CDUSAGE_ID(rs.getBigDecimal("PX_CDUSAGE_ID"));
		
		return obj;
	}

}
