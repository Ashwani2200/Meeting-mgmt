import React, { Fragment, useState, useEffect } from "react";
import { BsFillTrashFill } from "react-icons/bs";
import { GrUpdate } from "react-icons/gr";
import axios from "axios";
import Modal from "react-modal";

const RoomList = () => {
    let subtitle;
    const [modalIsOpen, setIsOpen] = React.useState(false);
    const [updateRoom, setUpdateRoom] = useState([]);
    //  const [assettOption, setAssettOption] = useState([]);
    const [room, setRoom] = useState([]);
    const customStyles = {
        content: {
            top: '50%',
            left: '50%',
            right: 'auto',
            bottom: 'auto',
            marginRight: '-50%',
            width: '70%',

            transform: 'translate(-50%, -50%)',
        },
    };

   

    function updateRoom(data){
        // setUpdateRoom(data)
        console.log("fuck man chal gya"+data)
        // openModal();
    }
    function openModal() {

        setIsOpen(true);


    }

    function afterOpenModal() {
        // references are now sync'd and can be accessed.
        subtitle.style.color = '#f00';
    }

    function closeModal() {
        setIsOpen(false);
    }
    useEffect(() => {

        getRoom();



        // axios.get('http://localhost:8080/o/meeting/45810/?p_auth=' + Liferay.authToken

        // ).then((response) => {
        //     console.log(response.data);
        //     setOne(response.data)
        // });

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
    return (

        <Fragment>
            <div className="container mt-5">
                <button>Hello Lohit sagar mishra ji</button>
                <div className="row">
                    <div className="col-md-12">

                        <div className="card shadow-sm">
                            <div className="card-body">
                                <table className="table table-hover text-center">
                                    <thead>
                                        <tr>
                                            <th scope="col" className="text-center">Id</th>
                                            <th scope="col" className="text-center">Room-No</th>
                                            <th scope="col" className="text-center">Building</th>
                                            <th scope="col" className="text-center">Floor No</th>
                                            <th scope="col" className="text-center">Capacity</th>
                                            <th scope="col" className="text-center">Action </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {
                                            room.map((data, i) =>
                                                <tr key>
                                                    <th scope="row">{i + 1}</th>
                                                    <td >{data.roomNo}</td>
                                                    <td>{data.building}</td>
                                                    <td>{data.floorNo}</td>
                                                    <td>{data.capacity}</td>
                                                    <td>
                                                        <span className="btn btn-sm btn-outline-success mr-2" onClick={() => updateRoom(data)} ><GrUpdate style={{ color: 'black', width: 50 }} />Update</span>
                                                        <span className="btn btn-sm btn-outline-danger mr-2"> <BsFillTrashFill style={{ color: 'black', width: 50 }} />Delete</span>


                                                    </td>
                                                </tr>
                                            )
                                        }


                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>



            <Modal
                isOpen={modalIsOpen}
                onAfterOpen={afterOpenModal}
                onRequestClose={closeModal}
                style={customStyles}
                contentLabel="Example Modal"
            >
                <h2 ref={(_subtitle) => (subtitle = _subtitle)}>Update Meeting Room</h2>

                <div>I am Immortal</div>
                <form id='formId'>
                    <div className="card-body border-color">


                        <div className='row'>
                            <div className='col'>
                                {
                                    console.log(updateRoom)
                                }
                                <div className="mb-3">
                                    <label for="floorNo" className="form-label">Floor No.</label>
                                    <input type="text" value={updateRoom.floorNo} className="form-control" id="floorNo" />
                                </div>
                            </div>
                            <div className='col'>
                                <div className="mb-3">
                                    <label for="roomNo" className="form-label">Room No.</label>
                                    <input type="text" value={updateRoom.roomNo} className=" form-control" id="roomNo" />
                                </div>
                            </div>

                        </div>
                        <div className='row'>
                            <div className='col'>
                                <div className="mb-3">
                                    <label for="capacity" className="form-label">Capacity</label>
                                    <input type="text" value={updateRoom.capacity} className=" form-control" id="capacity" />
                                </div>
                            </div>
                            <div className='col'>
                                <div className="mb-3">
                                    <label for="Building" className="form-label">Building</label>
                                    <input type="text" value={updateRoom.building} className="form-control" id="Building" />
                                </div>
                            </div>

                        </div>
                        <div className="mb-3 text-center">
                            <span className="btn btn-sm btn-outline-success mr-2" onClick={openModal} ><GrUpdate style={{ color: 'black', width: 50 }} />Update</span>
                            <button className="btn btn-sm btn-outline-danger" onClick={closeModal}>close</button>
                        </div>
                    </div>
                    <hr />

                </form>
            </Modal>




        </Fragment>
    );
}
export default RoomList;