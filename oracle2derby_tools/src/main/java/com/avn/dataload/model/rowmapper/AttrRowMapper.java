package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Attr;

public class AttrRowMapper<T> implements RowMapper<Attr> {

	@Override
	public Attr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Attr obj = new Attr();
		
		obj.setDisplayable(rs.getBigDecimal("DISPLAYABLE"));
		obj.setStoredisplay(rs.getBigDecimal("STOREDISPLAY"));
		obj.setMerchandisable(rs.getBigDecimal("MERCHANDISABLE"));
		obj.setAttrId(rs.getBigDecimal("ATTR_ID"));
		obj.setAttrtypeId(rs.getString("ATTRTYPE_ID"));
		obj.setAttrdictId(rs.getBigDecimal("ATTRDICT_ID"));
		obj.setSearchable(rs.getBigDecimal("SEARCHABLE"));
		obj.setComparable(rs.getBigDecimal("COMPARABLE"));
		obj.setAttrusage(rs.getBigDecimal("ATTRUSAGE"));
		obj.setFacetable(rs.getBigDecimal("FACETABLE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
