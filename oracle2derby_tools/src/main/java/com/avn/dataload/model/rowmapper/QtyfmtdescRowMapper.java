package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Qtyfmtdesc;

public class QtyfmtdescRowMapper<T> implements RowMapper<Qtyfmtdesc> {

	@Override
	public Qtyfmtdesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Qtyfmtdesc obj = new Qtyfmtdesc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setUnitprefixpos(rs.getString("UNITPREFIXPOS"));
		obj.setUnitsuffixpos(rs.getString("UNITSUFFIXPOS"));
		obj.setCustomizedqtystr(rs.getString("CUSTOMIZEDQTYSTR"));
		obj.setUnitprefixneg(rs.getString("UNITPREFIXNEG"));
		obj.setUnitsuffixneg(rs.getString("UNITSUFFIXNEG"));
		obj.setRadixpoint(rs.getString("RADIXPOINT"));
		obj.setUnitsymbol(rs.getString("UNITSYMBOL"));
		obj.setDisplaylocale(rs.getString("DISPLAYLOCALE"));
		obj.setGroupingchar(rs.getString("GROUPINGCHAR"));
		obj.setNumberpattern(rs.getString("NUMBERPATTERN"));
		
		return obj;
	}

}
