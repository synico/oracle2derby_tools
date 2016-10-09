package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxElement;

public class PxElementRowMapper<T> implements RowMapper<PxElement> {

	@Override
	public PxElement mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxElement obj = new PxElement();
		
		obj.setName(rs.getString("NAME"));
		obj.setParent(rs.getString("PARENT"));
		obj.setPxPromotionId(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setType(rs.getString("TYPE"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setPxElementId(rs.getBigDecimal("PX_ELEMENT_ID"));
		obj.setSubtype(rs.getString("SUBTYPE"));
		
		return obj;
	}

}
