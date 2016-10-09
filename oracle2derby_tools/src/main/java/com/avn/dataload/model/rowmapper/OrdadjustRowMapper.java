package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordadjust;

public class OrdadjustRowMapper<T> implements RowMapper<Ordadjust> {

	@Override
	public Ordadjust mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordadjust obj = new Ordadjust();
		
		obj.setAmount(rs.getBigDecimal("AMOUNT"));
		obj.setCalcodeId(rs.getBigDecimal("CALCODE_ID"));
		obj.setCalusageId(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setDisplaylevel(rs.getBigDecimal("DISPLAYLEVEL"));
		obj.setOrdadjustId(rs.getBigDecimal("ORDADJUST_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		
		return obj;
	}

}
