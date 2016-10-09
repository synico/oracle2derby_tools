package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Orderitems;

public class OrderitemsRowMapper<T> implements RowMapper<Orderitems> {

	@Override
	public Orderitems mapRow(ResultSet rs, int rowNum) throws SQLException {
		Orderitems obj = new Orderitems();
		
		obj.setFfmcenterId(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setOrdreleasenum(rs.getBigDecimal("ORDRELEASENUM"));
		obj.setOrderitemsId(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setAllocaddressId(rs.getBigDecimal("ALLOCADDRESS_ID"));
		obj.setTradingId(rs.getBigDecimal("TRADING_ID"));
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setQuantity(rs.getBigDecimal("QUANTITY"));
		obj.setItemspcId(rs.getBigDecimal("ITEMSPC_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setCurrency(rs.getString("CURRENCY"));
		obj.setComments(rs.getString("COMMENTS"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setAddressId(rs.getBigDecimal("ADDRESS_ID"));
		obj.setStatus(rs.getString("STATUS"));
		obj.setLastcreate(rs.getDate("LASTCREATE"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setLineitemtype(rs.getString("LINEITEMTYPE"));
		obj.setInventorystatus(rs.getString("INVENTORYSTATUS"));
		obj.setFulfillmentstatus(rs.getString("FULFILLMENTSTATUS"));
		obj.setLastallocupdate(rs.getDate("LASTALLOCUPDATE"));
		obj.setTimereleased(rs.getDate("TIMERELEASED"));
		obj.setTimeshipped(rs.getDate("TIMESHIPPED"));
		obj.setTotalproduct(rs.getBigDecimal("TOTALPRODUCT"));
		obj.setTotaladjustment(rs.getBigDecimal("TOTALADJUSTMENT"));
		obj.setShiptaxamount(rs.getBigDecimal("SHIPTAXAMOUNT"));
		obj.setEstavailtime(rs.getDate("ESTAVAILTIME"));
		obj.setAllocationgroup(rs.getBigDecimal("ALLOCATIONGROUP"));
		obj.setBasecurrency(rs.getString("BASECURRENCY"));
		obj.setTracknumber(rs.getString("TRACKNUMBER"));
		obj.setPrepareflags(rs.getBigDecimal("PREPAREFLAGS"));
		obj.setCorrelationgroup(rs.getBigDecimal("CORRELATIONGROUP"));
		obj.setPromisedavailtime(rs.getDate("PROMISEDAVAILTIME"));
		obj.setShippingoffset(rs.getBigDecimal("SHIPPINGOFF"));
		obj.setNeededquantity(rs.getBigDecimal("NEEDEDQUANTITY"));
		obj.setAllocquantity(rs.getBigDecimal("ALLOCQUANTITY"));
		obj.setAllocffmcId(rs.getBigDecimal("ALLOCFFMC_ID"));
		obj.setConfigurationid(rs.getString("CONFIGURATIONID"));
		obj.setSupplierdata(rs.getString("SUPPLIERDATA"));
		obj.setSupplierpartnumber(rs.getString("SUPPLIERPARTNUMBER"));
		obj.setAvailquantity(rs.getBigDecimal("AVAILQUANTITY"));
		obj.setIsexpedited(rs.getString("ISEXPEDITED"));
		obj.setRequestedshipdate(rs.getDate("REQUESTEDSHIPDATE"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setShipmodeId(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setOfferId(rs.getBigDecimal("OFFER_ID"));
		obj.setPrice(rs.getBigDecimal("PRICE"));
		obj.setTermcondId(rs.getBigDecimal("TERMCOND_ID"));
		obj.setPartnum(rs.getString("PARTNUM"));
		obj.setOutputqId(rs.getBigDecimal("OUTPUTQ_ID"));
		obj.setTaxamount(rs.getBigDecimal("TAXAMOUNT"));
		obj.setShipcharge(rs.getBigDecimal("SHIPCHARGE"));
		obj.setBaseprice(rs.getBigDecimal("BASEPRICE"));
		obj.setTrackdate(rs.getDate("TRACKDATE"));
		obj.setTiecode(rs.getBigDecimal("TIECODE"));
		
		return obj;
	}

}
