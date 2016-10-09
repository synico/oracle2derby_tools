package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mbrattrval;

public class MbrattrvalRowMapper<T> implements RowMapper<Mbrattrval> {

	@Override
	public Mbrattrval mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mbrattrval obj = new Mbrattrval();
		
		obj.setStringvalue(rs.getString("STRINGVALUE"));
		obj.setIntegervalue(rs.getBigDecimal("INTEGERVALUE"));
		obj.setAttrtypeId(rs.getString("ATTRTYPE_ID"));
		obj.setFloatvalue(rs.getBigDecimal("FLOATVALUE"));
		obj.setMbrattrvalId(rs.getBigDecimal("MBRATTRVAL_ID"));
		obj.setDatetimevalue(rs.getDate("DATETIMEVALUE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setMbrattrId(rs.getBigDecimal("MBRATTR_ID"));
		
		return obj;
	}

}
