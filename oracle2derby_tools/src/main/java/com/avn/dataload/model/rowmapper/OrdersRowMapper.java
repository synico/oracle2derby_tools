package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Orders;

public class OrdersRowMapper<T> implements RowMapper<Orders> {

	@Override
	public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
		Orders obj = new Orders();
		
		obj.setBuschnId(rs.getBigDecimal("BUSCHN_ID"));
		obj.setBuyerpoId(rs.getBigDecimal("BUYERPO_ID"));
		obj.setNotificationid(rs.getBigDecimal("NOTIFICATIONID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setCurrency(rs.getString("CURRENCY"));
		obj.setComments(rs.getString("COMMENTS"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setType(rs.getString("TYPE"));
		obj.setAddressId(rs.getBigDecimal("ADDRESS_ID"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStatus(rs.getString("STATUS"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setTotalproduct(rs.getBigDecimal("TOTALPRODUCT"));
		obj.setTotaladjustment(rs.getBigDecimal("TOTALADJUSTMENT"));
		obj.setTotalshipping(rs.getBigDecimal("TOTALSHIPPING"));
		obj.setTotaltaxshipping(rs.getBigDecimal("TOTALTAXSHIPPING"));
		obj.setProviderordernum(rs.getBigDecimal("PROVIDERORDERNUM"));
		obj.setShipascomplete(rs.getString("SHIPASCOMPLETE"));
		obj.setOrdchnltypId(rs.getBigDecimal("ORDCHNLTYP_ID"));
		obj.setTransferstatus(rs.getBigDecimal("TRANSFERSTATUS"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setOrmorder(rs.getString("ORMORDER"));
		obj.setTotaltax(rs.getBigDecimal("TOTALTAX"));
		obj.setLocked(rs.getString("LOCKED"));
		obj.setTimeplaced(rs.getDate("TIMEPLACED"));
		obj.setEditorId(rs.getBigDecimal("EDITOR_ID"));
		obj.setSourceid(rs.getBigDecimal("SOURCEID"));
		obj.setExpiredate(rs.getDate("EXPIREDATE"));
		obj.setOpsystemId(rs.getBigDecimal("OPSYSTEM_ID"));
		obj.setBlocked(rs.getBigDecimal("BLOCKED"));
		
		return obj;
	}

}
