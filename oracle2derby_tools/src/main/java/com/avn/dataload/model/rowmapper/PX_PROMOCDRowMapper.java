package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_PROMOCD;

public class PX_PROMOCDRowMapper<T> implements RowMapper<PX_PROMOCD> {

	@Override
	public PX_PROMOCD mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_PROMOCD obj = new PX_PROMOCD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCODE(rs.getString("CODE"));
		obj.setPX_PROMOTION_ID(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setPX_PROMOCD_ID(rs.getBigDecimal("PX_PROMOCD_ID"));
		
		return obj;
	}

}
