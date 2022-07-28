import React from 'react';
import ReactDOM from 'react-dom';
import Meeting from './component/Meeting';
import { BrowserRouter, Routes, Route, Outlet } from 'react-router-dom';
import Navbar from './layout/Navbar';
import Location from './component/Location';
import Asset from './component/Asset';
import Room from './component/Room';
import RoomList from './component/RoomList';
import ViewAsset from './component/ViewAsset';


const App = () => {
	return (
		<div>

			<BrowserRouter>
			
				<Navbar></Navbar>
				<Routes>

					<Route exact path='/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/meeting' element={<Meeting />}></Route>
					<Route exact path='/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/location' element={<Location />}></Route>
					<Route exact path='/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/asset' element={<Asset />}></Route>
					<Route exact path='/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/room' element={<Room />}></Route>
					<Route exact path='/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/roomList' element={<RoomList />}></Route>

					<Route exact path='/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/asset' element={<Asset />}></Route>
					<Route exact path='/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/view-asset' element={<ViewAsset />}></Route>
				</Routes>
			</BrowserRouter>
			<Outlet />


			
		</div>
	);

}
export default function (elementId) {
	ReactDOM.render(<App />, document.getElementById(elementId));
}