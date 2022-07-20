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

package com.adjecti.meeting.service.persistence;

import com.adjecti.meeting.model.Asset;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the asset service. This utility wraps <code>com.adjecti.meeting.service.persistence.impl.AssetPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetPersistence
 * @generated
 */
public class AssetUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Asset asset) {
		getPersistence().clearCache(asset);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Asset> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Asset> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Asset> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Asset> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Asset> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Asset update(Asset asset) {
		return getPersistence().update(asset);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Asset update(Asset asset, ServiceContext serviceContext) {
		return getPersistence().update(asset, serviceContext);
	}

	/**
	 * Returns all the assets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assets
	 */
	public static List<Asset> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the assets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @return the range of matching assets
	 */
	public static List<Asset> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the assets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assets
	 */
	public static List<Asset> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Asset> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assets
	 */
	public static List<Asset> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Asset> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByUuid_First(
			String uuid, OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByUuid_First(
		String uuid, OrderByComparator<Asset> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByUuid_Last(
			String uuid, OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByUuid_Last(
		String uuid, OrderByComparator<Asset> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the assets before and after the current asset in the ordered set where uuid = &#63;.
	 *
	 * @param assetId the primary key of the current asset
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next asset
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public static Asset[] findByUuid_PrevAndNext(
			long assetId, String uuid,
			OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByUuid_PrevAndNext(
			assetId, uuid, orderByComparator);
	}

	/**
	 * Removes all the assets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of assets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assets
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the asset where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAssetException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByUUID_G(String uuid, long groupId)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the asset where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the asset that was removed
	 */
	public static Asset removeByUUID_G(String uuid, long groupId)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of assets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching assets
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the assets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assets
	 */
	public static List<Asset> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the assets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @return the range of matching assets
	 */
	public static List<Asset> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the assets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assets
	 */
	public static List<Asset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Asset> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assets
	 */
	public static List<Asset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Asset> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Asset> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Asset> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the assets before and after the current asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param assetId the primary key of the current asset
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next asset
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public static Asset[] findByUuid_C_PrevAndNext(
			long assetId, String uuid, long companyId,
			OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByUuid_C_PrevAndNext(
			assetId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the assets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of assets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assets
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the assets where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching assets
	 */
	public static List<Asset> findByname(String name) {
		return getPersistence().findByname(name);
	}

	/**
	 * Returns a range of all the assets where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @return the range of matching assets
	 */
	public static List<Asset> findByname(String name, int start, int end) {
		return getPersistence().findByname(name, start, end);
	}

	/**
	 * Returns an ordered range of all the assets where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assets
	 */
	public static List<Asset> findByname(
		String name, int start, int end,
		OrderByComparator<Asset> orderByComparator) {

		return getPersistence().findByname(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assets where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assets
	 */
	public static List<Asset> findByname(
		String name, int start, int end,
		OrderByComparator<Asset> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByname(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first asset in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByname_First(
			String name, OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByname_First(name, orderByComparator);
	}

	/**
	 * Returns the first asset in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByname_First(
		String name, OrderByComparator<Asset> orderByComparator) {

		return getPersistence().fetchByname_First(name, orderByComparator);
	}

	/**
	 * Returns the last asset in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByname_Last(
			String name, OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByname_Last(name, orderByComparator);
	}

	/**
	 * Returns the last asset in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByname_Last(
		String name, OrderByComparator<Asset> orderByComparator) {

		return getPersistence().fetchByname_Last(name, orderByComparator);
	}

	/**
	 * Returns the assets before and after the current asset in the ordered set where name = &#63;.
	 *
	 * @param assetId the primary key of the current asset
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next asset
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public static Asset[] findByname_PrevAndNext(
			long assetId, String name,
			OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByname_PrevAndNext(
			assetId, name, orderByComparator);
	}

	/**
	 * Removes all the assets where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByname(String name) {
		getPersistence().removeByname(name);
	}

	/**
	 * Returns the number of assets where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching assets
	 */
	public static int countByname(String name) {
		return getPersistence().countByname(name);
	}

	/**
	 * Returns all the assets where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @return the matching assets
	 */
	public static List<Asset> findByassetModel(String assetModel) {
		return getPersistence().findByassetModel(assetModel);
	}

	/**
	 * Returns a range of all the assets where assetModel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param assetModel the asset model
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @return the range of matching assets
	 */
	public static List<Asset> findByassetModel(
		String assetModel, int start, int end) {

		return getPersistence().findByassetModel(assetModel, start, end);
	}

	/**
	 * Returns an ordered range of all the assets where assetModel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param assetModel the asset model
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assets
	 */
	public static List<Asset> findByassetModel(
		String assetModel, int start, int end,
		OrderByComparator<Asset> orderByComparator) {

		return getPersistence().findByassetModel(
			assetModel, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assets where assetModel = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param assetModel the asset model
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching assets
	 */
	public static List<Asset> findByassetModel(
		String assetModel, int start, int end,
		OrderByComparator<Asset> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByassetModel(
			assetModel, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first asset in the ordered set where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByassetModel_First(
			String assetModel, OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByassetModel_First(
			assetModel, orderByComparator);
	}

	/**
	 * Returns the first asset in the ordered set where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByassetModel_First(
		String assetModel, OrderByComparator<Asset> orderByComparator) {

		return getPersistence().fetchByassetModel_First(
			assetModel, orderByComparator);
	}

	/**
	 * Returns the last asset in the ordered set where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByassetModel_Last(
			String assetModel, OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByassetModel_Last(
			assetModel, orderByComparator);
	}

	/**
	 * Returns the last asset in the ordered set where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByassetModel_Last(
		String assetModel, OrderByComparator<Asset> orderByComparator) {

		return getPersistence().fetchByassetModel_Last(
			assetModel, orderByComparator);
	}

	/**
	 * Returns the assets before and after the current asset in the ordered set where assetModel = &#63;.
	 *
	 * @param assetId the primary key of the current asset
	 * @param assetModel the asset model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next asset
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public static Asset[] findByassetModel_PrevAndNext(
			long assetId, String assetModel,
			OrderByComparator<Asset> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByassetModel_PrevAndNext(
			assetId, assetModel, orderByComparator);
	}

	/**
	 * Removes all the assets where assetModel = &#63; from the database.
	 *
	 * @param assetModel the asset model
	 */
	public static void removeByassetModel(String assetModel) {
		getPersistence().removeByassetModel(assetModel);
	}

	/**
	 * Returns the number of assets where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @return the number of matching assets
	 */
	public static int countByassetModel(String assetModel) {
		return getPersistence().countByassetModel(assetModel);
	}

	/**
	 * Returns the asset where serialNo = &#63; or throws a <code>NoSuchAssetException</code> if it could not be found.
	 *
	 * @param serialNo the serial no
	 * @return the matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByserialNo(String serialNo)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByserialNo(serialNo);
	}

	/**
	 * Returns the asset where serialNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param serialNo the serial no
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByserialNo(String serialNo) {
		return getPersistence().fetchByserialNo(serialNo);
	}

	/**
	 * Returns the asset where serialNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param serialNo the serial no
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByserialNo(
		String serialNo, boolean useFinderCache) {

		return getPersistence().fetchByserialNo(serialNo, useFinderCache);
	}

	/**
	 * Removes the asset where serialNo = &#63; from the database.
	 *
	 * @param serialNo the serial no
	 * @return the asset that was removed
	 */
	public static Asset removeByserialNo(String serialNo)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().removeByserialNo(serialNo);
	}

	/**
	 * Returns the number of assets where serialNo = &#63;.
	 *
	 * @param serialNo the serial no
	 * @return the number of matching assets
	 */
	public static int countByserialNo(String serialNo) {
		return getPersistence().countByserialNo(serialNo);
	}

	/**
	 * Returns the asset where roomAssigned = &#63; or throws a <code>NoSuchAssetException</code> if it could not be found.
	 *
	 * @param roomAssigned the room assigned
	 * @return the matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public static Asset findByroomAssigned(boolean roomAssigned)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByroomAssigned(roomAssigned);
	}

	/**
	 * Returns the asset where roomAssigned = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param roomAssigned the room assigned
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByroomAssigned(boolean roomAssigned) {
		return getPersistence().fetchByroomAssigned(roomAssigned);
	}

	/**
	 * Returns the asset where roomAssigned = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param roomAssigned the room assigned
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public static Asset fetchByroomAssigned(
		boolean roomAssigned, boolean useFinderCache) {

		return getPersistence().fetchByroomAssigned(
			roomAssigned, useFinderCache);
	}

	/**
	 * Removes the asset where roomAssigned = &#63; from the database.
	 *
	 * @param roomAssigned the room assigned
	 * @return the asset that was removed
	 */
	public static Asset removeByroomAssigned(boolean roomAssigned)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().removeByroomAssigned(roomAssigned);
	}

	/**
	 * Returns the number of assets where roomAssigned = &#63;.
	 *
	 * @param roomAssigned the room assigned
	 * @return the number of matching assets
	 */
	public static int countByroomAssigned(boolean roomAssigned) {
		return getPersistence().countByroomAssigned(roomAssigned);
	}

	/**
	 * Caches the asset in the entity cache if it is enabled.
	 *
	 * @param asset the asset
	 */
	public static void cacheResult(Asset asset) {
		getPersistence().cacheResult(asset);
	}

	/**
	 * Caches the assets in the entity cache if it is enabled.
	 *
	 * @param assets the assets
	 */
	public static void cacheResult(List<Asset> assets) {
		getPersistence().cacheResult(assets);
	}

	/**
	 * Creates a new asset with the primary key. Does not add the asset to the database.
	 *
	 * @param assetId the primary key for the new asset
	 * @return the new asset
	 */
	public static Asset create(long assetId) {
		return getPersistence().create(assetId);
	}

	/**
	 * Removes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset that was removed
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public static Asset remove(long assetId)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().remove(assetId);
	}

	public static Asset updateImpl(Asset asset) {
		return getPersistence().updateImpl(asset);
	}

	/**
	 * Returns the asset with the primary key or throws a <code>NoSuchAssetException</code> if it could not be found.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public static Asset findByPrimaryKey(long assetId)
		throws com.adjecti.meeting.exception.NoSuchAssetException {

		return getPersistence().findByPrimaryKey(assetId);
	}

	/**
	 * Returns the asset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset, or <code>null</code> if a asset with the primary key could not be found
	 */
	public static Asset fetchByPrimaryKey(long assetId) {
		return getPersistence().fetchByPrimaryKey(assetId);
	}

	/**
	 * Returns all the assets.
	 *
	 * @return the assets
	 */
	public static List<Asset> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @return the range of assets
	 */
	public static List<Asset> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assets
	 */
	public static List<Asset> findAll(
		int start, int end, OrderByComparator<Asset> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets
	 * @param end the upper bound of the range of assets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assets
	 */
	public static List<Asset> findAll(
		int start, int end, OrderByComparator<Asset> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the assets from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of assets.
	 *
	 * @return the number of assets
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AssetPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AssetPersistence, AssetPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(AssetPersistence.class);

		ServiceTracker<AssetPersistence, AssetPersistence> serviceTracker =
			new ServiceTracker<AssetPersistence, AssetPersistence>(
				bundle.getBundleContext(), AssetPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}