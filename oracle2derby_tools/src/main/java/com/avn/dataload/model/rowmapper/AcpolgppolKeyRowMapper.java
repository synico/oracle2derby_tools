package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.AcpolgppolKey;

public class AcpolgppolKeyRowMapper<T> implements RowMapper<AcpolgppolKey> {

	@Override
	public AcpolgppolKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		AcpolgppolKey obj = new AcpolgppolKey();
		
		obj.setAcpolgrpId(rs.getBigDecimal("ACPOLGRP_ID"));
		obj.setAcpolicyId(rs.getBigDecimal("ACPOLICY_ID"));
		
		return obj;
	}

}
