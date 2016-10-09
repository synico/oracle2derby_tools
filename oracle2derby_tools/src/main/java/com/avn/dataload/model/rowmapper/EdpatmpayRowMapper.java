package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Edpatmpay;

public class EdpatmpayRowMapper<T> implements RowMapper<Edpatmpay> {

	@Override
	public Edpatmpay mapRow(ResultSet rs, int rowNum) throws SQLException {
		Edpatmpay obj = new Edpatmpay();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setEdpatmpayId(rs.getBigDecimal("EDPATMPAY_ID"));
		obj.setEdppayinstId(rs.getBigDecimal("EDPPAYINST_ID"));
		obj.setTotalamount(rs.getBigDecimal("TOTALAMOUNT"));
		obj.setValidationamount(rs.getBigDecimal("VALIDATIONAMOUNT"));
		obj.setReservationamount(rs.getBigDecimal("RESERVATIONAMOUNT"));
		obj.setFinalizationamount(rs.getBigDecimal("FINALIZATIONAMOUNT"));
		obj.setValidatingamount(rs.getBigDecimal("VALIDATINGAMOUNT"));
		obj.setReservingamount(rs.getBigDecimal("RESERVINGAMOUNT"));
		obj.setFinalizingamount(rs.getBigDecimal("FINALIZINGAMOUNT"));
		obj.setBackendpaymentid(rs.getString("BACKENDPAYMENTID"));
		
		return obj;
	}

}
