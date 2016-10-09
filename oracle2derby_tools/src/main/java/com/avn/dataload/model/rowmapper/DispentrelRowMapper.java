package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dispentrel;

public class DispentrelRowMapper<T> implements RowMapper<Dispentrel> {

	@Override
	public Dispentrel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dispentrel obj = new Dispentrel();
		
		obj.setOid(rs.getString("OID"));
		obj.setCatenttypeId(rs.getString("CATENTTYPE_ID"));
		obj.setDispentrelId(rs.getBigDecimal("DISPENTREL_ID"));
		obj.setAuctionstate(rs.getBigDecimal("AUCTIONSTATE"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setRank(rs.getBigDecimal("RANK"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setPagename(rs.getString("PAGENAME"));
		obj.setDevicefmtId(rs.getBigDecimal("DEVICEFMT_ID"));
		
		return obj;
	}

}
