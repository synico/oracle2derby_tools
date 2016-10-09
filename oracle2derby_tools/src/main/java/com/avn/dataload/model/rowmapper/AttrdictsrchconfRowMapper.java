package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Attrdictsrchconf;

public class AttrdictsrchconfRowMapper<T> implements RowMapper<Attrdictsrchconf> {

	@Override
	public Attrdictsrchconf mapRow(ResultSet rs, int rowNum) throws SQLException {
		Attrdictsrchconf obj = new Attrdictsrchconf();
		
		obj.setAttrdictsrchcnfId(rs.getBigDecimal("ATTRDICTSRCHCNF_ID"));
		obj.setMastercatalogId(rs.getBigDecimal("MASTERCATALOG_ID"));
		obj.setSrchfieldname(rs.getString("SRCHFIELDNAME"));
		obj.setTemptablepfix(rs.getString("TEMPTABLEPFIX"));
		obj.setAttrId(rs.getBigDecimal("ATTR_ID"));
		obj.setAttrtypeId(rs.getString("ATTRTYPE_ID"));
		obj.setSeparator(rs.getString("SEPARATOR"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
