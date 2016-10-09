package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acrelgrp;

public class AcrelgrpRowMapper<T> implements RowMapper<Acrelgrp> {

	@Override
	public Acrelgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acrelgrp obj = new Acrelgrp();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setAcrelgrpId(rs.getBigDecimal("ACRELGRP_ID"));
		obj.setGrpname(rs.getString("GRPNAME"));
		obj.setConditions(rs.getString("CONDITIONS"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
