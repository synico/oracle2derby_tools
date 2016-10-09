package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xorderitems;

public class XorderitemsRowMapper<T> implements RowMapper<Xorderitems> {

	@Override
	public Xorderitems mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xorderitems obj = new Xorderitems();
		
		obj.setField4(rs.getString("FIELD4"));
		obj.setOrderitemsId(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setField5(rs.getString("FIELD5"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setRfqId(rs.getString("RFQ_ID"));
		obj.setField6(rs.getString("FIELD6"));
		obj.setField7(rs.getString("FIELD7"));
		obj.setAttention(rs.getString("ATTENTION"));
		obj.setPhoneno(rs.getString("PHONENO"));
		obj.setEmail(rs.getString("EMAIL"));
		obj.setLeadtime(rs.getBigDecimal("LEADTIME"));
		obj.setLeadtimeUom(rs.getString("LEADTIME_UOM"));
		obj.setShipcomplete(rs.getString("SHIPCOMPLETE"));
		obj.setParentitemId(rs.getBigDecimal("PARENTITEM_ID"));
		obj.setOrderitemtype(rs.getString("ORDERITEMTYPE"));
		obj.setCustomerrefno(rs.getString("CUSTOMERREFNO"));
		obj.setAvnAvlquantity(rs.getBigDecimal("AVN_AVLQUANTITY"));
		obj.setBondedAvlquantity(rs.getBigDecimal("BONDED_AVLQUANTITY"));
		obj.setFactoryAvlquantity(rs.getBigDecimal("FACTORY_AVLQUANTITY"));
		
		return obj;
	}

}
