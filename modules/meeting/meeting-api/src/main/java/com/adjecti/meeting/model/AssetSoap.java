/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.adjecti.meeting.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.adjecti.meeting.service.http.AssetServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class AssetSoap implements Serializable {

	public static AssetSoap toSoapModel(Asset model) {
		AssetSoap soapModel = new AssetSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAssetId(model.getAssetId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setAssetModel(model.getAssetModel());
		soapModel.setPurchaseDate(model.getPurchaseDate());
		soapModel.setSerialNo(model.getSerialNo());
		soapModel.setStatus(model.isStatus());
		soapModel.setRoomAssigned(model.isRoomAssigned());

		return soapModel;
	}

	public static AssetSoap[] toSoapModels(Asset[] models) {
		AssetSoap[] soapModels = new AssetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetSoap[][] toSoapModels(Asset[][] models) {
		AssetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetSoap[] toSoapModels(List<Asset> models) {
		List<AssetSoap> soapModels = new ArrayList<AssetSoap>(models.size());

		for (Asset model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetSoap[soapModels.size()]);
	}

	public AssetSoap() {
	}

	public long getPrimaryKey() {
		return _assetId;
	}

	public void setPrimaryKey(long pk) {
		setAssetId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAssetModel() {
		return _assetModel;
	}

	public void setAssetModel(String assetModel) {
		_assetModel = assetModel;
	}

	public String getPurchaseDate() {
		return _purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		_purchaseDate = purchaseDate;
	}

	public String getSerialNo() {
		return _serialNo;
	}

	public void setSerialNo(String serialNo) {
		_serialNo = serialNo;
	}

	public boolean getStatus() {
		return _status;
	}

	public boolean isStatus() {
		return _status;
	}

	public void setStatus(boolean status) {
		_status = status;
	}

	public boolean getRoomAssigned() {
		return _roomAssigned;
	}

	public boolean isRoomAssigned() {
		return _roomAssigned;
	}

	public void setRoomAssigned(boolean roomAssigned) {
		_roomAssigned = roomAssigned;
	}

	private String _uuid;
	private long _assetId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _assetModel;
	private String _purchaseDate;
	private String _serialNo;
	private boolean _status;
	private boolean _roomAssigned;

}