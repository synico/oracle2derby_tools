package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxPromocd;

public class PxPromocdRowMapper<T> implements RowMapper<PxPromocd> {

	@Override
	public PxPromocd mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxPromocd obj = new PxPromocd();
		
		obj.setCode(rs.getString("CODE"));
		obj.setPxPromotionId(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPxPromocdId(rs.getBigDecimal("PX_PROMOCD_ID"));
		
		return obj;
	}

}
