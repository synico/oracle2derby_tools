package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.DmeletemplateWithBLOBs;

public class DmeletemplateWithBLOBsRowMapper<T> implements RowMapper<DmeletemplateWithBLOBs> {

	@Override
	public DmeletemplateWithBLOBs mapRow(ResultSet rs, int rowNum) throws SQLException {
		DmeletemplateWithBLOBs obj = new DmeletemplateWithBLOBs();
		
		obj.setBehaviorxml(rs.getString("BEHAVIORXML"));
		obj.setDisplayxml(rs.getString("DISPLAYXML"));
		obj.setImplxml(rs.getString("IMPLXML"));
		obj.setRelatedxml(rs.getString("RELATEDXML"));
		
		return obj;
	}

}
