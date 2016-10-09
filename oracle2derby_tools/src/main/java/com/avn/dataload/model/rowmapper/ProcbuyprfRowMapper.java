package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Procbuyprf;

public class ProcbuyprfRowMapper<T> implements RowMapper<Procbuyprf> {

	@Override
	public Procbuyprf mapRow(ResultSet rs, int rowNum) throws SQLException {
		Procbuyprf obj = new Procbuyprf();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setOrgunitparm(rs.getString("ORGUNITPARM"));
		obj.setContractparm(rs.getString("CONTRACTPARM"));
		obj.setReqidparm(rs.getString("REQIDPARM"));
		
		return obj;
	}

}
