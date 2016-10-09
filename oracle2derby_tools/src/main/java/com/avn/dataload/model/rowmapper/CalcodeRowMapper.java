package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Calcode;

public class CalcodeRowMapper<T> implements RowMapper<Calcode> {

	@Override
	public Calcode mapRow(ResultSet rs, int rowNum) throws SQLException {
		Calcode obj = new Calcode();
		
		obj.setCalcodeId(rs.getBigDecimal("CALCODE_ID"));
		obj.setCode(rs.getString("CODE"));
		obj.setCalusageId(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setGroupby(rs.getBigDecimal("GROUPBY"));
		obj.setPublished(rs.getBigDecimal("PUBLISHED"));
		obj.setStartdate(rs.getDate("STARTDATE"));
		obj.setEnddate(rs.getDate("ENDDATE"));
		obj.setFlags(rs.getBigDecimal("FLAGS"));
		obj.setPrecedence(rs.getBigDecimal("PRECEDENCE"));
		obj.setTxcdclassId(rs.getBigDecimal("TXCDCLASS_ID"));
		obj.setCombination(rs.getBigDecimal("COMBINATION"));
		obj.setCalmethodId(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setCalmethodIdApp(rs.getBigDecimal("CALMETHOD_ID_APP"));
		obj.setCalmethodIdQfy(rs.getBigDecimal("CALMETHOD_ID_QFY"));
		obj.setDisplaylevel(rs.getBigDecimal("DISPLAYLEVEL"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
