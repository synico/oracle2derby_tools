package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Manifest;

public class ManifestRowMapper<T> implements RowMapper<Manifest> {

	@Override
	public Manifest mapRow(ResultSet rs, int rowNum) throws SQLException {
		Manifest obj = new Manifest();
		
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setWeightmeasure(rs.getString("WEIGHTMEASURE"));
		obj.setOrdreleasenum(rs.getBigDecimal("ORDRELEASENUM"));
		obj.setManifeststatus(rs.getString("MANIFESTSTATUS"));
		obj.setShippingcosts(rs.getBigDecimal("SHIPPINGCOSTS"));
		obj.setDateshipped(rs.getDate("DATESHIPPED"));
		obj.setPickuprecordid(rs.getString("PICKUPRECORDID"));
		obj.setWeight(rs.getBigDecimal("WEIGHT"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setManifestId(rs.getBigDecimal("MANIFEST_ID"));
		obj.setShipmodeId(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setPackageid(rs.getString("PACKAGEID"));
		obj.setTrackingid(rs.getString("TRACKINGID"));
		
		return obj;
	}

}
