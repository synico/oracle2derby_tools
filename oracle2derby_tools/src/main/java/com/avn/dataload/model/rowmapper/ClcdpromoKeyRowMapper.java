package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.ClcdpromoKey;

public class ClcdpromoKeyRowMapper<T> implements RowMapper<ClcdpromoKey> {

	@Override
	public ClcdpromoKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		ClcdpromoKey obj = new ClcdpromoKey();
		
		obj.setCalcodeId(rs.getBigDecimal("CALCODE_ID"));
		obj.setPxPromotionId(rs.getBigDecimal("PX_PROMOTION_ID"));
		
		return obj;
	}

}
