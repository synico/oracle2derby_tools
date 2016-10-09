package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Shipmode;

public class ShipmodeRowMapper<T> implements RowMapper<Shipmode> {

	@Override
	public Shipmode mapRow(ResultSet rs, int rowNum) throws SQLException {
		Shipmode obj = new Shipmode();
		
		obj.setCode(rs.getString("CODE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setTrackingname(rs.getString("TRACKINGNAME"));
		obj.setTrackingurl(rs.getString("TRACKINGURL"));
		obj.setTrackinghost(rs.getString("TRACKINGHOST"));
		obj.setTrackingport(rs.getBigDecimal("TRACKINGPORT"));
		obj.setTrackingicon(rs.getString("TRACKINGICON"));
		obj.setTrackingtype(rs.getString("TRACKINGTYPE"));
		obj.setShipmodeId(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setCarrier(rs.getString("CARRIER"));
		
		return obj;
	}

}
