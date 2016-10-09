package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ctxmgmt;

public class CtxmgmtRowMapper<T> implements RowMapper<Ctxmgmt> {

	@Override
	public Ctxmgmt mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ctxmgmt obj = new Ctxmgmt();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreId(rs.getBigDecimal("STORE_ID"));
		obj.setStatus(rs.getString("STATUS"));
		obj.setActivityId(rs.getBigDecimal("ACTIVITY_ID"));
		obj.setCallerId(rs.getBigDecimal("CALLER_ID"));
		obj.setStarttime(rs.getDate("STARTTIME"));
		obj.setEndtime(rs.getDate("ENDTIME"));
		obj.setRunasId(rs.getBigDecimal("RUNAS_ID"));
		obj.setLastaccesstime(rs.getDate("LASTACCESSTIME"));
		
		return obj;
	}

}
