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

package com.adjecti.meeting.service.persistence.impl;

import com.adjecti.meeting.exception.NoSuchMeetingException;
import com.adjecti.meeting.model.Meeting;
import com.adjecti.meeting.model.impl.MeetingImpl;
import com.adjecti.meeting.model.impl.MeetingModelImpl;
import com.adjecti.meeting.service.persistence.MeetingPersistence;
import com.adjecti.meeting.service.persistence.impl.constants.meetingPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the meeting service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MeetingPersistence.class)
public class MeetingPersistenceImpl
	extends BasePersistenceImpl<Meeting> implements MeetingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MeetingUtil</code> to access the meeting persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MeetingImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the meetings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching meetings
	 */
	@Override
	public List<Meeting> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meetings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	@Override
	public List<Meeting> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meetings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meetings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Meeting> list = null;

		if (useFinderCache) {
			list = (List<Meeting>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Meeting meeting : list) {
					if (!uuid.equals(meeting.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEETING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MeetingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Meeting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findByUuid_First(
			String uuid, OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchByUuid_First(uuid, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchByUuid_First(
		String uuid, OrderByComparator<Meeting> orderByComparator) {

		List<Meeting> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findByUuid_Last(
			String uuid, OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchByUuid_Last(uuid, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchByUuid_Last(
		String uuid, OrderByComparator<Meeting> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Meeting> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where uuid = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting[] findByUuid_PrevAndNext(
			long meetingId, String uuid,
			OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		uuid = Objects.toString(uuid, "");

		Meeting meeting = findByPrimaryKey(meetingId);

		Session session = null;

		try {
			session = openSession();

			Meeting[] array = new MeetingImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, meeting, uuid, orderByComparator, true);

			array[1] = meeting;

			array[2] = getByUuid_PrevAndNext(
				session, meeting, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Meeting getByUuid_PrevAndNext(
		Session session, Meeting meeting, String uuid,
		OrderByComparator<Meeting> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEETING_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MeetingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(meeting)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Meeting> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meetings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Meeting meeting :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(meeting);
		}
	}

	/**
	 * Returns the number of meetings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching meetings
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEETING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "meeting.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(meeting.uuid IS NULL OR meeting.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the meeting where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMeetingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findByUUID_G(String uuid, long groupId)
		throws NoSuchMeetingException {

		Meeting meeting = fetchByUUID_G(uuid, groupId);

		if (meeting == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMeetingException(sb.toString());
		}

		return meeting;
	}

	/**
	 * Returns the meeting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the meeting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof Meeting) {
			Meeting meeting = (Meeting)result;

			if (!Objects.equals(uuid, meeting.getUuid()) ||
				(groupId != meeting.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MEETING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<Meeting> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Meeting meeting = list.get(0);

					result = meeting;

					cacheResult(meeting);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Meeting)result;
		}
	}

	/**
	 * Removes the meeting where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the meeting that was removed
	 */
	@Override
	public Meeting removeByUUID_G(String uuid, long groupId)
		throws NoSuchMeetingException {

		Meeting meeting = findByUUID_G(uuid, groupId);

		return remove(meeting);
	}

	/**
	 * Returns the number of meetings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching meetings
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEETING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"meeting.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(meeting.uuid IS NULL OR meeting.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"meeting.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching meetings
	 */
	@Override
	public List<Meeting> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	@Override
	public List<Meeting> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<Meeting> list = null;

		if (useFinderCache) {
			list = (List<Meeting>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Meeting meeting : list) {
					if (!uuid.equals(meeting.getUuid()) ||
						(companyId != meeting.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_MEETING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MeetingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<Meeting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Meeting> orderByComparator) {

		List<Meeting> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Meeting> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Meeting> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting[] findByUuid_C_PrevAndNext(
			long meetingId, String uuid, long companyId,
			OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		uuid = Objects.toString(uuid, "");

		Meeting meeting = findByPrimaryKey(meetingId);

		Session session = null;

		try {
			session = openSession();

			Meeting[] array = new MeetingImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, meeting, uuid, companyId, orderByComparator, true);

			array[1] = meeting;

			array[2] = getByUuid_C_PrevAndNext(
				session, meeting, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Meeting getByUuid_C_PrevAndNext(
		Session session, Meeting meeting, String uuid, long companyId,
		OrderByComparator<Meeting> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_MEETING_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MeetingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(meeting)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Meeting> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meetings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Meeting meeting :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(meeting);
		}
	}

	/**
	 * Returns the number of meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching meetings
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MEETING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"meeting.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(meeting.uuid IS NULL OR meeting.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"meeting.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBytitle;
	private FinderPath _finderPathWithoutPaginationFindBytitle;
	private FinderPath _finderPathCountBytitle;

	/**
	 * Returns all the meetings where title = &#63;.
	 *
	 * @param title the title
	 * @return the matching meetings
	 */
	@Override
	public List<Meeting> findBytitle(String title) {
		return findBytitle(title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meetings where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	@Override
	public List<Meeting> findBytitle(String title, int start, int end) {
		return findBytitle(title, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meetings where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findBytitle(
		String title, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return findBytitle(title, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meetings where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findBytitle(
		String title, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		title = Objects.toString(title, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBytitle;
				finderArgs = new Object[] {title};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBytitle;
			finderArgs = new Object[] {title, start, end, orderByComparator};
		}

		List<Meeting> list = null;

		if (useFinderCache) {
			list = (List<Meeting>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Meeting meeting : list) {
					if (!title.equals(meeting.getTitle())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEETING_WHERE);

			boolean bindTitle = false;

			if (title.isEmpty()) {
				sb.append(_FINDER_COLUMN_TITLE_TITLE_3);
			}
			else {
				bindTitle = true;

				sb.append(_FINDER_COLUMN_TITLE_TITLE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MeetingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTitle) {
					queryPos.add(title);
				}

				list = (List<Meeting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findBytitle_First(
			String title, OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchBytitle_First(title, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("title=");
		sb.append(title);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the first meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchBytitle_First(
		String title, OrderByComparator<Meeting> orderByComparator) {

		List<Meeting> list = findBytitle(title, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findBytitle_Last(
			String title, OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchBytitle_Last(title, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("title=");
		sb.append(title);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the last meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchBytitle_Last(
		String title, OrderByComparator<Meeting> orderByComparator) {

		int count = countBytitle(title);

		if (count == 0) {
			return null;
		}

		List<Meeting> list = findBytitle(
			title, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where title = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting[] findBytitle_PrevAndNext(
			long meetingId, String title,
			OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		title = Objects.toString(title, "");

		Meeting meeting = findByPrimaryKey(meetingId);

		Session session = null;

		try {
			session = openSession();

			Meeting[] array = new MeetingImpl[3];

			array[0] = getBytitle_PrevAndNext(
				session, meeting, title, orderByComparator, true);

			array[1] = meeting;

			array[2] = getBytitle_PrevAndNext(
				session, meeting, title, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Meeting getBytitle_PrevAndNext(
		Session session, Meeting meeting, String title,
		OrderByComparator<Meeting> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEETING_WHERE);

		boolean bindTitle = false;

		if (title.isEmpty()) {
			sb.append(_FINDER_COLUMN_TITLE_TITLE_3);
		}
		else {
			bindTitle = true;

			sb.append(_FINDER_COLUMN_TITLE_TITLE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MeetingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindTitle) {
			queryPos.add(title);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(meeting)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Meeting> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meetings where title = &#63; from the database.
	 *
	 * @param title the title
	 */
	@Override
	public void removeBytitle(String title) {
		for (Meeting meeting :
				findBytitle(
					title, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(meeting);
		}
	}

	/**
	 * Returns the number of meetings where title = &#63;.
	 *
	 * @param title the title
	 * @return the number of matching meetings
	 */
	@Override
	public int countBytitle(String title) {
		title = Objects.toString(title, "");

		FinderPath finderPath = _finderPathCountBytitle;

		Object[] finderArgs = new Object[] {title};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEETING_WHERE);

			boolean bindTitle = false;

			if (title.isEmpty()) {
				sb.append(_FINDER_COLUMN_TITLE_TITLE_3);
			}
			else {
				bindTitle = true;

				sb.append(_FINDER_COLUMN_TITLE_TITLE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTitle) {
					queryPos.add(title);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TITLE_TITLE_2 =
		"meeting.title = ?";

	private static final String _FINDER_COLUMN_TITLE_TITLE_3 =
		"(meeting.title IS NULL OR meeting.title = '')";

	private FinderPath _finderPathWithPaginationFindBylocation;
	private FinderPath _finderPathWithoutPaginationFindBylocation;
	private FinderPath _finderPathCountBylocation;

	/**
	 * Returns all the meetings where location = &#63;.
	 *
	 * @param location the location
	 * @return the matching meetings
	 */
	@Override
	public List<Meeting> findBylocation(String location) {
		return findBylocation(
			location, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meetings where location = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param location the location
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	@Override
	public List<Meeting> findBylocation(String location, int start, int end) {
		return findBylocation(location, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meetings where location = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param location the location
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findBylocation(
		String location, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return findBylocation(location, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meetings where location = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param location the location
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findBylocation(
		String location, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		location = Objects.toString(location, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBylocation;
				finderArgs = new Object[] {location};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBylocation;
			finderArgs = new Object[] {location, start, end, orderByComparator};
		}

		List<Meeting> list = null;

		if (useFinderCache) {
			list = (List<Meeting>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Meeting meeting : list) {
					if (!location.equals(meeting.getLocation())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEETING_WHERE);

			boolean bindLocation = false;

			if (location.isEmpty()) {
				sb.append(_FINDER_COLUMN_LOCATION_LOCATION_3);
			}
			else {
				bindLocation = true;

				sb.append(_FINDER_COLUMN_LOCATION_LOCATION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MeetingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLocation) {
					queryPos.add(location);
				}

				list = (List<Meeting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findBylocation_First(
			String location, OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchBylocation_First(location, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("location=");
		sb.append(location);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the first meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchBylocation_First(
		String location, OrderByComparator<Meeting> orderByComparator) {

		List<Meeting> list = findBylocation(location, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findBylocation_Last(
			String location, OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchBylocation_Last(location, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("location=");
		sb.append(location);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the last meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchBylocation_Last(
		String location, OrderByComparator<Meeting> orderByComparator) {

		int count = countBylocation(location);

		if (count == 0) {
			return null;
		}

		List<Meeting> list = findBylocation(
			location, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where location = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting[] findBylocation_PrevAndNext(
			long meetingId, String location,
			OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		location = Objects.toString(location, "");

		Meeting meeting = findByPrimaryKey(meetingId);

		Session session = null;

		try {
			session = openSession();

			Meeting[] array = new MeetingImpl[3];

			array[0] = getBylocation_PrevAndNext(
				session, meeting, location, orderByComparator, true);

			array[1] = meeting;

			array[2] = getBylocation_PrevAndNext(
				session, meeting, location, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Meeting getBylocation_PrevAndNext(
		Session session, Meeting meeting, String location,
		OrderByComparator<Meeting> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEETING_WHERE);

		boolean bindLocation = false;

		if (location.isEmpty()) {
			sb.append(_FINDER_COLUMN_LOCATION_LOCATION_3);
		}
		else {
			bindLocation = true;

			sb.append(_FINDER_COLUMN_LOCATION_LOCATION_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MeetingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindLocation) {
			queryPos.add(location);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(meeting)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Meeting> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meetings where location = &#63; from the database.
	 *
	 * @param location the location
	 */
	@Override
	public void removeBylocation(String location) {
		for (Meeting meeting :
				findBylocation(
					location, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(meeting);
		}
	}

	/**
	 * Returns the number of meetings where location = &#63;.
	 *
	 * @param location the location
	 * @return the number of matching meetings
	 */
	@Override
	public int countBylocation(String location) {
		location = Objects.toString(location, "");

		FinderPath finderPath = _finderPathCountBylocation;

		Object[] finderArgs = new Object[] {location};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEETING_WHERE);

			boolean bindLocation = false;

			if (location.isEmpty()) {
				sb.append(_FINDER_COLUMN_LOCATION_LOCATION_3);
			}
			else {
				bindLocation = true;

				sb.append(_FINDER_COLUMN_LOCATION_LOCATION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLocation) {
					queryPos.add(location);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_LOCATION_LOCATION_2 =
		"meeting.location = ?";

	private static final String _FINDER_COLUMN_LOCATION_LOCATION_3 =
		"(meeting.location IS NULL OR meeting.location = '')";

	private FinderPath _finderPathWithPaginationFindBycreatedBy;
	private FinderPath _finderPathWithoutPaginationFindBycreatedBy;
	private FinderPath _finderPathCountBycreatedBy;

	/**
	 * Returns all the meetings where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @return the matching meetings
	 */
	@Override
	public List<Meeting> findBycreatedBy(String createdBy) {
		return findBycreatedBy(
			createdBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meetings where createdBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param createdBy the created by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	@Override
	public List<Meeting> findBycreatedBy(String createdBy, int start, int end) {
		return findBycreatedBy(createdBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meetings where createdBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param createdBy the created by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findBycreatedBy(
		String createdBy, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return findBycreatedBy(createdBy, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meetings where createdBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param createdBy the created by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findBycreatedBy(
		String createdBy, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		createdBy = Objects.toString(createdBy, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBycreatedBy;
				finderArgs = new Object[] {createdBy};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBycreatedBy;
			finderArgs = new Object[] {
				createdBy, start, end, orderByComparator
			};
		}

		List<Meeting> list = null;

		if (useFinderCache) {
			list = (List<Meeting>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Meeting meeting : list) {
					if (!createdBy.equals(meeting.getCreatedBy())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEETING_WHERE);

			boolean bindCreatedBy = false;

			if (createdBy.isEmpty()) {
				sb.append(_FINDER_COLUMN_CREATEDBY_CREATEDBY_3);
			}
			else {
				bindCreatedBy = true;

				sb.append(_FINDER_COLUMN_CREATEDBY_CREATEDBY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MeetingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCreatedBy) {
					queryPos.add(createdBy);
				}

				list = (List<Meeting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findBycreatedBy_First(
			String createdBy, OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchBycreatedBy_First(createdBy, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("createdBy=");
		sb.append(createdBy);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the first meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchBycreatedBy_First(
		String createdBy, OrderByComparator<Meeting> orderByComparator) {

		List<Meeting> list = findBycreatedBy(
			createdBy, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findBycreatedBy_Last(
			String createdBy, OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchBycreatedBy_Last(createdBy, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("createdBy=");
		sb.append(createdBy);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the last meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchBycreatedBy_Last(
		String createdBy, OrderByComparator<Meeting> orderByComparator) {

		int count = countBycreatedBy(createdBy);

		if (count == 0) {
			return null;
		}

		List<Meeting> list = findBycreatedBy(
			createdBy, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting[] findBycreatedBy_PrevAndNext(
			long meetingId, String createdBy,
			OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		createdBy = Objects.toString(createdBy, "");

		Meeting meeting = findByPrimaryKey(meetingId);

		Session session = null;

		try {
			session = openSession();

			Meeting[] array = new MeetingImpl[3];

			array[0] = getBycreatedBy_PrevAndNext(
				session, meeting, createdBy, orderByComparator, true);

			array[1] = meeting;

			array[2] = getBycreatedBy_PrevAndNext(
				session, meeting, createdBy, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Meeting getBycreatedBy_PrevAndNext(
		Session session, Meeting meeting, String createdBy,
		OrderByComparator<Meeting> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEETING_WHERE);

		boolean bindCreatedBy = false;

		if (createdBy.isEmpty()) {
			sb.append(_FINDER_COLUMN_CREATEDBY_CREATEDBY_3);
		}
		else {
			bindCreatedBy = true;

			sb.append(_FINDER_COLUMN_CREATEDBY_CREATEDBY_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MeetingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCreatedBy) {
			queryPos.add(createdBy);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(meeting)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Meeting> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meetings where createdBy = &#63; from the database.
	 *
	 * @param createdBy the created by
	 */
	@Override
	public void removeBycreatedBy(String createdBy) {
		for (Meeting meeting :
				findBycreatedBy(
					createdBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(meeting);
		}
	}

	/**
	 * Returns the number of meetings where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @return the number of matching meetings
	 */
	@Override
	public int countBycreatedBy(String createdBy) {
		createdBy = Objects.toString(createdBy, "");

		FinderPath finderPath = _finderPathCountBycreatedBy;

		Object[] finderArgs = new Object[] {createdBy};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEETING_WHERE);

			boolean bindCreatedBy = false;

			if (createdBy.isEmpty()) {
				sb.append(_FINDER_COLUMN_CREATEDBY_CREATEDBY_3);
			}
			else {
				bindCreatedBy = true;

				sb.append(_FINDER_COLUMN_CREATEDBY_CREATEDBY_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCreatedBy) {
					queryPos.add(createdBy);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CREATEDBY_CREATEDBY_2 =
		"meeting.createdBy = ?";

	private static final String _FINDER_COLUMN_CREATEDBY_CREATEDBY_3 =
		"(meeting.createdBy IS NULL OR meeting.createdBy = '')";

	private FinderPath _finderPathWithPaginationFindByhostedBy;
	private FinderPath _finderPathWithoutPaginationFindByhostedBy;
	private FinderPath _finderPathCountByhostedBy;

	/**
	 * Returns all the meetings where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @return the matching meetings
	 */
	@Override
	public List<Meeting> findByhostedBy(String hostedBy) {
		return findByhostedBy(
			hostedBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meetings where hostedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param hostedBy the hosted by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	@Override
	public List<Meeting> findByhostedBy(String hostedBy, int start, int end) {
		return findByhostedBy(hostedBy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the meetings where hostedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param hostedBy the hosted by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findByhostedBy(
		String hostedBy, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return findByhostedBy(hostedBy, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meetings where hostedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param hostedBy the hosted by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	@Override
	public List<Meeting> findByhostedBy(
		String hostedBy, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		hostedBy = Objects.toString(hostedBy, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByhostedBy;
				finderArgs = new Object[] {hostedBy};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByhostedBy;
			finderArgs = new Object[] {hostedBy, start, end, orderByComparator};
		}

		List<Meeting> list = null;

		if (useFinderCache) {
			list = (List<Meeting>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Meeting meeting : list) {
					if (!hostedBy.equals(meeting.getHostedBy())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MEETING_WHERE);

			boolean bindHostedBy = false;

			if (hostedBy.isEmpty()) {
				sb.append(_FINDER_COLUMN_HOSTEDBY_HOSTEDBY_3);
			}
			else {
				bindHostedBy = true;

				sb.append(_FINDER_COLUMN_HOSTEDBY_HOSTEDBY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MeetingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindHostedBy) {
					queryPos.add(hostedBy);
				}

				list = (List<Meeting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findByhostedBy_First(
			String hostedBy, OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchByhostedBy_First(hostedBy, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hostedBy=");
		sb.append(hostedBy);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the first meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchByhostedBy_First(
		String hostedBy, OrderByComparator<Meeting> orderByComparator) {

		List<Meeting> list = findByhostedBy(hostedBy, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	@Override
	public Meeting findByhostedBy_Last(
			String hostedBy, OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		Meeting meeting = fetchByhostedBy_Last(hostedBy, orderByComparator);

		if (meeting != null) {
			return meeting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hostedBy=");
		sb.append(hostedBy);

		sb.append("}");

		throw new NoSuchMeetingException(sb.toString());
	}

	/**
	 * Returns the last meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public Meeting fetchByhostedBy_Last(
		String hostedBy, OrderByComparator<Meeting> orderByComparator) {

		int count = countByhostedBy(hostedBy);

		if (count == 0) {
			return null;
		}

		List<Meeting> list = findByhostedBy(
			hostedBy, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting[] findByhostedBy_PrevAndNext(
			long meetingId, String hostedBy,
			OrderByComparator<Meeting> orderByComparator)
		throws NoSuchMeetingException {

		hostedBy = Objects.toString(hostedBy, "");

		Meeting meeting = findByPrimaryKey(meetingId);

		Session session = null;

		try {
			session = openSession();

			Meeting[] array = new MeetingImpl[3];

			array[0] = getByhostedBy_PrevAndNext(
				session, meeting, hostedBy, orderByComparator, true);

			array[1] = meeting;

			array[2] = getByhostedBy_PrevAndNext(
				session, meeting, hostedBy, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Meeting getByhostedBy_PrevAndNext(
		Session session, Meeting meeting, String hostedBy,
		OrderByComparator<Meeting> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MEETING_WHERE);

		boolean bindHostedBy = false;

		if (hostedBy.isEmpty()) {
			sb.append(_FINDER_COLUMN_HOSTEDBY_HOSTEDBY_3);
		}
		else {
			bindHostedBy = true;

			sb.append(_FINDER_COLUMN_HOSTEDBY_HOSTEDBY_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MeetingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindHostedBy) {
			queryPos.add(hostedBy);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(meeting)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Meeting> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the meetings where hostedBy = &#63; from the database.
	 *
	 * @param hostedBy the hosted by
	 */
	@Override
	public void removeByhostedBy(String hostedBy) {
		for (Meeting meeting :
				findByhostedBy(
					hostedBy, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(meeting);
		}
	}

	/**
	 * Returns the number of meetings where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @return the number of matching meetings
	 */
	@Override
	public int countByhostedBy(String hostedBy) {
		hostedBy = Objects.toString(hostedBy, "");

		FinderPath finderPath = _finderPathCountByhostedBy;

		Object[] finderArgs = new Object[] {hostedBy};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MEETING_WHERE);

			boolean bindHostedBy = false;

			if (hostedBy.isEmpty()) {
				sb.append(_FINDER_COLUMN_HOSTEDBY_HOSTEDBY_3);
			}
			else {
				bindHostedBy = true;

				sb.append(_FINDER_COLUMN_HOSTEDBY_HOSTEDBY_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindHostedBy) {
					queryPos.add(hostedBy);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_HOSTEDBY_HOSTEDBY_2 =
		"meeting.hostedBy = ?";

	private static final String _FINDER_COLUMN_HOSTEDBY_HOSTEDBY_3 =
		"(meeting.hostedBy IS NULL OR meeting.hostedBy = '')";

	public MeetingPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Meeting.class);

		setModelImplClass(MeetingImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the meeting in the entity cache if it is enabled.
	 *
	 * @param meeting the meeting
	 */
	@Override
	public void cacheResult(Meeting meeting) {
		entityCache.putResult(
			MeetingImpl.class, meeting.getPrimaryKey(), meeting);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {meeting.getUuid(), meeting.getGroupId()}, meeting);
	}

	/**
	 * Caches the meetings in the entity cache if it is enabled.
	 *
	 * @param meetings the meetings
	 */
	@Override
	public void cacheResult(List<Meeting> meetings) {
		for (Meeting meeting : meetings) {
			if (entityCache.getResult(
					MeetingImpl.class, meeting.getPrimaryKey()) == null) {

				cacheResult(meeting);
			}
		}
	}

	/**
	 * Clears the cache for all meetings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MeetingImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the meeting.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Meeting meeting) {
		entityCache.removeResult(MeetingImpl.class, meeting);
	}

	@Override
	public void clearCache(List<Meeting> meetings) {
		for (Meeting meeting : meetings) {
			entityCache.removeResult(MeetingImpl.class, meeting);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MeetingImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(MeetingModelImpl meetingModelImpl) {
		Object[] args = new Object[] {
			meetingModelImpl.getUuid(), meetingModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, meetingModelImpl, false);
	}

	/**
	 * Creates a new meeting with the primary key. Does not add the meeting to the database.
	 *
	 * @param meetingId the primary key for the new meeting
	 * @return the new meeting
	 */
	@Override
	public Meeting create(long meetingId) {
		Meeting meeting = new MeetingImpl();

		meeting.setNew(true);
		meeting.setPrimaryKey(meetingId);

		String uuid = PortalUUIDUtil.generate();

		meeting.setUuid(uuid);

		meeting.setCompanyId(CompanyThreadLocal.getCompanyId());

		return meeting;
	}

	/**
	 * Removes the meeting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting that was removed
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting remove(long meetingId) throws NoSuchMeetingException {
		return remove((Serializable)meetingId);
	}

	/**
	 * Removes the meeting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the meeting
	 * @return the meeting that was removed
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting remove(Serializable primaryKey)
		throws NoSuchMeetingException {

		Session session = null;

		try {
			session = openSession();

			Meeting meeting = (Meeting)session.get(
				MeetingImpl.class, primaryKey);

			if (meeting == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMeetingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(meeting);
		}
		catch (NoSuchMeetingException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Meeting removeImpl(Meeting meeting) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(meeting)) {
				meeting = (Meeting)session.get(
					MeetingImpl.class, meeting.getPrimaryKeyObj());
			}

			if (meeting != null) {
				session.delete(meeting);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (meeting != null) {
			clearCache(meeting);
		}

		return meeting;
	}

	@Override
	public Meeting updateImpl(Meeting meeting) {
		boolean isNew = meeting.isNew();

		if (!(meeting instanceof MeetingModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(meeting.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(meeting);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in meeting proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Meeting implementation " +
					meeting.getClass());
		}

		MeetingModelImpl meetingModelImpl = (MeetingModelImpl)meeting;

		if (Validator.isNull(meeting.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			meeting.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (meeting.getCreateDate() == null)) {
			if (serviceContext == null) {
				meeting.setCreateDate(date);
			}
			else {
				meeting.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!meetingModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				meeting.setModifiedDate(date);
			}
			else {
				meeting.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(meeting);
			}
			else {
				meeting = (Meeting)session.merge(meeting);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(MeetingImpl.class, meetingModelImpl, false, true);

		cacheUniqueFindersCache(meetingModelImpl);

		if (isNew) {
			meeting.setNew(false);
		}

		meeting.resetOriginalValues();

		return meeting;
	}

	/**
	 * Returns the meeting with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the meeting
	 * @return the meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMeetingException {

		Meeting meeting = fetchByPrimaryKey(primaryKey);

		if (meeting == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMeetingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return meeting;
	}

	/**
	 * Returns the meeting with the primary key or throws a <code>NoSuchMeetingException</code> if it could not be found.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting findByPrimaryKey(long meetingId)
		throws NoSuchMeetingException {

		return findByPrimaryKey((Serializable)meetingId);
	}

	/**
	 * Returns the meeting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting, or <code>null</code> if a meeting with the primary key could not be found
	 */
	@Override
	public Meeting fetchByPrimaryKey(long meetingId) {
		return fetchByPrimaryKey((Serializable)meetingId);
	}

	/**
	 * Returns all the meetings.
	 *
	 * @return the meetings
	 */
	@Override
	public List<Meeting> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the meetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of meetings
	 */
	@Override
	public List<Meeting> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the meetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of meetings
	 */
	@Override
	public List<Meeting> findAll(
		int start, int end, OrderByComparator<Meeting> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the meetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of meetings
	 */
	@Override
	public List<Meeting> findAll(
		int start, int end, OrderByComparator<Meeting> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Meeting> list = null;

		if (useFinderCache) {
			list = (List<Meeting>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MEETING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MEETING;

				sql = sql.concat(MeetingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Meeting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the meetings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Meeting meeting : findAll()) {
			remove(meeting);
		}
	}

	/**
	 * Returns the number of meetings.
	 *
	 * @return the number of meetings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MEETING);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "meetingId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MEETING;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MeetingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the meeting persistence.
	 */
	@Activate
	public void activate(BundleContext bundleContext) {
		_bundleContext = bundleContext;

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new MeetingModelArgumentsResolver(),
			MapUtil.singletonDictionary(
				"model.class.name", Meeting.class.getName()));

		_finderPathWithPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = _createFinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindBytitle = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBytitle",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"title"}, true);

		_finderPathWithoutPaginationFindBytitle = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytitle",
			new String[] {String.class.getName()}, new String[] {"title"},
			true);

		_finderPathCountBytitle = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBytitle",
			new String[] {String.class.getName()}, new String[] {"title"},
			false);

		_finderPathWithPaginationFindBylocation = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBylocation",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"location"}, true);

		_finderPathWithoutPaginationFindBylocation = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBylocation",
			new String[] {String.class.getName()}, new String[] {"location"},
			true);

		_finderPathCountBylocation = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBylocation",
			new String[] {String.class.getName()}, new String[] {"location"},
			false);

		_finderPathWithPaginationFindBycreatedBy = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycreatedBy",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"createdBy"}, true);

		_finderPathWithoutPaginationFindBycreatedBy = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycreatedBy",
			new String[] {String.class.getName()}, new String[] {"createdBy"},
			true);

		_finderPathCountBycreatedBy = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycreatedBy",
			new String[] {String.class.getName()}, new String[] {"createdBy"},
			false);

		_finderPathWithPaginationFindByhostedBy = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByhostedBy",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hostedBy"}, true);

		_finderPathWithoutPaginationFindByhostedBy = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByhostedBy",
			new String[] {String.class.getName()}, new String[] {"hostedBy"},
			true);

		_finderPathCountByhostedBy = _createFinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByhostedBy",
			new String[] {String.class.getName()}, new String[] {"hostedBy"},
			false);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(MeetingImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();

		for (ServiceRegistration<FinderPath> serviceRegistration :
				_serviceRegistrations) {

			serviceRegistration.unregister();
		}
	}

	@Override
	@Reference(
		target = meetingPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = meetingPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = meetingPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private BundleContext _bundleContext;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MEETING =
		"SELECT meeting FROM Meeting meeting";

	private static final String _SQL_SELECT_MEETING_WHERE =
		"SELECT meeting FROM Meeting meeting WHERE ";

	private static final String _SQL_COUNT_MEETING =
		"SELECT COUNT(meeting) FROM Meeting meeting";

	private static final String _SQL_COUNT_MEETING_WHERE =
		"SELECT COUNT(meeting) FROM Meeting meeting WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "meeting.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Meeting exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Meeting exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MeetingPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	private FinderPath _createFinderPath(
		String cacheName, String methodName, String[] params,
		String[] columnNames, boolean baseModelResult) {

		FinderPath finderPath = new FinderPath(
			cacheName, methodName, params, columnNames, baseModelResult);

		if (!cacheName.equals(FINDER_CLASS_NAME_LIST_WITH_PAGINATION)) {
			_serviceRegistrations.add(
				_bundleContext.registerService(
					FinderPath.class, finderPath,
					MapUtil.singletonDictionary("cache.name", cacheName)));
		}

		return finderPath;
	}

	private Set<ServiceRegistration<FinderPath>> _serviceRegistrations =
		new HashSet<>();
	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class MeetingModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			MeetingModelImpl meetingModelImpl = (MeetingModelImpl)baseModel;

			long columnBitmask = meetingModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(meetingModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						meetingModelImpl.getColumnBitmask(columnName);
				}

				if (finderPath.isBaseModelResult() &&
					(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION ==
						finderPath.getCacheName())) {

					finderPathColumnBitmask |= _ORDER_BY_COLUMNS_BITMASK;
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(meetingModelImpl, columnNames, original);
			}

			return null;
		}

		private static Object[] _getValue(
			MeetingModelImpl meetingModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = meetingModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = meetingModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static final Map<FinderPath, Long>
			_finderPathColumnBitmasksCache = new ConcurrentHashMap<>();

		private static final long _ORDER_BY_COLUMNS_BITMASK;

		static {
			long orderByColumnsBitmask = 0;

			orderByColumnsBitmask |= MeetingModelImpl.getColumnBitmask("title");
			orderByColumnsBitmask |= MeetingModelImpl.getColumnBitmask(
				"dateAndTime");

			_ORDER_BY_COLUMNS_BITMASK = orderByColumnsBitmask;
		}

	}

}