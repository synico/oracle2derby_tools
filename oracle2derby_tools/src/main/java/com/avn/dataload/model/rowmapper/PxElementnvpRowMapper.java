package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.PxElementnvp;

public class PxElementnvpRowMapper<T> implements RowMapper<PxElementnvp> {

	@Override
	public PxElementnvp mapRow(ResultSet rs, int rowNum) throws SQLException {
		PxElementnvp obj = new PxElementnvp();
		
		obj.setName(rs.getString("NAME"));
		obj.setValue(rs.getString("VALUE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPxElementId(rs.getBigDecimal("PX_ELEMENT_ID"));
		obj.setPxElementnvpId(rs.getBigDecimal("PX_ELEMENTNVP_ID"));
		
		return obj;
	}

}
