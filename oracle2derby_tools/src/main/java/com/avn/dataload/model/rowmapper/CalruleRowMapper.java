package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Calrule;

public class CalruleRowMapper<T> implements RowMapper<Calrule> {

	@Override
	public Calrule mapRow(ResultSet rs, int rowNum) throws SQLException {
		Calrule obj = new Calrule();
		
		obj.setCalcodeId(rs.getBigDecimal("CALCODE_ID"));
		obj.setStartdate(rs.getDate("STARTDATE"));
		obj.setEnddate(rs.getDate("ENDDATE"));
		obj.setFlags(rs.getBigDecimal("FLAGS"));
		obj.setCombination(rs.getBigDecimal("COMBINATION"));
		obj.setCalmethodId(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setCalmethodIdQfy(rs.getBigDecimal("CALMETHOD_ID_QFY"));
		obj.setCalruleId(rs.getBigDecimal("CALRULE_ID"));
		obj.setTaxcgryId(rs.getBigDecimal("TAXCGRY_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setIdentifier(rs.getBigDecimal("IDENTIFIER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
