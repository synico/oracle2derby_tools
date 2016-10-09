package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Buysupmap;

public class BuysupmapRowMapper<T> implements RowMapper<Buysupmap> {

	@Override
	public Buysupmap mapRow(ResultSet rs, int rowNum) throws SQLException {
		Buysupmap obj = new Buysupmap();
		
		obj.setCatalogId(rs.getBigDecimal("CATALOG_ID"));
		obj.setContractId(rs.getBigDecimal("CONTRACT_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		
		return obj;
	}

}
