package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxCdusage;

public class PxCdusageRowMapper<T> implements RowMapper<PxCdusage> {

	@Override
	public PxCdusage mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxCdusage obj = new PxCdusage();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setPxCdusageId(rs.getBigDecimal("PX_CDUSAGE_ID"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setOwnerId(rs.getBigDecimal("OWNER_ID"));
		obj.setPxCdpoolId(rs.getBigDecimal("PX_CDPOOL_ID"));
		obj.setValidfrom(rs.getDate("VALIDFROM"));
		obj.setValiduntil(rs.getDate("VALIDUNTIL"));
		
		return obj;
	}

}
