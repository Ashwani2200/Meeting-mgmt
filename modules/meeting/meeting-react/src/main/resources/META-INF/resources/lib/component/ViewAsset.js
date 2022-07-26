import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Router, Link, useNavigate } from 'react-router-dom';


const ViewAsset = () => {

	const [asset, setAsset] = useState([]);


	useEffect(() => {

		axios.get(
			` http://localhost:8080/api/jsonws/meeting.asset/get-all-asset/?p_auth=` + Liferay.authToken
		).then((res) => {
			let assetArr = [];
			res.data.forEach(element => {
				console.log("======>" + element.assetModel);
				assetArr.push(element)
			});

			console.log("======" + assetArr);
			setAsset(assetArr);
		})

	}, [])

	return (
		<div className="ViewAsset">
			{
				console.log("--------------->")
			}

			<div className='container'>
				 <Link to="/web/guest/contact/-/meetingreact_INSTANCE_lvkRDTBlFv1M/asset" className="btn btn-primary">hello</Link>
				
					{/* <Link to="/web/guest/contact/-/meetingreact_INSTANCE_lvkRDTBlFv1M/asset" >
						<Button   className="btn btn-outline-success">Add Asset</Button>
					</Link> */}
				
				<h4 className='text-center mt-4 pt-4'>Asset List</h4>
				<hr />
				<br />
				<table className="table">
					<thead>
						<tr >
							<th scope="col">#</th>
							<th scope="col">Name</th>
							<th scope="col">Serial No</th>
							<th scope="col">Asset Model</th>
							<th scope="col">Purchase Date</th>
							<th scope="col">Status</th>
							<th scope="col">Room Assigned</th>
						</tr>
					</thead>
					<tbody>
						{
							// setAsset ((item) =>
							asset.map((item, i) =>

								<tr key={item.id}>
									<th scope="row">{i + 1}</th>
									<td>{item.assetId}</td>
									<td>{item.assetModel}</td>
									<td>{item.companyId}</td>
									<td>{item.createDate}</td>
									<td>{item.name}</td>
									<td>{item.purchaseDate}</td>
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