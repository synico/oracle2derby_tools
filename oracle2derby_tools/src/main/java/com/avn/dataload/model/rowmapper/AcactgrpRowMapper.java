package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acactgrp;

public class AcactgrpRowMapper<T> implements RowMapper<Acactgrp> {

	@Override
	public Acactgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acactgrp obj = new Acactgrp();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAcactgrpId(rs.getBigDecimal("ACACTGRP_ID"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setGroupname(rs.getString("GROUPNAME"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		
		return obj;
	}

}
