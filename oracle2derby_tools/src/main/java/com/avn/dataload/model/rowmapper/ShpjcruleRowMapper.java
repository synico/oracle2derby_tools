package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Shpjcrule;

public class ShpjcruleRowMapper<T> implements RowMapper<Shpjcrule> {

	@Override
	public Shpjcrule mapRow(ResultSet rs, int rowNum) throws SQLException {
		Shpjcrule obj = new Shpjcrule();
		
		obj.setPrecedence(rs.getBigDecimal("PRECEDENCE"));
		obj.setFfmcenterId(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setJurstgroupId(rs.getBigDecimal("JURSTGROUP_ID"));
		obj.setCalruleId(rs.getBigDecimal("CALRULE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setShpjcruleId(rs.getBigDecimal("SHPJCRULE_ID"));
		obj.setShipmodeId(rs.getBigDecimal("SHIPMODE_ID"));
		
		return obj;
	}

}
