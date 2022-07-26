import React, { useEffect, useState } from 'react';
// import '../..css/index.css';
import Multiselect from 'multiselect-react-dropdown';
import axios from 'axios';
// import {Paper} from '@mui/material';
// import axios from "axios";
const Meeting = () => {
    const [internalInput, setInternalValue] = useState([]);
    const [ext, setExt] = useState([]);
    const [room, setRoom] = useState([]);
    const [user, setUser] = useState({
        name: '', status: false, agree: false
    });

    const [internalGuestOption, setInternalGuestOption] = useState([]);
    const [assetOption, setAssettOption] = useState([]);

    useEffect(() => {
        getRoom();

        console.log("-------->>>.>..>..>.....");
        axios.get("https://jsonplaceholder.typicode.com/users").then((response) => {
            console.log(response);
            const getEmployeeName = [];
            response.data.forEach(element => {
                getEmployeeName.push(element.name);
                console.log(element);
            });
            setInternalGuestOption(getEmployeeName);
            setAssettOption(getEmployeeName)
        });
    }, []);

    const getRoom = () => {
        const roomArr = [];
        axios.get('http://localhost:8080/o/meeting-room/?p_auth=' + Liferay.authToken

        ).then((response) => {
            console.log(response);

            response.data.list.forEach(element => {
                console.log('................>>>>>>>>>>.........Element ..' + element);
                roomArr.push(element);
            });

            setRoom(roomArr)
        });


    }

    // const getEmployeedata = async () => {
    // const getEmployeeName = [];
    // const reqData = await fetch("https://jsonplaceholder.typicode.com/users");
    // const resData = await reqData.json();
    // console.log(resData);
    // resData.forEach(element => {
    // getEmployeeName.push(element.name);
    // console.log(element);
    // });
    // setInternalGuestOption(getEmployeeName);
    // setAssettOption(getEmployeeName)
    // }



    return (
        <div>

            <div className='container mt-4 mb-4 pt-2 pb-2'>
                <div className='row '>
                    <div className='col-md-12'>


                        <div className="card _shadow ">
                            <h2 className='card-title text-center mt-4'>Meeting</h2>
                            <hr />

                            <form id='formId'>
                                <div className="card-body border-color">


                                    <div className='row'>
                                        <div className='col'>

                                            <div className="mb-3">
                                                <label for="title" className="form-label">Title</label>
                                                <input type="text" className="form-control" id="title" />
                                            </div>
                                        </div>
                                        <div className='col'>
                                            <div className="mb-3">
                                                <label for="schedule" className="form-label">Schedule</label>
                                                <input type="datetime-local" className=" form-control" id="schedule" />
                                            </div>
                                        </div>
                                        <div className='col'>
                                            <div className='mb-3'>
                                                <label for="location">Location</label>
                                                <select className='form-control ' id="location" name="location">
                                                    <option value="Noida">Noida</option>
                                                    <option value="Delhi">Delhi</option>
                                                    <option value="Kolkata">Kolkata</option>
                                                    <option value="Banglore">Banglore</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>






                                    <div className='row'>
                                        <div className='col'>
                                            <div className='mb-3'>
                                                <label for="asset-type">Asset Name (Type)</label>
                                                <Multiselect showCheckbox isObject={false} options={assetOption} />
                                            </div>
                                        </div>
                                        <div className='col'>
                                            <div className='mb-3'>
                                                <label for="meeting-type">Meeting Type</label>
                                                <select className='form-control ' id="meeting-type" name="meeting-type">
                                                    <option value="Physical">Physical</option>
                                                    <option value="Remote">Remote</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div className='col'>

                                            <div className='mb-3'>
                                                <label for="meeting-room">Meeting Room</label>
                                                <select className='form-control ' id="meeting-room" name="meeting-room">
                                                    {
                                                        room.map((data) =>

                                                            <option  value={data.roomNo}>{data.roomNo}</option>

                                                        )
                                                    }


                                                </select>
                                            </div>
                                        </div>
                                    </div>

                                    <div className='row'>
                                        <div className='col'>
                                            <div className='mb-3'>
                                                <label for="hosted-by">Hosted By</label>
                                                <select className='form-control ' id="hosted-by" name="hosted-by">
                                                    <option value="HR-Ravi">HR-Ravi</option>
                                                    <option value="HR-Urvashi">HR-Urvashi</option>
                                                    <option value="Manager-Ashwani">HR-Ashwani</option>
                                                    <option value="HR-Hemant">HR-Hemant</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div className='col'>
                                            <div className='mb-3'>
                                                <label for="created-by">Created  By</label>
                                                <select className='form-control ' id="created-by" name="created-by">
                                                    <option value="Ravi">Ravi</option>
                                                    <option value="Urvashi">Urvashi</option>
                                                    <option value="Ashwani">Ashwani</option>
                                                    <option value="Hemant">Hemant</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div className='col'>
                                            <div className='mb-3'>
                                                <label for="created-by">Agenda </label>
                                                <input type="file" className="form-control" id="title" />
                                            </div>
                                        </div>
                                    </div>



                                    <div className='row'>

                                        <div className='col'>
                                            <div className='mb-3'>
                                                <label for="internal-guest">Internal Guest</label>
                                                <Multiselect
                                                    isObject={false}
                                                    options={internalGuestOption}
                                                    onSelect={(e) => { console.log(e) }}
                                                    onRemove={(e) => { console.log(e) }}
                                                />
                                            </div>
                                        </div>
                                        <div className='col'>

                                            <div className='mb-3'>
                                                <label for="external-guest">External-Guest </label>
                                                <input type="text" className="form-control" onChange={e => { handleExtChange() }} id="external-guest" />


                                            </div>
                                        </div>
                                    </div>
                                    <div className='row'>
                                        <div className='col'>
                                            <div className="mb-3">
                                                <label for="decription" className="form-label">Description</label>
                                                <textarea className="form-control" id="decription" rows="3"></textarea>
                                            </div>
                                        </div>
                                    </div>
                                    <div className='row'>
                                        <div className='col'>
                                            <label>Meeting Link</label>
                                            <input className='form-control border'></input>
                                        </div>
                                    </div>

                                </div>
                                <hr />
                                <div className='text-center mb-4'>
                                    <button type="submit" className="btn btn-sm btn-outline-success mr-4">Submit</button>
                                    <button type="reset" className="btn btn-sm btn-outline-danger mr-2">Cancel</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    );
}
export default Meeting;