package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acresprim;

public class AcresprimRowMapper<T> implements RowMapper<Acresprim> {

	@Override
	public Acresprim mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acresprim obj = new Acresprim();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setAcrescgryId(rs.getBigDecimal("ACRESCGRY_ID"));
		obj.setResprimarycol(rs.getString("RESPRIMARYCOL"));
		
		return obj;
	}

}
