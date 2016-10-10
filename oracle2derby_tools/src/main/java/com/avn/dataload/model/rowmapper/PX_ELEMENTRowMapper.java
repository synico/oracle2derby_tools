package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_ELEMENT;

public class PX_ELEMENTRowMapper<T> implements RowMapper<PX_ELEMENT> {

	@Override
	public PX_ELEMENT mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_ELEMENT obj = new PX_ELEMENT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setPARENT(rs.getString("PARENT"));
		obj.setPX_PROMOTION_ID(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setPX_ELEMENT_ID(rs.getBigDecimal("PX_ELEMENT_ID"));
		obj.setSUBTYPE(rs.getString("SUBTYPE"));
		
		return obj;
	}

}
