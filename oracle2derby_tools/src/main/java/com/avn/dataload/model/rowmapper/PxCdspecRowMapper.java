package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxCdspec;

public class PxCdspecRowMapper<T> implements RowMapper<PxCdspec> {

	@Override
	public PxCdspec mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxCdspec obj = new PxCdspec();
		
		obj.setPxPromotionId(rs.getBigDecimal("PX_PROMOTION_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTransferable(rs.getBigDecimal("TRANSFERABLE"));
		obj.setCodetype(rs.getBigDecimal("CODETYPE"));
		obj.setValidfrom(rs.getDate("VALIDFROM"));
		obj.setValiduntil(rs.getDate("VALIDUNTIL"));
		obj.setPattern(rs.getString("PATTERN"));
		obj.setCodestatus(rs.getBigDecimal("CODESTATUS"));
		obj.setCount(rs.getBigDecimal("COUNT"));
		
		return obj;
	}

}
