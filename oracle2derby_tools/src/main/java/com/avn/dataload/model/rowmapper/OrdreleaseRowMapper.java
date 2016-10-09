package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordrelease;

public class OrdreleaseRowMapper<T> implements RowMapper<Ordrelease> {

	@Override
	public Ordrelease mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordrelease obj = new Ordrelease();
		
		obj.setFfmcenterId(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setAddressId(rs.getBigDecimal("ADDRESS_ID"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStatus(rs.getString("STATUS"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setIsexpedited(rs.getString("ISEXPEDITED"));
		obj.setFfmacknowledgement(rs.getDate("FFMACKNOWLEDGEMENT"));
		obj.setCustomerconfirm(rs.getDate("CUSTOMERCONFIRM"));
		obj.setPickbatchId(rs.getBigDecimal("PICKBATCH_ID"));
		obj.setCapturedate(rs.getDate("CAPTUREDATE"));
		obj.setPackslipxml(rs.getString("PACKSLIPXML"));
		obj.setShipmodeId(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setTimeplaced(rs.getDate("TIMEPLACED"));
		obj.setExtordnum(rs.getString("EXTORDNUM"));
		obj.setExtref(rs.getString("EXTREF"));
		
		return obj;
	}

}
