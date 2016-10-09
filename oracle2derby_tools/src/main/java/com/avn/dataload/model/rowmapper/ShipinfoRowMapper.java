package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Shipinfo;

public class ShipinfoRowMapper<T> implements RowMapper<Shipinfo> {

	@Override
	public Shipinfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Shipinfo obj = new Shipinfo();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAddressId(rs.getBigDecimal("ADDRESS_ID"));
		obj.setCarrieraccntnum(rs.getString("CARRIERACCNTNUM"));
		obj.setInstructions(rs.getString("INSTRUCTIONS"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setShipmodeId(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setShipinfoId(rs.getBigDecimal("SHIPINFO_ID"));
		obj.setPolicyId(rs.getBigDecimal("POLICY_ID"));
		
		return obj;
	}

}
