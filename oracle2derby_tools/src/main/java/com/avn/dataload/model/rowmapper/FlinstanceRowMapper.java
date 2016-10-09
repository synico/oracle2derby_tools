package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Flinstance;

public class FlinstanceRowMapper<T> implements RowMapper<Flinstance> {

	@Override
	public Flinstance mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flinstance obj = new Flinstance();
		
		obj.setCurstateidentifier(rs.getBigDecimal("CURSTATEIDENTIFIER"));
		obj.setCurrstageindex(rs.getBigDecimal("CURRSTAGEINDEX"));
		obj.setLastupdatetime(rs.getDate("LASTUPDATETIME"));
		obj.setFlowcontext(rs.getString("FLOWCONTEXT"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFlowId(rs.getBigDecimal("FLOW_ID"));
		obj.setFlowstages(rs.getString("FLOWSTAGES"));
		
		return obj;
	}

}
