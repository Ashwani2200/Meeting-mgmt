import React, { Fragment } from "react";
const Room = () => {



	return (
		<Fragment>
			
			<div className='container mt-4 mb-4'>
				<div className='row '>
					<div className='col-md-6 offset-md-3'>
						

						<div className="card  p-4">
							<h2 className='card-title text-center mt-4'>Meeting</h2>
							<hr />

							<form id='formId'>
								<div className="card-body border-color">


									<div className='row'>
										<div className='col'>

											<div className="mb-3">
												<label for="floorNo" className="form-label">Floor No.</label>
												<input type="text" className="form-control" id="floorNo" />
											</div>
										</div>
										<div className='col'>
											<div className="mb-3">
												<label for="roomNo" className="form-label">Room No.</label>
												<input type="text" className=" form-control" id="roomNo" />
											</div>
										</div>

									</div>
									<div className='row'>
										<div className='col'>
											<div className="mb-3">
												<label for="capacity" className="form-label">Capacity</label>
												<input type="text" className=" form-control" id="capacity" />
											</div>
										</div>
										<div className='col'>
											<div className="mb-3">
												<label for="Building" className="form-label">Building</label>
												<input type="text" className="form-control" id="Building" />
											</div>
										</div>

									</div>
								</div>
								<hr />
								<div className='text-center mb-4'>
									<button type="submit" className="btn btn-sm btn-outline-success mr-4">Add Room</button>
									<button type="reset" className="btn btn-sm btn-outline-danger mr-2">Cancel</button>
								</div>
							</form>
						</div>
					</div>
				</div>

			</div>
		</Fragment>
	);
}
export default Room;