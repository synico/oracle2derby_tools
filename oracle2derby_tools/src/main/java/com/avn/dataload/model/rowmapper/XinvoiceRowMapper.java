package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xinvoice;

public class XinvoiceRowMapper<T> implements RowMapper<Xinvoice> {

	@Override
	public Xinvoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xinvoice obj = new Xinvoice();
		
		obj.setField4(rs.getDate("FIELD4"));
		obj.setField5(rs.getString("FIELD5"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStatus(rs.getString("STATUS"));
		obj.setField6(rs.getString("FIELD6"));
		obj.setEmailFlag(rs.getString("EMAIL_FLAG"));
		obj.setXinvoiceDate(rs.getDate("XINVOICE_DATE"));
		obj.setXinvoiceAmt(rs.getBigDecimal("XINVOICE_AMT"));
		obj.setEmailSentTime(rs.getDate("EMAIL_SENT_TIME"));
		
		return obj;
	}

}
