package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catovrgrp;

public class CatovrgrpRowMapper<T> implements RowMapper<Catovrgrp> {

	@Override
	public Catovrgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catovrgrp obj = new Catovrgrp();
		
		obj.setCatovrgrpId(rs.getBigDecimal("CATOVRGRP_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		
		return obj;
	}

}
