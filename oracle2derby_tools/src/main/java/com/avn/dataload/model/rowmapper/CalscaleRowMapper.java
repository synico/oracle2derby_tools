package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Calscale;

public class CalscaleRowMapper<T> implements RowMapper<Calscale> {

	@Override
	public Calscale mapRow(ResultSet rs, int rowNum) throws SQLException {
		Calscale obj = new Calscale();
		
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setCode(rs.getString("CODE"));
		obj.setCalusageId(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setCalscaleId(rs.getBigDecimal("CALSCALE_ID"));
		obj.setCalmethodId(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
