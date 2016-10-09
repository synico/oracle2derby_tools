package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Fltransitn;

public class FltransitnRowMapper<T> implements RowMapper<Fltransitn> {

	@Override
	public Fltransitn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Fltransitn obj = new Fltransitn();
		
		obj.setPriority(rs.getBigDecimal("PRIORITY"));
		obj.setResponseviewname(rs.getString("RESPONSEVIEWNAME"));
		obj.setFltransitnId(rs.getBigDecimal("FLTRANSITN_ID"));
		obj.setSourcestateId(rs.getBigDecimal("SOURCESTATE_ID"));
		obj.setTargetstateId(rs.getBigDecimal("TARGETSTATE_ID"));
		obj.setEventidentifier(rs.getString("EVENTIDENTIFIER"));
		obj.setActioninterface(rs.getString("ACTIONINTERFACE"));
		obj.setAccessctrlguard(rs.getString("ACCESSCTRLGUARD"));
		obj.setBusinesslogicguard(rs.getString("BUSINESSLOGICGUARD"));
		obj.setSpawnflwtypeId(rs.getBigDecimal("SPAWNFLWTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setApproval(rs.getBigDecimal("APPROVAL"));
		obj.setSpawntype(rs.getBigDecimal("SPAWNTYPE"));
		obj.setFlowId(rs.getBigDecimal("FLOW_ID"));
		
		return obj;
	}

}
