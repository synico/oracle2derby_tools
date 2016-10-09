package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acpolgrp;

public class AcpolgrpRowMapper<T> implements RowMapper<Acpolgrp> {

	@Override
	public Acpolgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acpolgrp obj = new Acpolgrp();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setAcpolgrpId(rs.getBigDecimal("ACPOLGRP_ID"));
		
		return obj;
	}

}
