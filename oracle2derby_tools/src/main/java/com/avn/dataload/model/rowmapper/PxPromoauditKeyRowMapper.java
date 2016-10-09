package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxPromoauditKey;

public class PxPromoauditKeyRowMapper<T> implements RowMapper<PxPromoauditKey> {

	@Override
	public PxPromoauditKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxPromoauditKey obj = new PxPromoauditKey();
		
		obj.setPxPromotionId(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setVersion(rs.getBigDecimal("VERSION"));
		obj.setRevision(rs.getBigDecimal("REVISION"));
		
		return obj;
	}

}
