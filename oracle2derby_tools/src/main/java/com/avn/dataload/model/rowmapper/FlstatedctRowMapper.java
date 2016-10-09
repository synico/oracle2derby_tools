package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Flstatedct;

public class FlstatedctRowMapper<T> implements RowMapper<Flstatedct> {

	@Override
	public Flstatedct mapRow(ResultSet rs, int rowNum) throws SQLException {
		Flstatedct obj = new Flstatedct();
		
		obj.setFlstatedctId(rs.getBigDecimal("FLSTATEDCT_ID"));
		obj.setFlstategpId(rs.getBigDecimal("FLSTATEGP_ID"));
		obj.setApprovermbrgrpname(rs.getString("APPROVERMBRGRPNAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getBigDecimal("IDENTIFIER"));
		obj.setStatename(rs.getString("STATENAME"));
		obj.setStatetype(rs.getBigDecimal("STATETYPE"));
		obj.setFlowtypeId(rs.getBigDecimal("FLOWTYPE_ID"));
		
		return obj;
	}

}
