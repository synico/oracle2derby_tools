package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxUsage;

public class PxUsageRowMapper<T> implements RowMapper<PxUsage> {

	@Override
	public PxUsage mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxUsage obj = new PxUsage();
		
		obj.setName(rs.getString("NAME"));
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setVersion(rs.getBigDecimal("VERSION"));
		obj.setGuestid(rs.getString("GUESTID"));
		obj.setPxUsageId(rs.getBigDecimal("PX_USAGE_ID"));
		
		return obj;
	}

}
