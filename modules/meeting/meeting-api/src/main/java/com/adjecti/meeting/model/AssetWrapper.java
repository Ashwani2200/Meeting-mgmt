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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Asset}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Asset
 * @generated
 */
public class AssetWrapper
	extends BaseModelWrapper<Asset> implements Asset, ModelWrapper<Asset> {

	public AssetWrapper(Asset asset) {
		super(asset);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("assetId", getAssetId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("assetModel", getAssetModel());
		attributes.put("purchaseDate", getPurchaseDate());
		attributes.put("serialNo", getSerialNo());
		attributes.put("status", isStatus());
		attributes.put("roomAssigned", isRoomAssigned());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String assetModel = (String)attributes.get("assetModel");

		if (assetModel != null) {
			setAssetModel(assetModel);
		}

		String purchaseDate = (String)attributes.get("purchaseDate");

		if (purchaseDate != null) {
			setPurchaseDate(purchaseDate);
		}

		String serialNo = (String)attributes.get("serialNo");

		if (serialNo != null) {
			setSerialNo(serialNo);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Boolean roomAssigned = (Boolean)attributes.get("roomAssigned");

		if (roomAssigned != null) {
			setRoomAssigned(roomAssigned);
		}
	}

	/**
	 * Returns the asset ID of this asset.
	 *
	 * @return the asset ID of this asset
	 */
	@Override
	public long getAssetId() {
		return model.getAssetId();
	}

	/**
	 * Returns the asset model of this asset.
	 *
	 * @return the asset model of this asset
	 */
	@Override
	public String getAssetModel() {
		return model.getAssetModel();
	}

	/**
	 * Returns the company ID of this asset.
	 *
	 * @return the company ID of this asset
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this asset.
	 *
	 * @return the create date of this asset
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this asset.
	 *
	 * @return the group ID of this asset
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this asset.
	 *
	 * @return the modified date of this asset
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this asset.
	 *
	 * @return the name of this asset
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this asset.
	 *
	 * @return the primary key of this asset
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the purchase date of this asset.
	 *
	 * @return the purchase date of this asset
	 */
	@Override
	public String getPurchaseDate() {
		return model.getPurchaseDate();
	}

	/**
	 * Returns the room assigned of this asset.
	 *
	 * @return the room assigned of this asset
	 */
	@Override
	public boolean getRoomAssigned() {
		return model.getRoomAssigned();
	}

	/**
	 * Returns the serial no of this asset.
	 *
	 * @return the serial no of this asset
	 */
	@Override
	public String getSerialNo() {
		return model.getSerialNo();
	}

	/**
	 * Returns the status of this asset.
	 *
	 * @return the status of this asset
	 */
	@Override
	public boolean getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the user ID of this asset.
	 *
	 * @return the user ID of this asset
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this asset.
	 *
	 * @return the user name of this asset
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this asset.
	 *
	 * @return the user uuid of this asset
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this asset.
	 *
	 * @return the uuid of this asset
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this asset is room assigned.
	 *
	 * @return <code>true</code> if this asset is room assigned; <code>false</code> otherwise
	 */
	@Override
	public boolean isRoomAssigned() {
		return model.isRoomAssigned();
	}

	/**
	 * Returns <code>true</code> if this asset is status.
	 *
	 * @return <code>true</code> if this asset is status; <code>false</code> otherwise
	 */
	@Override
	public boolean isStatus() {
		return model.isStatus();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the asset ID of this asset.
	 *
	 * @param assetId the asset ID of this asset
	 */
	@Override
	public void setAssetId(long assetId) {
		model.setAssetId(assetId);
	}

	/**
	 * Sets the asset model of this asset.
	 *
	 * @param assetModel the asset model of this asset
	 */
	@Override
	public void setAssetModel(String assetModel) {
		model.setAssetModel(assetModel);
	}

	/**
	 * Sets the company ID of this asset.
	 *
	 * @param companyId the company ID of this asset
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this asset.
	 *
	 * @param createDate the create date of this asset
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this asset.
	 *
	 * @param groupId the group ID of this asset
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this asset.
	 *
	 * @param modifiedDate the modified date of this asset
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this asset.
	 *
	 * @param name the name of this asset
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this asset.
	 *
	 * @param primaryKey the primary key of this asset
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the purchase date of this asset.
	 *
	 * @param purchaseDate the purchase date of this asset
	 */
	@Override
	public void setPurchaseDate(String purchaseDate) {
		model.setPurchaseDate(purchaseDate);
	}

	/**
	 * Sets whether this asset is room assigned.
	 *
	 * @param roomAssigned the room assigned of this asset
	 */
	@Override
	public void setRoomAssigned(boolean roomAssigned) {
		model.setRoomAssigned(roomAssigned);
	}

	/**
	 * Sets the serial no of this asset.
	 *
	 * @param serialNo the serial no of this asset
	 */
	@Override
	public void setSerialNo(String serialNo) {
		model.setSerialNo(serialNo);
	}

	/**
	 * Sets whether this asset is status.
	 *
	 * @param status the status of this asset
	 */
	@Override
	public void setStatus(boolean status) {
		model.setStatus(status);
	}

	/**
	 * Sets the user ID of this asset.
	 *
	 * @param userId the user ID of this asset
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this asset.
	 *
	 * @param userName the user name of this asset
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this asset.
	 *
	 * @param userUuid the user uuid of this asset
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this asset.
	 *
	 * @param uuid the uuid of this asset
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AssetWrapper wrap(Asset asset) {
		return new AssetWrapper(asset);
	}

}