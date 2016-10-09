package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordchgrsn;

public class OrdchgrsnRowMapper<T> implements RowMapper<Ordchgrsn> {

	@Override
	public Ordchgrsn mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordchgrsn obj = new Ordchgrsn();
		
		obj.setOrdchgrsnId(rs.getBigDecimal("ORDCHGRSN_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getBigDecimal("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setReasoncode(rs.getString("REASONCODE"));
		
		return obj;
	}

}
