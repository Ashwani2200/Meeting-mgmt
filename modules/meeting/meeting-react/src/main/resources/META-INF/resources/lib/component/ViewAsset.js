import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Router, Link, useNavigate } from 'react-router-dom';


const ViewAsset = () => {

	const [assets, setAsset] = useState([]);

	const editAsset = () => {
		alert('edit');
	}

	const deleteAsset = (id) => {
		alert(id);
		axios.delete(
			` http://localhost:8080/api/jsonws/meeting.asset/delete-asset/asset-id/${id}/?p_auth=` + Liferay.authToken
		)
			.then((res) => {
				console.log("asset data id", res);
				getAsset()
			})
	}

	const getAsset = () => {
		axios.get(
			` http://localhost:8080/api/jsonws/meeting.asset/get-all-asset/?p_auth=` + Liferay.authToken
		)
			.then((res) => {
				console.log("asset data", res);
				setAsset(res.data);
			})
	}


	useEffect(() => {
		getAsset()
	}, [])

	return (
		<div className="ViewAsset">
			{
				console.log("--------------->")
			}

			<div className='container'>
				<Link to="/web/guest/contact/-/meetingreact_INSTANCE_lvkRDTBlFv1M/asset" className="btn btn-primary">hello</Link>

				<h4 className='text-center mt-4 pt-4'>Asset List</h4>
				<hr />
				<br />
				<table className="table">
					<thead>
						<tr >
							<th scope="col">Name</th>
                            <th scope="col">Serial No</th>
                            <th scope="col">Asset Model</th>
                            <th scope="col">Purchase Date</th>
                            <th scope="col">Status</th>
                            <th scope="col">Room Assigned</th>
                            <th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						{
							 assets.map((asset, i) =>
                                <tr key={i}>
                                    <td>{asset.assetId}</td>
                                    <td>{asset.name}</td>
                                    <td>{asset.serialNo}</td>
                                    <td>{asset.assetModel}</td>
                                    <td>{asset.purchaseDate}</td>
                                    <td>{asset.status ? 'True' : 'False'}</td>
                                    <td>{asset.roomAssigned ? 'True' : 'False'}</td>
                                    <td>
                                        <button className='btn btn-sm btn-outline-info' onClick={editAsset}>Edit Asset</button>
                                        <button className='btn btn-sm btn-outline-danger' onClick={() => deleteAsset(asset.assetId)}>Delete Asset</button>
                                    </td>
                                </tr>
                            )
						}
					</tbody>
				</table>
			</div>
		</div>
	);
}
export default ViewAsset;