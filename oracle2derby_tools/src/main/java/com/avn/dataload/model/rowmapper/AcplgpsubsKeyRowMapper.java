package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcplgpsubsKey;

public class AcplgpsubsKeyRowMapper<T> implements RowMapper<AcplgpsubsKey> {

	@Override
	public AcplgpsubsKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcplgpsubsKey obj = new AcplgpsubsKey();
		
		obj.setAcpolgrpId(rs.getBigDecimal("ACPOLGRP_ID"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		
		return obj;
	}

}
