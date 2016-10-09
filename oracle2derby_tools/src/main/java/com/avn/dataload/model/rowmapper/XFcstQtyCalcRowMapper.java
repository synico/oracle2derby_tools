package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XFcstQtyCalc;

public class XFcstQtyCalcRowMapper<T> implements RowMapper<XFcstQtyCalc> {

	@Override
	public XFcstQtyCalc mapRow(ResultSet rs, int rowNum) throws SQLException {
		XFcstQtyCalc obj = new XFcstQtyCalc();
		
		obj.setReserving(rs.getString("RESERVING"));
		obj.setwInv(rs.getString("W_INV"));
		obj.setInventory(rs.getBigDecimal("INVENTORY"));
		obj.setLeadTime(rs.getBigDecimal("LEAD_TIME"));
		obj.setUpdatedOn(rs.getDate("UPDATED_ON"));
		obj.setVmi(rs.getString("VMI"));
		obj.setConsignInv(rs.getBigDecimal("CONSIGN_INV"));
		obj.setFcstRaw(rs.getBigDecimal("FCST_RAW"));
		obj.setZsbOrders(rs.getBigDecimal("ZSB_ORDERS"));
		obj.setZfcOrders(rs.getBigDecimal("ZFC_ORDERS"));
		obj.setCalWInv(rs.getBigDecimal("CAL_WINV"));
		obj.setAvlFacPo(rs.getBigDecimal("AVL_FAC_PO"));
		obj.setZkb1Orders(rs.getBigDecimal("ZKB1ORDERS"));
		obj.setZorOrders(rs.getBigDecimal("ZOR_ORDERS"));
		obj.setZka1Orders(rs.getBigDecimal("ZKA1ORDERS"));
		obj.setZke1Orders(rs.getBigDecimal("ZKE1ORDERS"));
		obj.setNetOfBacklog(rs.getString("NET_OF_BACKLOG"));
		obj.setConsignment(rs.getString("CONSIGNMENT"));
		obj.setCoveredFlag(rs.getBigDecimal("COVERED_FLAG"));
		obj.setConstrainedFlag(rs.getBigDecimal("CONSTRAINED_FLAG"));
		obj.setNoFcstQtyFlag(rs.getBigDecimal("NO_FCST_QTY_FLAG"));
		obj.setForecastRcvDate(rs.getDate("FORECAST_RCV_DATE"));
		obj.setPlantInventory(rs.getBigDecimal("PLANT_INVENTORY"));
		obj.setFcstAmended(rs.getBigDecimal("FCST_AMENDED"));
		obj.setAvnetCommit(rs.getBigDecimal("AVNET_COMMIT"));
		obj.setCustTotNeed(rs.getBigDecimal("CUST_TOT_NEED"));
		obj.setIntermediateCalcValue(rs.getBigDecimal("INTERMEDIATE_CALC_VALUE"));
		obj.setExcessShortage(rs.getBigDecimal("EXCESS_SHORTAGE"));
		obj.setRunningTotal(rs.getBigDecimal("RUNNING_TOTAL"));
		obj.setInvPosition(rs.getBigDecimal("INV_POSITION"));
		obj.setForecastId(rs.getBigDecimal("FORECAST_ID"));
		
		return obj;
	}

}
