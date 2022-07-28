import React from 'react';
import { Link, NavLink } from 'react-router-dom';

const Navbar = () => {
    return (
        <div>
            {/* <div className="field">
                <div  className="control">
                    <input type="text" class="input-text" placeholder=" "></input>
                    <label>Urvashi</label>
                </div>
            </div> */}

            <nav className="navbar navbar-expand-lg navbar-light bg-light">
                <div className="container-fluid">
                    <NavLink className="navbar-brand" to="/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/meeting">Meeting</NavLink>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                                <NavLink className="nav-link active" aria-current="page" to="/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/metting">Home</NavLink>
                            </li>
                            <li className="nav-item">
                                <NavLink className="nav-link" to="/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/location">Meeting Location</NavLink>
                            </li>
                            <li className="nav-item">
                                <NavLink className="nav-link" to="/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/asset">Asset</NavLink>
                            </li>

                            {/* <li className="nav-item dropdown">
                                <a className="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    Room
                                </a>
                                <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
                                    <li><NavLink className="dropdown-item" to="/web/guest/contact/-/meetingreact_INSTANCE_lvkRDTBlFv1M/room">Add Meeting Room</NavLink></li>
                                    <li><NavLink className="dropdown-item" to="/web/guest/contact/-/meetingreact_INSTANCE_lvkRDTBlFv1M/roomList">View Meeting Room</NavLink></li>

                                </ul>
                            </li> */}

                            <li className="nav-item">
                                <NavLink className="nav-link" to="/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/room">Meeting Room</NavLink>
                            </li>
                            <li className="nav-item">
                                <NavLink className="nav-link" to='/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/roomList'>Room</NavLink>
                            </li>
                            <li className="nav-item">
                                <NavLink className="nav-link" to='/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/asset'>Asset</NavLink>
                            </li>
                            <li className="nav-item">
                                <NavLink className="nav-link" to='/web/meeting-management/meeting/-/meetingreact_INSTANCE_I1FnzD7T9hzh/view-asset'>View</NavLink>
                            </li>
                        </ul>
                        <form className="d-flex">
                            <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                            <button className="btn btn-outline-success" type="submit">Search</button>
                        </form>
                    </div>
                </div>
            </nav>
        </div>
    );
}

export default Navbar;