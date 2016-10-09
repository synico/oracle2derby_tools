package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxCoupon;

public class PxCouponRowMapper<T> implements RowMapper<PxCoupon> {

	@Override
	public PxCoupon mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxCoupon obj = new PxCoupon();
		
		obj.setName(rs.getString("NAME"));
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setCode(rs.getString("CODE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setVersion(rs.getBigDecimal("VERSION"));
		obj.setPxCouponId(rs.getBigDecimal("PX_COUPON_ID"));
		obj.setEffective(rs.getDate("EFFECTIVE"));
		obj.setExpire(rs.getDate("EXPIRE"));
		obj.setGuestid(rs.getString("GUESTID"));
		
		return obj;
	}

}
