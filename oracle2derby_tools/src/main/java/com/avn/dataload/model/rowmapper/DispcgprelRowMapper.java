package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dispcgprel;

public class DispcgprelRowMapper<T> implements RowMapper<Dispcgprel> {

	@Override
	public Dispcgprel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dispcgprel obj = new Dispcgprel();
		
		obj.setOid(rs.getString("OID"));
		obj.setDispcgprelId(rs.getBigDecimal("DISPCGPREL_ID"));
		obj.setRank(rs.getBigDecimal("RANK"));
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
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
