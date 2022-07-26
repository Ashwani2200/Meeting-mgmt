import React, { useState } from 'react';
import axios from 'axios';

const Asset = () => {
    const [name, setName] = useState("");
    const [assetModel, setAssetModel] = useState("");
    const [purchaseDate, setPurchaseDate] = useState("");
    const [serialNo, setSerialNo] = useState("");
    const [status, setStatus] = useState(false);
    const [roomAssigned, setRoomAssigned] = useState(false);

    const statusHandleChange = () => {
        setStatus(!status);
    };

    const roomAssigneHandleChange = () => {
        setRoomAssigned(!roomAssigned);
    };

    const saveAsset = () => {
        alert(serialNo + status + assetModel + roomAssigned + purchaseDate + name)
        axios.post(
            `http://localhost:8080/api/jsonws/meeting.asset/add-asset/name/${name}/asset-model/${assetModel}/purchase-date/${purchaseDate}/serial-no/${serialNo}/status/${status}/room-assigned/${roomAssigned}/?p_auth=`+ Liferay.authToken
        )
            .then((res) => {
                console.log(res.data);
            })
    }

    return (

        <div className="Asset"  >
            
            <form >
                <div className="container" >
                    <div className='row'>
                        <div className='col-md-8 offset-md-2'>
                            <h4 className='text-center mt-4 pt-4'>Asset</h4>
                            <hr />

                            <div className='row pt-4'>
                                <div className='col'>
                                    <label>Name</label>
                                    <input className='form-control' type="text" name="name" onChange={(e) => { setName(e.target.value) }} />
                                </div>
                                <div className='col'>
                                    <label>Serial No.</label>
                                    <input className='form-control' type="text" name="serialNo" onChange={(e) => { setSerialNo(e.target.value) }} />
                                </div>
                            </div>
                            <div className='row mt-4'>
                                <div className='col'>
                                    <label>Asset Model</label>
                                    <select className='form-control' name="assetModel" onChange={(e) => { setAssetModel(e.target.value) }}>
                                        <option>Select Options</option>
                                        <option>Laptop</option>
                                        <option>LCD</option>
                                        <option>Computer</option>
                                    </select>
                                </div>
                                <div className='col '>
                                    <label>Purchase Date</label>
                                    <input className='form-control' type="date" name="purchaseDate" onChange={(e) => { setPurchaseDate(e.target.value) }} />
                                </div>
                            </div>
                            <div className='row mt-3'>
                                <div className='col ms-5' >
                                    <label>Status</label>
                                    <input type="checkbox" name="status" onChange={(e) => { statusHandleChange(e.target.value) }} />
                                </div>
                                <div className='col '>
                                    <label>Room Assigned</label>
                                    <input type="checkbox" name="roomAssigned" onChange={(e) => { roomAssigneHandleChange(e.target.value) }} />
                                </div>
                            </div>
                            <hr />
                            <div className='text-center pb-3'>
                                <button type='submit' className='btn btn-sm btn-outline-primary' onClick={saveAsset}>Save Asset</button>
                            </div>
                        </div>
                    </div>
                </div >
            </form>
        </div >
    );


}

export default Asset;