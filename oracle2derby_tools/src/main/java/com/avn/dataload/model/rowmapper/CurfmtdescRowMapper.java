package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Curfmtdesc;

public class CurfmtdescRowMapper<T> implements RowMapper<Curfmtdesc> {

	@Override
	public Curfmtdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Curfmtdesc obj = new Curfmtdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setRadixpoint(rs.getString("RADIXPOINT"));
		obj.setCurrencysymbol(rs.getString("CURRENCYSYMBOL"));
		obj.setCustomizedcurrstr(rs.getString("CUSTOMIZEDCURRSTR"));
		obj.setCurrencyprefixpos(rs.getString("CURRENCYPREFIXPOS"));
		obj.setCurrencysuffixpos(rs.getString("CURRENCYSUFFIXPOS"));
		obj.setDisplaylocale(rs.getString("DISPLAYLOCALE"));
		obj.setCurrencyprefixneg(rs.getString("CURRENCYPREFIXNEG"));
		obj.setCurrencysuffixneg(rs.getString("CURRENCYSUFFIXNEG"));
		obj.setGroupingchar(rs.getString("GROUPINGCHAR"));
		obj.setNumberpattern(rs.getString("NUMBERPATTERN"));
		
		return obj;
	}

}
