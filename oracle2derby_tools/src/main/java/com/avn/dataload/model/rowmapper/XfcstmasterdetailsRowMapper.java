package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xfcstmasterdetails;

public class XfcstmasterdetailsRowMapper<T> implements RowMapper<Xfcstmasterdetails> {

	@Override
	public Xfcstmasterdetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xfcstmasterdetails obj = new Xfcstmasterdetails();
		
		obj.setCatentryId(rs.getBigDecimal("CATENTRY_ID"));
		obj.setFcstParty(rs.getString("FCST_PARTY"));
		obj.setCustMat(rs.getString("CUST_MAT"));
		obj.setMfrPartNbr(rs.getString("MFR_PART_NBR"));
		obj.setMfr(rs.getString("MFR"));
		obj.setFcstFreq(rs.getString("FCST_FREQ"));
		obj.setNetOfQoh(rs.getString("NET_OF_QOH"));
		obj.setReserving(rs.getString("RESERVING"));
		obj.setwInv(rs.getString("W_INV"));
		obj.setInventory(rs.getBigDecimal("INVENTORY"));
		obj.setLeadTime(rs.getBigDecimal("LEAD_TIME"));
		obj.setUpdatedOn(rs.getDate("UPDATED_ON"));
		obj.setVmi(rs.getString("VMI"));
		obj.setWerks(rs.getString("WERKS"));
		obj.setConsignInv(rs.getBigDecimal("CONSIGN_INV"));
		obj.setMaterialNbr(rs.getString("MATERIAL_NBR"));
		obj.setNetOfBacklog(rs.getString("NET_OF_BACKLOG"));
		obj.setConsignment(rs.getString("CONSIGNMENT"));
		obj.setConsignmentFlag(rs.getString("CONSIGNMENT_FLAG"));
		obj.setCoveredFlag(rs.getBigDecimal("COVERED_FLAG"));
		obj.setConstrainedFlag(rs.getBigDecimal("CONSTRAINED_FLAG"));
		obj.setNoFcstQtyFlag(rs.getBigDecimal("NO_FCST_QTY_FLAG"));
		obj.setForecastRcvDate(rs.getDate("FORECAST_RCV_DATE"));
		obj.setPlantInventory(rs.getBigDecimal("PLANT_INVENTORY"));
		obj.setForecastId(rs.getBigDecimal("FORECAST_ID"));
		
		return obj;
	}

}
