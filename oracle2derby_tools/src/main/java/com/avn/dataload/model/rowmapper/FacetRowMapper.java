package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Facet;

public class FacetRowMapper<T> implements RowMapper<Facet> {

	@Override
	public Facet mapRow(ResultSet rs, int rowNum) throws SQLException {
		Facet obj = new Facet();
		
		obj.setAttrId(rs.getBigDecimal("ATTR_ID"));
		obj.setKeywordSearch(rs.getBigDecimal("KEYWORD_SEARCH"));
		obj.setZeroDisplay(rs.getBigDecimal("ZERO_DISPLAY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setFacetId(rs.getBigDecimal("FACET_ID"));
		obj.setSrchattrId(rs.getBigDecimal("SRCHATTR_ID"));
		obj.setSelection(rs.getBigDecimal("SELECTION"));
		obj.setSortOrder(rs.getBigDecimal("SORT_ORDER"));
		obj.setMaxDisplay(rs.getBigDecimal("MAX_DISPLAY"));
		obj.setGroupId(rs.getBigDecimal("GROUP_ID"));
		
		return obj;
	}

}
