package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxDescriptionKey;

public class PxDescriptionKeyRowMapper<T> implements RowMapper<PxDescriptionKey> {

	@Override
	public PxDescriptionKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxDescriptionKey obj = new PxDescriptionKey();
		
		obj.setPxPromotionId(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
