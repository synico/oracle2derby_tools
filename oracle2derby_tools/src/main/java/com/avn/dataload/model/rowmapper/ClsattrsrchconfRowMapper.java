package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Clsattrsrchconf;

public class ClsattrsrchconfRowMapper<T> implements RowMapper<Clsattrsrchconf> {

	@Override
	public Clsattrsrchconf mapRow(ResultSet rs, int rowNum) throws SQLException {
		Clsattrsrchconf obj = new Clsattrsrchconf();
		
		obj.setMastercatalogId(rs.getBigDecimal("MASTERCATALOG_ID"));
		obj.setSrchfieldname(rs.getString("SRCHFIELDNAME"));
		obj.setTemptablepfix(rs.getString("TEMPTABLEPFIX"));
		obj.setAttrtypeId(rs.getString("ATTRTYPE_ID"));
		obj.setSeparator(rs.getString("SEPARATOR"));
		obj.setClsattrsrchconfId(rs.getBigDecimal("CLSATTRSRCHCONF_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setAttrname(rs.getString("ATTRNAME"));
		
		return obj;
	}

}
