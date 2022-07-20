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

import com.adjecti.meeting.exception.NoSuchAssetException;
import com.adjecti.meeting.model.Asset;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the asset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetUtil
 * @generated
 */
@ProviderType
public interface AssetPersistence extends BasePersistence<Asset> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetUtil} to access the asset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the assets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching assets
	 */
	public java.util.List<Asset> findByUuid(String uuid);

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
	public java.util.List<Asset> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Asset> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

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
	public java.util.List<Asset> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Returns the first asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

	/**
	 * Returns the last asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Returns the last asset in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

	/**
	 * Returns the assets before and after the current asset in the ordered set where uuid = &#63;.
	 *
	 * @param assetId the primary key of the current asset
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next asset
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public Asset[] findByUuid_PrevAndNext(
			long assetId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Removes all the assets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of assets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching assets
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the asset where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAssetException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByUUID_G(String uuid, long groupId)
		throws NoSuchAssetException;

	/**
	 * Returns the asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the asset where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the asset where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the asset that was removed
	 */
	public Asset removeByUUID_G(String uuid, long groupId)
		throws NoSuchAssetException;

	/**
	 * Returns the number of assets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching assets
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the assets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching assets
	 */
	public java.util.List<Asset> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Asset> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Asset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

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
	public java.util.List<Asset> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Returns the first asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

	/**
	 * Returns the last asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Returns the last asset in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

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
	public Asset[] findByUuid_C_PrevAndNext(
			long assetId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Removes all the assets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of assets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching assets
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the assets where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching assets
	 */
	public java.util.List<Asset> findByname(String name);

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
	public java.util.List<Asset> findByname(String name, int start, int end);

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
	public java.util.List<Asset> findByname(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

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
	public java.util.List<Asset> findByname(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first asset in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByname_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Returns the first asset in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByname_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

	/**
	 * Returns the last asset in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByname_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Returns the last asset in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByname_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

	/**
	 * Returns the assets before and after the current asset in the ordered set where name = &#63;.
	 *
	 * @param assetId the primary key of the current asset
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next asset
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public Asset[] findByname_PrevAndNext(
			long assetId, String name,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Removes all the assets where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByname(String name);

	/**
	 * Returns the number of assets where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching assets
	 */
	public int countByname(String name);

	/**
	 * Returns all the assets where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @return the matching assets
	 */
	public java.util.List<Asset> findByassetModel(String assetModel);

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
	public java.util.List<Asset> findByassetModel(
		String assetModel, int start, int end);

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
	public java.util.List<Asset> findByassetModel(
		String assetModel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

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
	public java.util.List<Asset> findByassetModel(
		String assetModel, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first asset in the ordered set where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByassetModel_First(
			String assetModel,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Returns the first asset in the ordered set where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByassetModel_First(
		String assetModel,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

	/**
	 * Returns the last asset in the ordered set where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByassetModel_Last(
			String assetModel,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Returns the last asset in the ordered set where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByassetModel_Last(
		String assetModel,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

	/**
	 * Returns the assets before and after the current asset in the ordered set where assetModel = &#63;.
	 *
	 * @param assetId the primary key of the current asset
	 * @param assetModel the asset model
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next asset
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public Asset[] findByassetModel_PrevAndNext(
			long assetId, String assetModel,
			com.liferay.portal.kernel.util.OrderByComparator<Asset>
				orderByComparator)
		throws NoSuchAssetException;

	/**
	 * Removes all the assets where assetModel = &#63; from the database.
	 *
	 * @param assetModel the asset model
	 */
	public void removeByassetModel(String assetModel);

	/**
	 * Returns the number of assets where assetModel = &#63;.
	 *
	 * @param assetModel the asset model
	 * @return the number of matching assets
	 */
	public int countByassetModel(String assetModel);

	/**
	 * Returns the asset where serialNo = &#63; or throws a <code>NoSuchAssetException</code> if it could not be found.
	 *
	 * @param serialNo the serial no
	 * @return the matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByserialNo(String serialNo) throws NoSuchAssetException;

	/**
	 * Returns the asset where serialNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param serialNo the serial no
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByserialNo(String serialNo);

	/**
	 * Returns the asset where serialNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param serialNo the serial no
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByserialNo(String serialNo, boolean useFinderCache);

	/**
	 * Removes the asset where serialNo = &#63; from the database.
	 *
	 * @param serialNo the serial no
	 * @return the asset that was removed
	 */
	public Asset removeByserialNo(String serialNo) throws NoSuchAssetException;

	/**
	 * Returns the number of assets where serialNo = &#63;.
	 *
	 * @param serialNo the serial no
	 * @return the number of matching assets
	 */
	public int countByserialNo(String serialNo);

	/**
	 * Returns the asset where roomAssigned = &#63; or throws a <code>NoSuchAssetException</code> if it could not be found.
	 *
	 * @param roomAssigned the room assigned
	 * @return the matching asset
	 * @throws NoSuchAssetException if a matching asset could not be found
	 */
	public Asset findByroomAssigned(boolean roomAssigned)
		throws NoSuchAssetException;

	/**
	 * Returns the asset where roomAssigned = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param roomAssigned the room assigned
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByroomAssigned(boolean roomAssigned);

	/**
	 * Returns the asset where roomAssigned = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param roomAssigned the room assigned
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 */
	public Asset fetchByroomAssigned(
		boolean roomAssigned, boolean useFinderCache);

	/**
	 * Removes the asset where roomAssigned = &#63; from the database.
	 *
	 * @param roomAssigned the room assigned
	 * @return the asset that was removed
	 */
	public Asset removeByroomAssigned(boolean roomAssigned)
		throws NoSuchAssetException;

	/**
	 * Returns the number of assets where roomAssigned = &#63;.
	 *
	 * @param roomAssigned the room assigned
	 * @return the number of matching assets
	 */
	public int countByroomAssigned(boolean roomAssigned);

	/**
	 * Caches the asset in the entity cache if it is enabled.
	 *
	 * @param asset the asset
	 */
	public void cacheResult(Asset asset);

	/**
	 * Caches the assets in the entity cache if it is enabled.
	 *
	 * @param assets the assets
	 */
	public void cacheResult(java.util.List<Asset> assets);

	/**
	 * Creates a new asset with the primary key. Does not add the asset to the database.
	 *
	 * @param assetId the primary key for the new asset
	 * @return the new asset
	 */
	public Asset create(long assetId);

	/**
	 * Removes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset that was removed
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public Asset remove(long assetId) throws NoSuchAssetException;

	public Asset updateImpl(Asset asset);

	/**
	 * Returns the asset with the primary key or throws a <code>NoSuchAssetException</code> if it could not be found.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset
	 * @throws NoSuchAssetException if a asset with the primary key could not be found
	 */
	public Asset findByPrimaryKey(long assetId) throws NoSuchAssetException;

	/**
	 * Returns the asset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset, or <code>null</code> if a asset with the primary key could not be found
	 */
	public Asset fetchByPrimaryKey(long assetId);

	/**
	 * Returns all the assets.
	 *
	 * @return the assets
	 */
	public java.util.List<Asset> findAll();

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
	public java.util.List<Asset> findAll(int start, int end);

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
	public java.util.List<Asset> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator);

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
	public java.util.List<Asset> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Asset>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the assets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of assets.
	 *
	 * @return the number of assets
	 */
	public int countAll();

}