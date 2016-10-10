package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_GRPPOLICY;

public class PX_GRPPOLICYRowMapper<T> implements RowMapper<PX_GRPPOLICY> {

	@Override
	public PX_GRPPOLICY mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_GRPPOLICY obj = new PX_GRPPOLICY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPX_GROUP_ID(rs.getBigDecimal("PX_GROUP_ID"));
		obj.setPX_POLICY_ID(rs.getBigDecimal("PX_POLICY_ID"));
		
		return obj;
	}

}
