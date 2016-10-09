package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Srchproprelv;

public class SrchproprelvRowMapper<T> implements RowMapper<Srchproprelv> {

	@Override
	public Srchproprelv mapRow(ResultSet rs, int rowNum) throws SQLException {
		Srchproprelv obj = new Srchproprelv();
		
		obj.setCatalogId(rs.getBigDecimal("CATALOG_ID"));
		obj.setCatgroupId(rs.getBigDecimal("CATGROUP_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSrchproprelvId(rs.getBigDecimal("SRCHPROPRELV_ID"));
		obj.setRelvalue(rs.getBigDecimal("RELVALUE"));
		obj.setIndexfield(rs.getString("INDEXFIELD"));
		
		return obj;
	}

}
