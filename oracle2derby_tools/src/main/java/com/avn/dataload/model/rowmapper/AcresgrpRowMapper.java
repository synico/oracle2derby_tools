package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acresgrp;

public class AcresgrpRowMapper<T> implements RowMapper<Acresgrp> {

	@Override
	public Acresgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acresgrp obj = new Acresgrp();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setAcresgrpId(rs.getBigDecimal("ACRESGRP_ID"));
		obj.setGrpname(rs.getString("GRPNAME"));
		obj.setConditions(rs.getString("CONDITIONS"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
